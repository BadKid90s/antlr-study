package com.wry.antlr.arrayinit;

public class ShotToUnicodeString extends ArrayInitBaseListener {

    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.printf(String.valueOf('"'));
    }

    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.printf(String.valueOf('"'));
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        int value = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
