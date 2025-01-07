package com.example.calculator3;

public enum Operator {
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private final char symbol;

    Operator(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    //입력된 기호로 알맞은 Operator 찾는 메서드.
    //GPT 도움을 받아버렸다...
    public static Operator findSymbol(char symbol) {
        for (Operator op : values()) {
            if (op.symbol == symbol) {
                return op;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 연산자: " + symbol);
    }
}
