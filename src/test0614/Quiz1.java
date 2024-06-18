package test0614;

import java.util.Scanner;

public class Quiz1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("첫 번째 정수를 입력하세요: ");
    int num1 = scanner.nextInt();
    System.out.print("두 번째 정수를 입력하세요: ");
    int num2 = scanner.nextInt();

    try {
      System.out.println(num1 / num2);
    } catch (ArithmeticException e) {
      System.out.println("0으로 정수를 나눌 수 없습니다.");
    } finally {
      scanner.close();
    }

  }
}
