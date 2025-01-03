package com.example.calculator2;

import java.util.Scanner;

//com.example.calculator.App Refactoring Ver.
public class App {
    public static void main(String[] args) {
        //Calculator 인스턴스 생성.
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 정수를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            int calResult = cal.calculate(num1, num2, operator);
            cal.saved.add(calResult);   //연산 결과 저장.
            System.out.println(cal.saved);  //연산 결과 출력.

            System.out.print("더 계산하시겠습니까?(exit 입력 시 종료) : ");
            sc.nextLine();
            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }
        }
    }
}
