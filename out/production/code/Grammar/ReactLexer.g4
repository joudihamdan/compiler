lexer grammar ReactLexer;

@header {
  package Grammar;
}

FUNCTION: 'function';
IMPORT :'import React, { useState,useRef, useEffect } from "react";';
CONST: 'const';
DOT: '.';
MAP:'map';
IF: 'if' ;
FOR: 'for';
ELSE: 'else';
STRING_LITERAL
 : DOUBLE_QOUTE (DIGIT |' ' | ~["]  | LETTER)* DOUBLE_QOUTE
 | SINGLE_QOUTE (DIGIT |' '| ~["]  | LETTER)* SINGLE_QOUTE
 ;
INTEGER_LITERAL : DIGIT;
 DIGIT: [0-9]+ ;
OPENED_BRACES: '(';
OPENED_SQUERE_BRACES: '[';
OPENED_CURLY_BRACES: '{';
CLOSED_CURLY_BRACES: '}' ;
CLOSED_SQUERE_BRACES : ']' ;
CLOSED_BRACES: ')';
INT: 'int' ;
STRING: 'String' ;
BOOLEAN: 'boolean';
VAR: 'var' ;
ONCLICK :'onClick';
QU: '?';
RETURN: 'return';
EXPORT: 'export';
DEFAULT: 'default';
USESTATE:'useState';
USEREF:'useRef';
USEEFFECT:'useEffect';
IDENTIFIERNAME: [a-zA-Z]+([0-9])* |'_'| DIGIT;
SLASH: '/';
OPEN_TAG: '<';
CLOSE_TAG: '>';
CLOSE_OR_EQUAL: '>=';
OPEN_OR_EQUAL: '<=';
STYLE: 'style';
ANDAND:'&&';
ARROW:'=>' ;
CLASS: 'class' ;
LIST: 'List' ;
DOUBLE_QOUTE: '"' ;
SINGLE_QOUTE: '\'';
VOID: 'void';
LETTER:  [a-zA-Z]+ ;
MAIN: 'main' ;
EXTEND: 'extends';
EQUAL: '=' ;
PLUS: '+' ;
MINUS: '-' ;
MINUSMINUS: '--' ;
MULTI: '*' ;
AT_SIGN: '@' ;
COMMA: ',' ;
COLON: ':' ;
SEMICOLON: ';' ;
Comment : '//' ~[\r\n]* -> skip;
WS: [ \t\r\n] -> skip ;