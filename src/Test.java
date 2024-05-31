import java.util.Arrays;
import java.util.List;

public class Test {
//  /**
//   * @apiNote 자바독입니다.
//   */
//  // shift+del 한 문장 지우기
//  // alt+insert
//  /*        //{타입} 변수명 = 값;
//  int a = 10;
//  // 변수를 선언하면서 값을 (초기화 후) 대입하였다. 강타입 언어
//  // 컴파일 에러, 런타임 에러 -> 컴파일 에러를 최대한 많이 잡아야지 유지보수가 좋음
//
//  int b, c; // 선언만 할 수도 있음
//  // 변수명이 매우 중요함. 카멜케이스로 작성할 것.
//  // 클래스명은 대문자부터, 메서드명은 소문자부터*/
//  // ctrl+alt+l: 자동 정렬
  public static void main(String[] args) {
    //    // int a = 50, b = 50, c = 0;
    //    //    int a = 50;
    //    //    int b = 50;
    //    //    int c = 0;
    //    //    System.out.println(a + b + c);
    //    /* // 정수형 자료형
    //        int a = 1;
    //        byte b = 2;
    //        long c = 3;
    //        short d = 4;
    //
    //        // 실수형 자료형
    //        float e = 0.1f; // float 뒤에는 f가 반드시 붙여야 함. 그렇기 때문에 double을 더 많이 선호하는 듯..?
    //        double f = 0.2; // 뒤에 d를 붙이기도 함.
    //
    //        // 문자형('' 작은따옴표 사용)
    //        char g = 'a';
    //
    //        // 불리언형
    //        boolean isTrue = true; // 조건문에 많이 사용한다.
    //        boolean isFalse = false;
    //
    //        // 문자열형
    //        String str = "Hello World"; // ctrl + b -> java에서 제공하는 클래스임을 확인할 수 있음.
    //        // str. // String 클래스가 제공하는 함수를 사용할 수 있음. 왼쪽은 input, 오른쪽은 output 값
    //    */
    //    //    int n1 = 2147483648;
    //    //    //int n1 = 214_748_364_8 // 가독성을 위해 언더바로 끊어줄 수 있음.
    //    //    int n2 = -2147483649;
    //    //    short n3 = 44444;
    //
    //    /*    char c1 = 'A';
    //    char c2 = 65;
    //    char c3 = '\u0041';
    //
    //    char c4 = '가';
    //    char c5 = 44032;
    //    char c6 = '\uac00';
    //
    //    int uniCode = c1;
    //
    //    System.out.println(c1);
    //    System.out.println(c2);
    //    System.out.println(c3);
    //    System.out.println(c4);
    //    System.out.println(c5);
    //    System.out.println(c6);
    //    System.out.println(uniCode);*/
    //
    //    short sVal = 10;
    //    short result = (short) (sVal + 10); // 형변환. 타입을 변환한다. 변환하기 전에는 10 때문에 int로 변환됨.
    //    System.out.println(result);
    //
    //    float myFloat = 9.75f;
    //    float anotherFloat = myFloat * 2;
    //
    //    System.out.println("original float value = " + myFloat);
    //    System.out.println("original float value = " + (int) myFloat);
    //    System.out.println("calculated float value = " + anotherFloat);
    //    System.out.println(
    //        "calculated float value = " + (byte) anotherFloat); // 형변환은 조심해서 사용할 것. 에러가 발생하기 쉬움.
    //
    //    boolean isTrue = false;
    //    // !: 부정. 반전
    //    if (!isTrue) {
    //      System.out.println("이건 트루입니다.");
    //    } else {
    //      System.out.println("이건 펄스입니다.");
    //    }

    List<Integer> list = Arrays.asList(1);
    System.out.println(list.get(0));

    int[] arr = new int[10]; // {0, 0, 0 ..., 0} 으로 초기값이 설정되어있음. 따라서 출력값은 0이 된다.
    System.out.println(arr[0]);
  }
}
//public class Test implements TestInterface {
//  public static void main(String[] args){
//    int a = 10;
//  }
//
//  @Override
//  public void test() {
//
//  }
//}