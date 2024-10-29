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


