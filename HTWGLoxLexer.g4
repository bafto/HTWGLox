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
MINUS: '-' ;
SLASH: '/' ;
STAR: '*' ;
PLUS: '+' ;
UNEQUAL: '!=' ;
EXCLAMATION_MARK: '!' ;
EQUAL: '==' ;
ASSIGN: '=' ;
GREATER_EQUAL: '>=' ;
LESS_EQUAL: '<=' ;
LESS: '<' ;
GREATER: '>' ;
PERCENT: '%' ;
BOOL_AND: '&&' ;
BOOL_OR: '||' ;

// whitespace
WS: [ \t\r\n]+ -> channel(HIDDEN) ;

COMMENT: '/*' .*? '*/' -> channel(HIDDEN) ;

LINE_COMMENT: '//' ~[\r\n]* -> channel(HIDDEN) ;

INVALID: .+? ;
