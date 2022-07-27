/* 定义一个名为Hello的语法 */
grammar Hello;

@header{
package com.wry.antlr.hello;
}
/* 语法规则定义 */
/* 匹配一个关键字hello 和一个紧随其后的标识符 */
rule  :'hello' ID;

/* 词法规则定义 */
/* 匹配小写字母组成的标识符 */
ID : [a-z]+;
/* 忽略空格、Tab、换行以及\r(Windows) */
WS :[ \t\r\n]+ -> skip;


