package com.example.calculator2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    //2. 연산 결과를 저장하는 컬렉션 필드
    //외부에서 접근할 수 없도록 private 접근 제어자 설정.
    private Queue<Integer> saved = new LinkedList<>();

    //1. 사칙연산 수행 후, 결과 값을 반환하는 메서드 - static
    public int calculate(int num1, int num2, char operator) {
        int result = 0; //연산 결과 저장.

        if (operator == '+') {
            result = num1 + num2;
            System.out.println("덧셈 결과: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("뺄셈 결과: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("곱셈 결과: " + result);
        } else if (operator == '/' && num2 == 0) {
            System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
        } else {
            result = num1 / num2;
            int left = num1 % num2;
            System.out.println("[ 나눗셈 결과 ]");
            System.out.println("몫: " + result + " / 나머지: " + left);
        }
        return result;
    }

    //Getter 메서드
    public Queue<Integer> getSaved() {
        return saved;
    }

    //Setter 메서드
    public void setSaved(Integer value) {
        saved.add(value);
        deleteSaved();
    }

    //연산 결과 삭제 메서드
    //계산 결과가 5개를 넘기면 poll() 수행.
    public void deleteSaved() {
        if (saved.size() > 5) {
            saved.poll();
        }
    }
}
