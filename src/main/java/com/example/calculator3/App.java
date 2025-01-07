package com.example.calculator3;

import java.util.Scanner;

//com.example.calculator2.App Refactoring Ver.
public class App {
    public static void main(String[] args) {
        //Calculator 인스턴스 생성.
        ArithmeticCalculator<Double> cal = new ArithmeticCalculator<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();
            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /): ");
            char operator = sc.next().charAt(0);
            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            double calResult = cal.calculate(num1, num2, operator);
            cal.setSaved(calResult);  //연산 결과 저장.
            System.out.println("현재 저장된 연산 결과: " + cal.getSaved());   //연산 결과 호출.

            System.out.print("더 계산하시겠습니까?(exit 입력 시 종료) : ");
            sc.nextLine(); // 버퍼 클리어.
            String answer = sc.nextLine();

            if (answer.equals("exit")) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }
        }
    }
}
