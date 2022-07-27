package com.wry.antlr.arrayinit;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {

        CodePointCharStream input = CharStreams.fromString("{99,3,451}");

        ArrayInitLexer lexer = new ArrayInitLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ArrayInitParser parser = new ArrayInitParser(tokens);
        ArrayInitParser.InitContext tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new ShotToUnicodeString(),tree);

        System.out.println();

    }

}
