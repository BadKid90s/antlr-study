grammar Expr;

@header{
package com.wry.antlr.expr;
}

/* 语法规则定义  */
//起始规则，语法分析的起点
prog : start+;

start: expr NEWLINE | ID '=' expr NEWLINE | NEWLINE ;

expr : expr('*'| '/') expr | expr ('+' | '-') expr | INT | ID | '(' expr ')';

/* 词法规则定义  */
ID   : [a-zA-Z]+;
INT  : [0-9]+;
NEWLINE : '\r'?'\n';
WS   : [ \t]+ ->skip;

