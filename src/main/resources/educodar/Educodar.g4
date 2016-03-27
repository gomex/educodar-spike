grammar Educodar;

// Parser definition
program
    : PROGRAM_KW CURLY_BRACKET_L routesBlock? CURLY_BRACKET_R;

routesBlock
    : ROUTES_KW CURLY_BRACKET_L routeDef* CURLY_BRACKET_R;

routeDef
    : FOR_KW STRING DO_KW CURLY_BRACKET_L expression CURLY_BRACKET_R;

expression
    : RETURN_KW STRING COMMAND_SEPARATOR;

// Lexer definition

// Symbols
CURLY_BRACKET_L : '{';
CURLY_BRACKET_R : '}';
COMMAND_SEPARATOR : ';';

// Keywords
PROGRAM_KW : 'programa';
ROUTES_KW : 'endereços';
FOR_KW : 'para';
DO_KW : 'faça';
RETURN_KW : 'retorna';

// Literals
LETTER : ('a' .. 'z') | ('A' .. 'Z');
DIGIT : ('0' .. '9');
SPECIAL_CHAR
    : '=' | '@' | '#' | '$'
    | '%' | '"' | '&' | '_'
    | '(' | ')' | '[' | ']'
    | '{' | '}' | '<' | '>'
    | '+' | '-' | '*' | '/'
    | '.' | ',' | ';' | ':'
    | '?' | '!';

STRING : '\''(LETTER | DIGIT | SPECIAL_CHAR | WHITESPACE)*'\'';
WHITESPACE : (' ' | '\t' | '\n')+ -> skip;
