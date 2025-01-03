package com.example.calculator2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
* [ 조건 ]
* 1. 사칙 연산을 수행 후, 결과값을 반환하는 메서드 구현
* 2. 연산 결과를 저장하는 컬렉션 타입 필드 제작.
*/
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> saved = new LinkedList<>();  //2. 연산 결과를 저장하는 컬렉션 필드

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 정수를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("피연산자를 입력하세요(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int calResult = calculate(num1, num2, operator);
            saved.add(calResult);   //연산 결과를 저장.

            System.out.print("더 계산하시겠습니까?(exit 입력 시 종료) : ");
            sc.nextLine();
            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }
        }
    }

    //1. 사칙연산 수행 후, 결과 값을 반환하는 메서드 - static
    public static int calculate(int num1, int num2, char operator) {
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
}
