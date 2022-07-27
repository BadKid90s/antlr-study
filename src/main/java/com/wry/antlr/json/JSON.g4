grammar JSON;

@header{
package com.wry.antlr.json;
}
file: object | array;

array: '['value (','value)*']'
     | '['']'
     ;

object:
        '{' pair (','pair)* '}'
        | '{' '}'
        ;

pair:  STRING ':' value ;

value: NUMBER
     | STRING
     | object
     | array
     | 'true'
     | 'false'
     | 'null'
     ;

STRING: '"' (~["\\])* '"';
NUMBER:  '-'? INT '.' EXP?
      | '-'? INT EXP
      | '-'? INT
      ;

INT: '0' | [1-9][0-9]* ;
EXP: [+\-]? INT;

WS :[ \t\r\n]+ -> skip;