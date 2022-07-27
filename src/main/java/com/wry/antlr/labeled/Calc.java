package com.wry.antlr.labeled;

import com.wry.antlr.expr.ExprLexer;
import com.wry.antlr.expr.ExprParser;
import com.wry.antlr.expr.LabeledExprLexer;
import com.wry.antlr.expr.LabeledExprParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Calc {
    public static void main(String[] args) {
        CharStream stream = CharStreams.fromString("193\n" +
                "a=5\n" +
                "b=6\n" +
                "a+b*2\n" +
                "(1+2)*3");
        //新建一个词法分析器来处理CharStream
        LabeledExprLexer lexer = new LabeledExprLexer(stream);

        //新建一个词法符号的缓冲区，用于存储词法分析器生成的词法符号
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //新建一个语法分析器，用于处理词法缓冲区的内容
        LabeledExprParser parser = new LabeledExprParser(tokens);

        //从prog规则进行语法分析
        LabeledExprParser.ProgContext tree = parser.prog();

        System.out.println(tree.toStringTree(parser));
    }
}
