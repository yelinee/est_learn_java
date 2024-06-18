package test0614;

import java.util.Scanner;

public class Quiz2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("만들고자 하는 배열의 크기를 입력하세요: ");
    int arraySize = scanner.nextInt();
    int[] array = new int[arraySize];

    for (int i=0; i<arraySize; i++){
      System.out.print("배열의 요소를 입력하세요: ");
      array[i] = scanner.nextInt();
    }
    try {
        System.out.print("접근하고자 하는 인덱스를 입력하세요: ");
        int input = scanner.nextInt();

        System.out.println("해당 인덱스의 값은 "+ array[input]+"입니다.");
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println("입력값이 배열의 크기를 넘어갔습니다.");
    }finally{
      scanner.close();
    }
  }
}
