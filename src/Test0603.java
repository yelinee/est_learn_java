import java.sql.SQLOutput;

public class Test0603 {
  public static void main(String[] args) {
    /*    int num1 = 10;
    int num2 = 3;

    int sum = num1 + num2;
    int diff1 = num2 - num1;
    int diff2 = num1 - num2;

    int product = num1 * num2;
    int quot = num1 / num2;
    int remainder = num1 % num2;

    System.out.println("덧셈 = " + sum);
    System.out.println("뺄셈1 = " + diff1);
    System.out.println("뺄셈2 = " + diff2);
    System.out.println("곱셈 = " + product);
    System.out.println("나눗셈 = " + quot);
    System.out.println("나머지 = " + remainder);*/

    /*    int a = 10;
    int b = 4;
    int c = a / b; // 정수 부분만 반환함. 정확한 값 X.
    double d = (double) a / b; // 형변환을 통해 정확한 소수자리를 포함한 정확한 값을 가질 수 있음

    System.out.println(c);
    System.out.println(d);

    char c1 = 'A' + 1;
    char c2 = 'A';
    char c3 = c2 + 1;

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);*/

    /*    System.out.println("Hello" + 123 + 456); // 문자열을 먼저 인식하기 때문에 뒤에 숫자로 문자열로 인식
    System.out.println(123 + 456 + "Hello"); // 숫자를 먼저 인식하기 때문에 숫자 덧셈이후에 문자열과 붙임

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb); // 애초에 문자열로 인식하기 때문에 숫자, 문자와 상관없이 문자열로 인식*/

    /*    int num1 = 10;
    int num2 = 3;

    System.out.println(num1 > num2); // 결과값은 boolean 타입으로 산출
    System.out.println(num1 >= num2);
    System.out.println(num1 < num2);
    System.out.println(num1 <= num2);

    System.out.println(num2 == num1);
    System.out.println(num2 != num1);

    String a = new String();
    String b = new String();

    System.out.println(a == b); // 주소값 비교
    System.out.println(a.equals(b)); // 값 비교

    System.out.println('A' < 'B'); // 유니코드 65 < 66 을 비교함*/

    /*    // ⭐⭐
    String str1 = "Hello"; // 클래스는 힙 영역에 생성됨
    String str2 = "Hello";
    String str3 = new String("Hello");

    System.out.println(str1 == str2); // 동일한 문자열은 동일한 주소값을 가짐(힙 메모리 안에서)
    System.out.println(str2 == str3); // new 키워드를 사용하면 새로운 객체를 생성하기 때문에 둘의 주소값은 다름*/

    /*// 논리연산자 &&(AND)
    // 두 값이 모두 true일 때만 true
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);

    // 논리연산자 ||(OR)
    // 두 값 중 하나만이라도 true면 true
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    // 배타적 논리합 ^(XOR)
    // 두 값이 다르면 true
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);

    // 논리 부정 !(NOT)
    System.out.println(true ^ !true);  // true
    System.out.println(true ^ !false); // false
    System.out.println(false ^ !true); // false
    System.out.println(false ^ !false); // true

    // 비트 연산자*/

    /*    // 삼항 연산자
    int score = 95;
    char grade = (score > 90) ? 'A' : 'B'; // 참이면 A 거짓이면 B
    System.out.println(grade); // A

    String feedback = ((score == 95) && (score % 5 == 0)) ? "Good" : "Bad";
    System.out.println(feedback); // Good

    if (score > 90) {
      grade = 'A';
    } else {
      grade = 'B';
    }
    System.out.println("grade = " + grade);*/

    // if문
    // 문제1
    /*    int a = 5;
    int b = 3;

    if (a > b) {
      System.out.println("a is greather than b");
    } else if (a == b) {
      System.out.println("a and b are equal");
    } else {
      System.out.println("a is less than b");
    }

    System.out.println(
        (a > b) ? "a is greather than b" : ((a == b) ? "a and b are equal" : "a is less than b"));*/

    /*    // 퀴즈1
    int x = 10;
    if (x > 0) {
      System.out.println("양수입니다.");
    } else if (x == 0) {
      System.out.println("0입니다.");
    } else {
      System.out.println("음수입니다.");
    }
    // 삼항연산자
    System.out.println((x > 0) ? "양수입니다." : ((x == 0) ? "0입니다." : "음수입니다."));

    // 퀴즈2
    int score = 75;
    char grade;
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println(grade);

    // 퀴즈3
    int year = 2023;
    if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
      System.out.println("윤년입니다.");
    } else {
      System.out.println("윤년이 아닙니다.");
    }

    // 퀴즈4
    int a = 10;
    int b = 20;
    int c = 30;
    if (a > b) {
      if (a > c) {
        System.out.println("a가 가장 큰 수입니다.");
      } else {
        System.out.println("c가 가장 큰 수입니다.");
      }
    } else {
      if (b > c) {
        System.out.println("b가 가장 큰 수입니다.");
      } else {
        System.out.println("c가 가장 큰 수입니다.");
      }
    } // 같을 때의 예외처리 추가. 중첩이 나은걸까? 조건이 여러개인게 나은걸가?*/

    //    // switch문
    //    String today = "일요일";
    //    switch (today) {
    //      case "월요일":
    //        System.out.println("책 읽기");
    //        break;
    //      case "화요일":
    //        System.out.println("음악 감상");
    //        break;
    //      case "수요일":
    //        System.out.println("수터디하기");
    //        break;
    //      case "목요일":
    //        System.out.println("약속가기");
    //        break;
    //      case "금요일":
    //        System.out.println("공부하기");
    //        break;
    //      case "토요일":
    //        System.out.println("영화보기");
    //        break;
    //      case "일요일":
    //        System.out.println("교회가기");
    //        break;
    //      default:
    //        System.out.println("알 수 없는 요일");
    //    }
    //
    //    // 퀴즈1
    //    char grade = 'A';
    //    switch (grade) {
    //      case 'A':
    //        System.out.println("Excellent");
    //        break;
    //      case 'B':
    //        System.out.println("Good");
    //        break;
    //      case 'C':
    //        System.out.println("Average");
    //        break;
    //      case 'D':
    //        System.out.println("Below Average");
    //        break;
    //      case 'F':
    //        System.out.println("Fail");
    //        break;
    //      default:
    //        System.out.println("일치하는 값이 없습니다.");
    //    }
    //
    //    // 퀴즈2
    //    char operator = '/';
    //    int num1 = 10;
    //    int num2 = 3;
    //    switch (operator) {
    //      case '+':
    //        System.out.println(num1 + num2);
    //        break;
    //      case '-':
    //        System.out.println(num1 - num2);
    //        break;
    //      case '*':
    //        System.out.println(num1 * num2);
    //        break;
    //      case '/':
    //        System.out.println(num1 / num2);
    //        break;
    //      default:
    //        System.out.println("일치하는 값이 없습니다.");
    //    }
    //
    //    // 퀴즈3
    //    String color = "red";
    //    switch (color) {
    //      case "red":
    //        System.out.println("Apple");
    //        break;
    //      case "green":
    //        System.out.println("Grass");
    //        break;
    //      case "blue":
    //        System.out.println("Sky");
    //        break;
    //      default:
    //        System.out.println("일치하는 값이 없습니다.");
    //    }
    //
    //    // 퀴즈4
    //    int score = 78;
    //    switch (score / 10) {
    //      case 9:
    //        System.out.println('A');
    //        break;
    //      case 8:
    //        System.out.println('B');
    //        break;
    //      case 7:
    //        System.out.println('C');
    //        break;
    //      case 6:
    //        System.out.println('D');
    //        break;
    //      default:
    //        System.out.println('F');
    //    }
    //
    //    // 문제5
    //    String language = "Java";
    //    switch (language) {
    //      case "Java":
    //        System.out.println("자바는 객체지향 언어입니다.");
    //        break;
    //      case "Python":
    //        System.out.println("파이썬은 많은 라이브러리를 가지고 있습니다.");
    //        break;
    //      case "C++":
    //        System.out.println("c++은 입니다.");
    //        break;
    //      case "JavaScript":
    //        System.out.println("자바스크립트는 프론트앤드를 구현하는 유일한 언어입니다.");
    //        break;
    //      default:
    //        System.out.println("일치하는 항목이 없습니다.");
    //    }

    //    int passScore = 60;
    //    int myScore = 75;
    //    if (myScore >= passScore) {
    //      System.out.println("합격");
    //    } else {
    //      System.out.println("불합격");
    //    }

    //    int passScore = 60;
    //    int myScore = 75;
    ////    String result = (myScore >= passScore) ? "합격" : "불합격";
    //    System.out.println(myScore >= passScore ? "합격" : "불합격");
        char grade = 'ㄴ';
        switch (grade) {
          case 'A':
            System.out.println("Excellent");
            break;
          case 'B':
            System.out.println("Good");
            break;
          case 'C':
            System.out.println("Average");
            break;
          case 'D':
            System.out.println("Below Average");
            break;
          case 'F':
            System.out.println("Fail");
            break;
          default:
            System.out.println("잘못된 등급입니다.");
        }

    //    char operator = '+';
    //    int num1 = 10;
    //    int num2 = 20;
    //    switch (operator) {
    //      case '+':
    //        System.out.println(String.format("%s %s %s = %s", num1, operator, num2, num1 + num2));
    //        break;
    //      case '-':
    //        System.out.println(String.format("%s %s %s = %s", num1, operator, num2, num1 - num2));
    //        break;
    //      case '*':
    //        System.out.println(String.format("%s %s %s = %s", num1, operator, num2, num1 * num2));
    //        break;
    //      case '/':
    //        System.out.println(String.format("%s %s %s = %s", num1, operator, num2, (double)num1 /
    // num2));
    //        break;
    //      default:
    //        System.out.println("잘못된 연산자입니다.");
    //    }
    //    String color = "red";
    //    switch(color){
    //      case "red":
    //        System.out.println("Apple");
    //        break;
    //      case "green":
    //        System.out.println("Grass");
    //        break;
    //      case "blue":
    //        System.out.println("Sky");
    //        break;
    //      default:
    //        System.out.println("일치하는 값이 없습니다.");
    //    }
    //    int score = 78;
    //    switch (score / 10) {
    //      case 9:
    //        System.out.println("A");
    //        break;
    //      case 8:
    //        System.out.println("B");
    //        break;
    //      case 7:
    //        System.out.println("C");
    //        break;
    //      case 6:
    //        System.out.println("D");
    //        break;
    //      default:
    //        System.out.println("F");
    //    }
//    String language = "Java";
//    switch (language) {
//      case "Java":
//        System.out.println("Java는 객체지향언어입니다.");
//        break;
//      case "Python":
//        System.out.println("Python은 여러 라이브러리를 가지고 있습니다.");
//        break;
//      case "C++":
//        System.out.println("C++은 게임 개발에 사용됩니다.");
//        break;
//      case "JavaScript":
//        System.out.println("JavaScript은 프론트앤드의 유일한 언어입니다.");
//        break;
//      default:
//        System.out.println("일치하는 항목이 없습니다.");
//    }
  }
}
