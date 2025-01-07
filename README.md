# 😄 프로젝트 소개
내일배움캠프 Spring_5기 트랙의 **[ 프로그래밍 문법 주차 - 계산기 만들기 ]** 과제에 대한 README 문서입니다.


- **Level 1**
  - 하나의 클래스 내에서 기본적인 연산을 수행할 수 있는 계산기 만들기
  - 객체지향 문법 사용 X
  - 필수 과제

- **Level 2**
  - 두 개의 클래스를 이용하여 기본적인 연산을 수행할 수 있는 계산기 만들기
  - 객체지향 문법 사용 O
  - 필수 과제

- **Level 3**
  - Enum, Generic, Lambda, Stream 문법을 사용하여 계산기 만들기
  - 도전 과제
---

# 💻 개발 기간
- **calculator 패키지(Level 1)**
  - **App.java** : 25.01.02 ~ 25.01.02 (1일)

- **calculator2 패키지(Level 2)**
  - **App.java** : 25.01.03 ~ 25.01.03 (1일)
  - **Calculator.java** : 25.01.03 ~ 25.01.03 (1일)

- **calculator3 패키지(Level 3)**
  - **App.java** : 25.01.06 ~ 
  - **Calculator.java** : 25.01.06 ~ 
---

# ✨ 코드 별 특징
- **calculator 패키지(Level 1)**
  - switch문을 통해 입력받은 연산자에 따라 알맞은 연산 수행
  - ex ) **case '+' : result = num1 + num2;**
 
- **calculator2 패키지(Level 2)**
  - Calculator 클래스를 별도로 생성.
  - 실행 클래스인 App에서 Calculator 객체를 생성하여 해당 객체의 calculate( ) 메서드를 통해 연산 수행.
  - **Calculator.java** : if / else-if문 사용.
 
- **calculator3 패키지(Level 3)**
  - ENUM 타입으로 Operator 생성.
  - Operator 내부에 `findSymbol()` 메서드 생성.
    
    - 인자로 전달 받은 연산자를 Operator 객체에서 찾아 해당 객체를 반환.
    - Calculator 클래스의 `calculate()` 메서드 내에서 `findSymbol()` 메서드 실행.
    - 연산자 조건에 맞는 객체를 반환 받은 후, if / else-if 문을 통해 연산 수행.
