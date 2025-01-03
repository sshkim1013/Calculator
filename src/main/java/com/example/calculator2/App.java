package com.example.calculator2;

import java.util.Scanner;

//com.example.calculator.App Refactoring Ver.
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 정수를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            //계산 결과 값 저장 변수
            int result = 0;

            //나눗셈은 분모로 0 입력 불가 출력 코드.
            if (operator == '/' && num2 == 0) {
                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
            } else {    // 문제 해결 2
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("덧셈 결과: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("뺄셈 결과: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("곱셈 결과: " + result);
                        break;
                    case '/':
                        result = num1 / num2;
                        System.out.println("[ 나눗셈 결과 ]");
                        System.out.println("몫: " + result + ", 나머지 = " + num1 % num2);
                        break;
                    default:
                        System.out.println("잘못 입력된 연산자입니다. 다시 입력해 주세요.");
                }

                //프로그램 종료 로직
                System.out.print("더 계산하시겠습니까?(exit 입력 시 종료): ");
                sc.nextLine();  //문제 해결 1: 입력 버퍼 비우기.
                String answer = sc.nextLine();
                if (answer.equals("exit")) {
                    System.out.println("계산기 프로그램을 종료합니다.");
                    break;
                }
            }
        }
    }
}
