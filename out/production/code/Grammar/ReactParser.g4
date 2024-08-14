parser grammar ReactParser;
options { tokenVocab= ReactLexer; }

@header {
	package Grammar;
}

program
    :  statement*| (IMPORT  list? (arrowcomponent)*  withHooks )| singlecomponent | hooks
    ;

withHooks
    :  arrowcomponent componentBody CLOSED_CURLY_BRACES SEMICOLON* export?
    ;
hooks:
     usestate
     |useRef
     |useEffect
     ;
usestate
    : CONST OPENED_SQUERE_BRACES IDENTIFIERNAME COMMA IDENTIFIERNAME CLOSED_SQUERE_BRACES EQUAL USESTATE OPENED_BRACES STRING_LITERAL  CLOSED_BRACES SEMICOLON
      constfunction
    ;


useRef: CONST IDENTIFIERNAME EQUAL USEREF openbraces SEMICOLON*
      ;
useEffect
      :USEEFFECT OPENED_BRACES function OPENED_CURLY_BRACES statement* CLOSED_CURLY_BRACES COMMA
       OPENED_SQUERE_BRACES attribute* CLOSED_SQUERE_BRACES CLOSED_BRACES
      ;
export
     : EXPORT DEFAULT IDENTIFIERNAME SEMICOLON*
     ;

list
    : CONST? IDENTIFIERNAME EQUAL OPENED_SQUERE_BRACES (elements) CLOSED_SQUERE_BRACES
    ;

litral
     :INTEGER_LITERAL    #integerLiteral
     |STRING_LITERAL #stringLiteral
    ;


elements
    :(( element|  litral)( COMMA  (element|litral) )* )?
    ;

element
    : OPENED_CURLY_BRACES IDENTIFIERNAME COLON litral  (COMMA IDENTIFIERNAME COLON litral)* CLOSED_CURLY_BRACES
    ;

singlecomponent
    : (arrowcomponent |functionalcomponent) componentBody SEMICOLON*
    ;

functionalcomponent
    : FUNCTION IDENTIFIERNAME openbraces OPENED_CURLY_BRACES
    ;

arrowcomponent
    : CONST IDENTIFIERNAME EQUAL openbraces ARROW  (OPENED_BRACES |OPENED_CURLY_BRACES) componentBody*
    ;

componentBody
    : hooks? (RETURN OPENED_BRACES)? jsxElements CLOSED_BRACES  SEMICOLON*
    ;

openbraces
    : OPENED_BRACES (attribute |STRING_LITERAL)* CLOSED_BRACES
    ;

jsxElements
    : openTag tagContent closeTag
    | selfclosing
    ;
componentcall: OPEN_TAG IDENTIFIERNAME (IDENTIFIERNAME EQUAL OPENED_CURLY_BRACES IDENTIFIERNAME  CLOSED_CURLY_BRACES )*
             SLASH CLOSE_TAG ;
openTag
    : OPEN_TAG IDENTIFIERNAME (attribute | style |functionattribute)* CLOSE_TAG
    ;

closeTag
    : OPEN_TAG SLASH IDENTIFIERNAME CLOSE_TAG
    ;

selfclosing
    : OPEN_TAG IDENTIFIERNAME (attribute | style)* SLASH CLOSE_TAG
    ;

attribute
    : IDENTIFIERNAME                                      #text
    | OPENED_CURLY_BRACES IDENTIFIERNAME (COMMA IDENTIFIERNAME )* CLOSED_CURLY_BRACES  #multiattribute
    | (OPENED_CURLY_BRACES IDENTIFIERNAME DOT ( IDENTIFIERNAME | map) CLOSED_CURLY_BRACES)   #dotattribute
    |  IDENTIFIERNAME EQUAL OPENED_CURLY_BRACES IDENTIFIERNAME DOT IDENTIFIERNAME CLOSED_CURLY_BRACES #equalttribute
    | select    #selectatrribute
    ;

functionattribute : ONCLICK EQUAL OPENED_CURLY_BRACES function CLOSED_CURLY_BRACES ;

map:MAP OPENED_BRACES openbraces ARROW OPENED_BRACES jsxElements CLOSED_BRACES *;

select :OPENED_CURLY_BRACES IDENTIFIERNAME ANDAND OPENED_BRACES jsxElements CLOSED_BRACES CLOSED_CURLY_BRACES* ;

tagContent
    : (attribute | jsxElements |(componentcall))*
    ;

style
    : IDENTIFIERNAME EQUAL OPENED_CURLY_BRACES* styleAttributes CLOSED_CURLY_BRACES*
    ;

styleAttributes
    : IDENTIFIERNAME COLON STRING_LITERAL (COMMA IDENTIFIERNAME COLON STRING_LITERAL)*
    ;

function
    : openbraces ARROW call?
    ;

constfunction:
     CONST? IDENTIFIERNAME EQUAL openbraces ARROW OPENED_CURLY_BRACES call CLOSED_CURLY_BRACES SEMICOLON
    ;

 call
    :
    IDENTIFIERNAME (DOT IDENTIFIERNAME)? openbraces SEMICOLON*
    ;


operation
    : IDENTIFIERNAME (OPEN_TAG | CLOSE_TAG|PLUS|MINUS | EQUAL | CLOSE_OR_EQUAL | OPEN_OR_EQUAL) litral
    ;

forloop
    : FOR OPENED_BRACES declaration SEMICOLON  operation SEMICOLON (IDENTIFIERNAME PLUS STRING_LITERAL | IDENTIFIERNAME MINUS STRING_LITERAL | IDENTIFIERNAME PLUS PLUS
    | IDENTIFIERNAME MINUS MINUS ) CLOSED_BRACES
     (OPENED_CURLY_BRACES  (statement)* CLOSED_CURLY_BRACES)*
    ;

elseIf_condition
    :ELSE if
    ;

else_condition
    :ELSE OPENED_CURLY_BRACES* statement* CLOSED_CURLY_BRACES*
    ;

if
    : IF OPENED_BRACES operation CLOSED_BRACES
     OPENED_CURLY_BRACES* statement*  CLOSED_CURLY_BRACES*
     (elseIf_condition)* (else_condition)?
    ;

declaration
 :  type (IDENTIFIERNAME | assignment) (COMMA (IDENTIFIERNAME | assignment))*
 ;

assignment
 :IDENTIFIERNAME ( DOT IDENTIFIERNAME)? EQUAL litral #literalAssignment
 | IDENTIFIERNAME ( DOT IDENTIFIERNAME)?  EQUAL expression #expressionAssignment
 ;


expression
 : OPENED_BRACES* operation CLOSED_BRACES*
 ;

type
 : INT
 | STRING
 | BOOLEAN
 | VAR
 ;

 statement:
   declaration+
   |forloop
   |if
   |call
   |function
   ;
