grammar CSV;

@header{
package com.wry.antlr.csv;
}
file: hdr row+;
hdr: row;
row: field(',' field)* '\r'? '\n';
field:  TEXT|STRING| ;

TEXT:   ~[,\n\r]+ ; //下一个逗号或换行符之前的任意字符序列
STRING: '"' ('""'|~'"')* '"'; //两个双引号是对双引号的转义

