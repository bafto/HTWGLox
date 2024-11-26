# Sprachkonzepte Bericht Hendrik Ziegler

## Aufgabe 1

Aufgabe war es einen Tokenizer für Abfahrten der DB zu schreiben, der einen mit Antlr4 generierten Lexer verwendet.

Die Grammatik, die am Ende herrauskam sah so aus:
```
lexer grammar Abfahrten;

fragment Digit: ([0-9]) ;
fragment Alphanumeric: ([_a-zA-Z0-9äöüÄÖÜß]) ;

// literals
TIME: ( ( [0-1][0-9] | '2'[0-3] ) ':' [0-5][0-9] ) ;
MONTH: 'Jan' | 'Feb' | 'Mär' | 'Apr' | 'Mai' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Okt' | 'Nov' | 'Dez' ;
DAY: 'Mo' | 'Di' | 'Mi' | 'Do' | 'Fr' | 'Sa' | 'So' ;
MONTH_DAY: (Digit)+ '.' ;
NUMBER: (Digit)+ ;
BUS: 'Bus' ;
BAHN: 'S' | 'RB' | 'RE' | 'IRE' | 'FEX' | 'MEX' | 'IC' | 'ICE' ;

// keywords
NICHT: 'nicht' ;
TAEGLICH: 'täglich' ;
NACH: 'nach' ;

// identifier
IDENTIFIER: Alphanumeric+ ;

// symbols
COMMA: ',' ;
// DOT: '.' ;
SEMICOLON: ';' ;
DASH: '-' ;
LPAREN: '(' ;
RPAREN: ')' ;
SLASH: '/' ;

// whitespace
WS: [ \t\r\n]+ -> channel(HIDDEN);
```

In dieser Grammatik finden sich einige Vokabular-Kategorien aus der Vorlesung, namentlich:
    - Whitespace (wird hier übersprungen, da nicht relevant)
    - Identifier (Haltestellen Namen, unbekannte Zug/Bus Arten (wie z.B. "KAT"))
    - Keywords ("nach", "täglich", "nicht")
    - Literale (TIME, MONTH, ...)
    - Symbole (',', ';', etc.)

Nach einem ersten Versuch fand ich auch herraus, das Regeln, die weiter oben definiert sind eine höhere Precedence haben.
Die "IDENTIFIER" Regel muss in dieser Grammatik also unter den Literalen stehen,
da sonst z.B. "Mon" als IDENTIFIER und nicht als DAY erkannt wird.

Es war interessant sich zu überlegen in was für Tokens der Text zerlegt werden sollte.
Sollten z.B. Wochentage oder Monatsabkürzungen einfach als IDENTIFIER gewertet werden? Ich entschied mich dafür,
sie als eigene Token zu lexen, da sie im gegebenen Kontext doch von Haltestellen Namen etc. zu unterscheiden sind.

Eine weitere Überlegung war, wie Haltestellen etc. von anderen Identifiern unterschieden werden.
Am Ende habe ich sie gar nicht unterschieden, sondern denke, dass der Parser das übernehmen sollte.
Letztendlich ist nämlich klar, dass nach einem "nach" ein kompletter Orts/Stadt/Haltestellen Name kommt, welcher dann eben
aus mehreren IDENTIFIERN besteht.

Außerdem habe ich ein Datum nicht als 1 Token ('1. Okt') sondern als MONTH_DAY + MONTH gelext.
Der Grund dafür ist die Aufzählung mehrerer Daten (1., 2., 25. Aug). Wenn Tag + Monat ein einziges Token wären,
könnte so ein Konstrukt nicht trivial geparset werden.

Eine Entscheidung, bei der ich mir nicht sicher bin ob sie gut ist, war es die Fahrzeug Art (Bus, RB, RE...) nicht als IDENTIFIER
sondern als eigenes Keyword einzubauen. Meine Überlegung war es, dass 95% aller Fälle mit Keywords abgedeckt werden können
und sollte man dann doch so etwas wie den KAT entdecken (den es wohl nur in Konstanz/FN gibt?) so könnte man diese Sonderfälle
extra als IDENTIFIER behandeln.

Der Tokenizer ist nicht sehr interessant, aber hier ein Beispiel Input und Output:

Input:
```
09:45 Bus 700 nach Bahnhof, Ravensburg
Mo - Mi
nicht 20. Mai
```

