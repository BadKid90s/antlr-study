package com.wry.antlr.expr;

import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.file.Path;

public class ExprJoyRide {
    public static void main(String[] args) throws IOException {

        CharStream stream = CharStreams.fromString("193\n" +
                "a=5\n" +
                "b=6\n" +
                "a+b*2\n" +
                "(1+2)*3");
        //新建一个词法分析器来处理CharStream
        ExprLexer lexer = new ExprLexer(stream);

        //新建一个词法符号的缓冲区，用于存储词法分析器生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //新建一个语法分析器，用于处理词法缓冲区的内容
        ExprParser parser = new ExprParser(tokens);

        //从prog规则进行语法分析
        ExprParser.ProgContext prog = parser.prog();

        System.out.println(prog.toStringTree(parser));
    }
}
