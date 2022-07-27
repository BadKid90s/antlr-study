grammar ArrayInit;

@header{
package com.wry.antlr.arrayinit;
}

/* 一个名为init的规则，它匹配一对花括号中的逗号分割的value */
init  : '{' value (',' value )* '}'; //必须匹配至少一个value

/* 一个value可以是嵌套的花括号结构，也可以是一个简单的整数，及INT词法符合 */
value : init | INT;

/* 语法分析器的规则必须以小写字母开头，词法分析器的规则必须用大写字母开头 */
INT   : [0-9]+ ;
WS    :[ \t\r\n]+ -> skip;