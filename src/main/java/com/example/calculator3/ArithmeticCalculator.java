package com.example.calculator3;

import java.util.LinkedList;
import java.util.Queue;

//com.example.calculator2.Calculator Refactoring Ver.
//제네릭 문법 사용.
public class ArithmeticCalculator<T> {

    private Queue<T> saved = new LinkedList<>();

    //연산 메서드
    public double calculate(double num1, double num2, char operatorType) {
        try {
            Operator operator = Operator.findSymbol(operatorType);

            double result = 0; //연산 결과 저장.

            if (operator == Operator.PLUS) {
                result = num1 + num2;
                System.out.println("덧셈 결과: " + result);
            } else if (operator == Operator.MINUS) {
                result = num1 - num2;
                System.out.println("뺄셈 결과: " + result);
            } else if (operator == Operator.MULTIPLY) {
                result = num1 * num2;
                System.out.println("곱셈 결과: " + result);
            } else if (operator == Operator.DIVIDE) {
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                //num2가 0이 아닐 시 계산.
                result = num1 / num2;
                double left = num1 % num2;
                System.out.println("[ 나눗셈 결과 ]");
                System.out.println("몫: " + result + " / 나머지: " + left);
            }

            return result;

        } catch (IllegalArgumentException ie) {
            System.out.println("[주의] " + ie.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("[주의] " + ae.getMessage());
        }

        return 0.0;   //예외 발생 시 기본값 반환.
    }

    public Queue<T> getSaved() {
        return saved;
    }

    public void setSaved(T value) {
        saved.add(value);
        deleteSaved();
    }

    public void deleteSaved() {
        if (saved.size() > 5) {
            saved.poll();
        }
    }
}