Output:
```
  1: TIME("09:45")
  1: BUS("Bus")
  1: NUMBER("700")
  1: NACH("nach")
  1: IDENTIFIER("Bahnhof")
  1: COMMA(",")
  1: IDENTIFIER("Ravensburg")
  2: DAY("Mo")
  2: DASH("-")
  2: DAY("Mi")
  3: NICHT("nicht")
  3: MONTH_DAY("20.")
  3: MONTH("Mai")

With Whitespace:

  1: TIME("09:45")
  1: WS(" ")
  1: BUS("Bus")
  1: WS(" ")
  1: NUMBER("700")
  1: WS(" ")
  1: NACH("nach")
  1: WS(" ")
  1: IDENTIFIER("Bahnhof")
  1: COMMA(",")
  1: WS(" ")
  1: IDENTIFIER("Ravensburg")
  1: WS("\r\n")
  2: DAY("Mo")
  2: WS(" ")
  2: DASH("-")
  2: WS(" ")
  2: DAY("Mi")
  2: WS("\r\n")
  3: NICHT("nicht")
  3: WS(" ")
  3: MONTH_DAY("20.")
  3: WS(" ")
  3: MONTH("Mai")
  3: WS("\r\n")

```

## Aufgabe 2

a)

Ich habe als Basis für meine Sprache [Lox](https://craftinginterpreters.com/the-lox-language.html) gewählt und habe vor
dieses um Operatoren und Typisierung zu erweitern um am Ende bei der noch nicht finalen Sprache "HTWGLox" herauszukommen.
Der Code kann auf [Github](https://github.com/bafto/HTWGLox) gefunden werden.

Ein Hello-World in HTWGLox sieht so aus:
```
print "Hello World";
```
Und FizzBuzz so:
```
for var i: num = 1; i < 30; i = i + 1 {
  if i % 5 == 0 && i % 3 == 0 {
    print "FizzBuzz";
  } else if i % 3 == 3 {
    print "Fizz";
  } else if i % 5 == 0 {
    print "Buzz";
  } else {
    print i;
  }
}
```

Wer lox kennt wird bemerken, dass ich hier den % Operator hinzugefügt habe, Typisierung für Variablen (var i: num),
und des Stils wegen einige Klammern bei Bedingungen und Schleifen weggelassen habe.

Die Lexer und Parser Grammatik sehen im Moment wie unten angegeben aus, werden sich aber sicherlich noch deutlich verändern.

Lexer Grammar:
```java
lexer grammar HTWGLoxLexer;

fragment Digit: ([0-9]) ;
fragment Alpha: ([_a-zA-ZäöüÄÖÜß]) ;
fragment Alphanumeric: ([_a-zA-Z0-9äöüÄÖÜß]) ;

// literals
NUMBER_LITERAL: Digit+ ('.' Digit+)? ;
STRING_LITERAL: '"' (~["])* '"' ;
TRUE: 'true' ;
FALSE: 'false' ;

// keywords
FUNC: 'func' ;
RETURN: 'return' ;
VAR: 'var' ;
NUM: 'num' ;
STR: 'str' ;
BOOL: 'bool' ;
PRINT: 'print' ;
IF: 'if' ;
ELSE: 'else' ;
FOR: 'for' ;

// identifier
IDENTIFIER: Alpha Alphanumeric* ;

// symbols
COMMA: ',' ;
COLON: ':' ;
SEMICOLON: ';' ;
LPAREN: '(' ;
RPAREN: ')' ;
LCBRACE: '{' ;
RCBRACE: '}' ;
ARROW: '->' ;
DASH: '-' ;
SLASH: '/' ;
STAR: '*' ;
PLUS: '+' ;
NOT_EQUAL: '!=' ;
EXCLAMATION_MARK: '!' ;
EQUAL: '==' ;
ASSIGN: '=' ;
GREATER_EQUAL: '>=' ;
LESS_EQUAL: '<=' ;
LESS: '<' ;
GREATER: '>' ;
PERCENT: '%' ;
AND: '&&' ;
OR: '||' ;

// whitespace
WS: [ \t\r\n]+ -> channel(HIDDEN) ;

COMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;

LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;
```

Parser grammar:
```java
parser grammar HTWGLoxParser;

options { tokenVocab=HTWGLoxLexer; }

program         : ( declaration | statement )* EOF ;

// declarations

declaration     : func_decl | var_decl ;

func_decl       : 'func' IDENTIFIER '(' param_list ')' ('->' type)? block_stmt ;

param_list      : ( typed_name (',' typed_name)* )? ;

var_decl        : 'var' typed_name '=' expression ';' ;

typed_name      : IDENTIFIER ':' type ;

type            : NUM | STR | BOOL ;

// statements

statement       : print_stmt | if_stmt | for_stmt | assign_stmt | return_stmt | expression_stmt | block_stmt ;

print_stmt      : 'print' expression ';' ;

if_stmt         : 'if' expression statement ('else' statement)? ;

for_stmt        : 'for' var_decl? expression ';' assign? block_stmt ;

assign_stmt     : assign ';' ;

assign          : IDENTIFIER '=' expression ;

return_stmt     : 'return' expression ';' ;

expression_stmt : expression ';' ;

block_stmt      : '{' statement* '}' ;

// expressions

expression      : bool_or_expr ;

bool_or_expr    : bool_and_expr |
                bool_or_expr BOOL_OR bool_or_expr  ;

bool_and_expr   : equality_expr |
                bool_and_expr BOOL_AND bool_and_expr ;

equality_expr   : comparison_expr |
                equality_expr EQUAL equality_expr |
                equality_expr UNEQUAL equality_expr ;

comparison_expr : term_expr |
                  comparison_expr LESS_EQUAL comparison_expr |
                  comparison_expr GREATER_EQUAL comparison_expr |
                  comparison_expr LESS comparison_expr |
                  comparison_expr GREATER comparison_expr ;

term_expr       : factor_expr |
                  term_expr PLUS term_expr |
                  term_expr MINUS term_expr ;

factor_expr     : negation_expr |
                  factor_expr STAR factor_expr |
                  factor_expr SLASH factor_expr |
                  factor_expr PERCENT factor_expr ;

negation_expr   : call_expr |
                  MINUS negation_expr |
                  EXCLAMATION_MARK negation_expr ;

call_expr       : primary_expr | 
                  IDENTIFIER '(' arg_list ')' ;

arg_list        : ( expression (',' expression)* )? ;

primary_expr    : grouping_expr | literal | IDENTIFIER ;

grouping_expr   : '(' expression ')' ;

literal         : NUMBER_LITERAL | STRING_LITERAL | TRUE | FALSE ;
```

Der ParseTree des oben gezeigten Hello-World ist denkbar simpel:
![Hello World](hello_world_gui.png)
Der ParseTree für FizzBuzz ist schon deutlich größer:
![FizzBuzz](fizz_buzz_gui.png)

Um den Daraus generierten ParseTree in einen AST umzuwandeln habe ich folgende Klassen definiert:
- AssignStmt.java
- BinaryExpr.java
- BlockStmt.java
- BoolLiteral.java
- CallExpr.java
- Declaration.java
- ExprStmt.java
- Expression.java
- ForStmt.java
- FuncDecl.java
- Identifier.java
- IfStmt.java
- Node.java
- NumberLiteral.java
- PrintStmt.java
- Program.java
- ReturnStmt.java
- Statement.java
- StringLiteral.java
- Type.java
- UnaryExpr.java
- VarDecl.java

Diese Klassen sehen Beispielweise so aus:
```java
package ast;

public class BinaryExpr implements Expression {
  public final Expression lhs;
  public final BinaryOp op;
  public final Expression rhs;

  public BinaryExpr(final Expression lhs, final BinaryOp op, final Expression rhs) {
    this.lhs = lhs;
    this.op = op;
    this.rhs = rhs;
  }

  public String toString() {
    return String.format(
        "BinaryExpr(lhs = %s, op = %s, rhs = %s)", lhs.toString(), op.toString(), rhs.toString());
  }

  enum BinaryOp {
    PLUS,
    MINUS,
    MULT,
    DIV,
    MOD,
    EQUAL,
    UNEQUAL,
    LESS,
    GREATER,
    LESS_EQUAL,
    GREATER_EQUAL,
    AND,
    OR,
  }
}
```
und werden beispielweise so aus dem ParseTree generiert:

```java
    @Override
    public void exitComparison_expr(Comparison_exprContext ctx) {
      if (ctx.LESS_EQUAL() != null) {
        Expression rhs = (Expression) nodes.pop();
        Expression lhs = (Expression) nodes.pop();
        nodes.add(new BinaryExpr(lhs, BinaryOp.LESS_EQUAL, rhs));
      } else if (ctx.GREATER_EQUAL() != null) {
        Expression rhs = (Expression) nodes.pop();
        Expression lhs = (Expression) nodes.pop();
        nodes.add(new BinaryExpr(lhs, BinaryOp.GREATER_EQUAL, rhs));
      } else if (ctx.LESS() != null) {
        Expression rhs = (Expression) nodes.pop();
        Expression lhs = (Expression) nodes.pop();
        nodes.add(new BinaryExpr(lhs, BinaryOp.LESS, rhs));
      } else if (ctx.GREATER() != null) {
        Expression rhs = (Expression) nodes.pop();
        Expression lhs = (Expression) nodes.pop();
        nodes.add(new BinaryExpr(lhs, BinaryOp.GREATER, rhs));
      }
    }
```

Die oben gezeigten Hello-World und FizzBuzz Programme sehen als AST nun so aus:

HelloWorld AST:
```
Program.printString() = Program(nodes = PrintStmt(rhs = StringLiteral(val = Hello World));)
```

FizzBuzz AST:
```
Program.printString() = Program(nodes = ForStmt(decl = VarDecl(name = Identifier(name = i), type = NUM, initializer = Numbe
rLiteral(val = 1.00000)), condition = BinaryExpr(lhs = Identifier(name = i), op = LESS, rhs = NumberLiteral(val = 30.0000))
, end_stmt = AssignStmt(name = Identifier(name = i), Expr = BinaryExpr(lhs = Identifier(name = i), op = PLUS, rhs = NumberL
iteral(val = 1.00000))), body = BlockStmt(IfStmt(condition = BinaryExpr(lhs = BinaryExpr(lhs = BinaryExpr(lhs = Identifier(
name = i), op = MOD, rhs = NumberLiteral(val = 5.00000)), op = EQUAL, rhs = NumberLiteral(val = 0.00000)), op = AND, rhs = 
BinaryExpr(lhs = BinaryExpr(lhs = Identifier(name = i), op = MOD, rhs = NumberLiteral(val = 3.00000)), op = EQUAL, rhs = Nu
mberLiteral(val = 0.00000))), body = BlockStmt(PrintStmt(rhs = StringLiteral(val = FizzBuzz));), else_body = IfStmt(conditi
on = BinaryExpr(lhs = BinaryExpr(lhs = Identifier(name = i), op = MOD, rhs = NumberLiteral(val = 3.00000)), op = EQUAL, rhs
 = NumberLiteral(val = 3.00000)), body = BlockStmt(PrintStmt(rhs = StringLiteral(val = Fizz));), else_body = IfStmt(conditi
on = BinaryExpr(lhs = BinaryExpr(lhs = Identifier(name = i), op = MOD, rhs = NumberLiteral(val = 5.00000)), op = EQUAL, rhs
 = NumberLiteral(val = 0.00000)), body = BlockStmt(PrintStmt(rhs = StringLiteral(val = Buzz));), else_body = BlockStmt(Prin
tStmt(rhs = Identifier(name = i));))));));)
```

Wie man sieht werden im AST einige Terminale und Nichtterminale weggelassen.
Zum Beispiel aus den langen `equality_expr` Ästen werden einzelne BinaryExpr, die dann direkt die Literale als Kinder haben.
Nichtterminale wie `typed_name` werden ganz weggelassen, da sie in der grammatik nur wegen der Lesbarkeit und Wiederverwendbarkeit
vorhanden waren. 

# Aufgabe 3

## a)

Die statische Semantik in HTWGLox besteht hauptsächlich aus der Zuordnung der Variablen- und Funktion-Namen in Scopes,
sowie den Typen der Variablen und Werte.
Scopes funktionieren wie in den meisten Sprachen der C-Familie:
Jeder Name muss definiert worden sein bevor er benutzt werden kann:

```lox
print x; // Fehler, x noch nicht definiert
var x: num = 10;
{
    print x; // alles gut
}
```

Namen dürfen nicht mehrmals im selben scope definiert werden, können aber in sub-scopes überschrieben werden:

```lox
func foo() {
    print "foo";
}
var foo: num = 10; // Fehler, "foo" bereits definiert
{
    var foo: num = 10; // alles gut
    print foo;
}
```

Da alle Namen von oben nach unten in korrekter Reihenfolge definiert sein müssen, könnte man diese Regeln bereits
beim erstellen des ASTs prüfen. Ich habe mich allerdings dazu entschieden einen separaten `Resolver` zu implementieren
um die AST erstellung kleiner zu halten.
Außerdem kam ich so bereits dazu das Visitor-Pattern umzusetzen, was ich später für einen Interpreter sowieso brauchen werde.

Das Visitor-Pattern besteht hauptsächlich aus dem Visitor-Interface:
```java
public interface Visitor<T> {
  private T visit(Node n) {
    if (n != null) {
      return n.accept(this);
    }
    return null;
  }

  public default T visitFuncDecl(FuncDecl stmt) {
    visit(stmt.body);
    return null;
  }

  public default T visitVarDecl(VarDecl stmt) {
    visit(stmt.initializer);
    return null;
  }

  public default T visitIdentifier(Identifier expr) {
    return null;
  }

  public default T visitUnaryExpr(UnaryExpr expr) {
    visit(expr.rhs);
    return null;
  }

  public default T visitBinaryExpr(BinaryExpr expr) {
    visit(expr.rhs);
    visit(expr.lhs);
    return null;
  }

  public default T visitStringLiteral(StringLiteral expr) {
    return null;
  }

  public default T visitNumberLiteral(NumberLiteral expr) {
    return null;
  }

  public default T visitBoolLiteral(BoolLiteral expr) {
    return null;
  }

  public default T visitCallExpr(CallExpr expr) {
    for (var n : expr.args) {
      visit(n);
    }
    return null;
  }

  public default T visitAssignStmt(AssignStmt stmt) {
    visit(stmt.rhs);
    return null;
  }

  public default T visitBlockStmt(BlockStmt stmt) {
    for (var s : stmt.statements) {
      visit(s);
    }
    return null;
  }

  public default T visitExprStmt(ExprStmt stmt) {
    visit(stmt.expr);
    return null;
  }

  public default T visitForStmt(ForStmt stmt) {
    visit(stmt.decl);
    visit(stmt.condition);
    visit(stmt.body);
    visit(stmt.end_stmt);
    return null;
  }

  public default T visitIfStmt(IfStmt stmt) {
    visit(stmt.condition);
    visit(stmt.body);
    visit(stmt.else_body);
    return null;
  }

  public default T visitPrintStmt(PrintStmt stmt) {
    visit(stmt.rhs);
    return null;
  }

  public default T visitReturnStmt(ReturnStmt stmt) {
    visit(stmt.rhs);
    return null;
  }

  public default T visitDeclStmt(DeclStmt stmt) {
    visit(stmt.decl);
    return null;
  }
}
```

Jede AST-Node muss nun die Accept Methode implementieren:
```java
public interface Node {
  public <T> T accept(Visitor<T> visitor);
}

// ...

public interface Expression extends Node {}

// ...

public class BinaryExpr implements Expression {
  // ...

  public <T> T accept(Visitor<T> visitor) {
    return visitor.visitBinaryExpr(this);
  }

  // ...
```

Die Resolver Klasse implementiert nun einen Teil dieses Interfaces:
```java
package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Resolver implements Visitor<Void> {
  private Stack<Map<String, Declaration>> scopes = new Stack<>();
  private List<String> errors = new ArrayList<>();

  public Resolver(Program p) {
    resolve(p);
  }

  public List<String> getErrors() {
    return errors;
  }

  private void scopeStart() {
    scopes.push(new HashMap<>());
  }

  private void scopeEnd() {
    scopes.pop();
  }

  private void define(Declaration decl) {
    if (decl == null) {
      return;
    }

    if (scopes.peek().containsKey(decl.name())) {
      errors.add(String.format("Name '%s' already defined", decl.name()));
      return;
    }

    scopes.peek().put(decl.name(), decl);
  }

  private void resolve(final Program p) {
    scopeStart();
    for (Statement stmt : p.statements) {
      resolve(stmt);
    }
    scopeEnd();
  }

  private void resolve(final Statement stmt) {
    if (stmt != null) {
      stmt.accept(this);
    }
  }

  private void resolve(final Expression expr) {
    if (expr != null) {
      expr.accept(this);
    }
  }

  @Override
  public Void visitFuncDecl(FuncDecl f) {
    scopeStart();
    define(f);
    for (VarDecl param : f.params) {
      define(param);
    }
    resolve(f.body);
    scopeEnd();
    return null;
  }

  @Override
  public Void visitVarDecl(VarDecl d) {
    define(d);
    resolve(d.initializer);
    return null;
  }

  @Override
  public Void visitBlockStmt(BlockStmt stmt) {
    scopeStart();
    for (var s : stmt.statements) {
      resolve(s);
    }
    scopeEnd();
    return null;
  }

  @Override
  public Void visitIdentifier(Identifier ident) {
    int i = 1;
    var scope = scopes.peek();
    while (!scope.containsKey(ident.name)) {
      if (i >= scopes.size()) {
        scope = null;
        break;
      }
      scope = scopes.get(scopes.size() - i++);
    }

    if (scope == null) {
      errors.add(String.format("Name '%s' not yet defined", ident.name));
    }
    return null;
  }
}
```

Die Scopes sind sehr Simpel durch Stacks und Maps dargestellt.
Der Resolver kann nun so benutzt werden:

```java
    Program ast = new Program.Builder().build(tree);
    Resolver r = new Resolver(ast);
    for (String e : r.getErrors()) {
      System.out.println(e);
    }
```

Hier der Output des Resolvers für eine kleines Beispiel:
```lox
func foo(x: num, y: str) -> str {
  print "foo";
  print x;
  print z;
  if x == 0 {
    var z: num = 10;
    var x: num = 10;
    print z;
    print x;
  }
  return "hi";
}
```

Ausgabe:

```
Name 'z' not yet defined
```

Der Resolver erkennt, dass x bereits als Funktions Parameter definiert wurde, z allerdings noch nicht.

Die Überprüfung ob alle Typ-Einschränkungen eingehalten wurden könnte man auf eine ähnliche Weise umsetzten.
Man würde einen Visitor implementieren, welcher sich wie der Resolver aller Variablen der scopes bewusst ist und ihnen
ihre Typen zuordnet. Dieser Visitor könnte dann jeder Expression einen Typ zuordnen und so Überprüfen, dass das System stimmig ist.
Aus Zeit Gründen habe ich mich dagegen entschieden diesen Bereits zu implementieren.

## b)

Als dynamische Semantik habe ich mich entschieden einen kleinen Interpreter für HTWGLox zu implementieren.
Dafür habe ich eine Klasse `Interpreter` geschrieben, die das `Visitor<Object>` interface implementiert.

Hier kann man an Hand es Beispiels eines for-loops gut sehen, wie der Interpreter eine dynamische Semantik implementiert:
```java
  public Object visitForStmt(ForStmt stmt) {
    scopeStart();
    if (stmt.decl != null) {
      declareVar(stmt.decl);
    }
    while (evaluate(stmt.condition) instanceof Boolean b && b) {
      scopeStart();
      execute(stmt.body);
      scopeEnd();
      execute(stmt.end_stmt);
    }
    scopeEnd();
    return null;
  }
```

Der Interpreter kann die AST nodes auswerten und anhand der Ergebnisse entscheiden, welche als nächstes ausgeführt werden soll.
Die logik ist ziemlich simpel, unterstütz aber bereits jedes Feature der Sprache, bis auf Funktionsdeklarationen (die mir aufgrund
der Scoping Regeln vorerst zu kompliziert zu implementieren waren).

Dieser Interpreter kann das fizzbuzz beispiel bereits ausführen, und produziert das folgende Ergebnis:

```lox
for var i: num = 1; i < 30; i = i + 1 {
  if i % 5 == 0 && i % 3 == 0 {
    print "FizzBuzz";
  } else if i % 3 == 0 {
    print "Fizz";
  } else if i % 5 == 0 {
    print "Buzz";
  } else {
    print i;
  }
}
```

```java
public class HTWGLox {
  public static void main(String[] args) throws IOException {
    HTWGLoxLexer lexer = new HTWGLoxLexer(CharStreams.fromStream(System.in));
    HTWGLoxParser parser = new HTWGLoxParser(new CommonTokenStream(lexer));
    ParseTree tree = parser.program();

    if (parser.getNumberOfSyntaxErrors() > 0) {
      System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
      System.exit(1);
    }

    Program ast = new Program.Builder().build(tree);
    System.out.printf("Program.printString() = %s%n", ast.toString());
    Resolver r = new Resolver(ast);
    for (String e : r.getErrors()) {
      System.out.println(e);
    }
    Interpreter i = new Interpreter();
    for (var stmt : ast.statements) {
      i.execute(stmt);
    }
  }
}
```

`mvn exec:java -Dexec.mainClass=HTWGLox < fizzbuzz.lox`

Ausgabe:
```
1.0
2.0
Fizz
4.0
Buzz
Fizz
7.0
8.0
Fizz
Buzz
11.0
Fizz
13.0
14.0
FizzBuzz
16.0
17.0
Fizz
19.0
Buzz
Fizz
22.0
23.0
Fizz
Buzz
26.0
Fizz
28.0
29.0
```
