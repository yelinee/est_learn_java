public class Test0531 {
  public static void main(String[] args) {
    /*String firstName = "Yelin";
    String secondName = "Park";
    String phone = "galaxy";
    String status = "so good";
    System.out.println("나는 " + secondName + " " + firstName + "입니다.");

    System.out.println(phone + " is " + status + ".");

    System.out.println(firstName==secondName);*/

    /*String a = "Hello";
    String b = new String("hello");

    System.out.println(a.equals(b)); // true
    System.out.println(a == b); // false. 값을 비교하는 것이 아니라 메모리의 주소를 비교하기 때문.*/

    //    String b = "ESTSOFT";
    //    b.contains("SOFT");
    /*    String findChar = "What is your hoppy";
    System.out.println(
        findChar.charAt(13)
            + ""
            + findChar.charAt(14)
            + findChar.charAt(15)
            + findChar.charAt(16)
            + findChar.charAt(17));*/

    //    String a = "Hello World!";
    //    System.out.println(a.replaceAll("World", "Java"));

    //    String a = "WEEEE ASKE ;ND";
    //    System.out.println(
    //        a.substring(0, 3) + a.substring(8, 10) + a.substring(12, 14));

    //    String a = "a:b:c:d";
    //    String[] split = a.split(":");
    //    System.out.println(split[0]);
    //    System.out.println(split[1]);
    //    System.out.println(split[2]);
    //    System.out.println(split[3]);

    //    String result = "Hello";
    //    System.out.println(result + "!");
    //    System.out.println(result);
    //    String concat = result.concat("!");
    //    System.out.println(result);

    //    String name1 = "Tim";
    //    int age1 = 30;
    //
    //    String name2 = "Anna";
    //    int age2 = 45;
    //
    //    String.format("%s의 나이는 %s세 입니다.", name1, age1);
    //    String.format("%s의 나이는 %s세 입니다.", name2, age2);

    /*    String name1 = "Tim";
    int age1 = 30;

    String name2 = "Anna";
    int age2 = 45;

    System.out.printf("%s의 나이는 %s세 입니다%n", name1, age1); // System.out.println(String.format("%s의 나이는 %s세 입니다.", name1, age1));
    System.out.printf("%s의 나이는 %s세 입니다%n", name2, age2);
    // 인자 개수에 제한은 없으나 많으면 가독성이 떨어짐.*/

    /*    String result = "";
        result += "Hello ";
        result += "java ";
        result += "World!";
        System.out.println(result); // 메모리 문제 발생. 이를 해결하귀 위한 것이 StringBuilder

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("java ");
        sb.append("World!");
    //    System.out.println(sb);
        System.out.println(sb.toString());

        StringBuffer sf =  new StringBuffer();
        sf.append("Hello ");
        sf.append("java ");
        sf.append("World!");
        System.out.println(sf);*/

    /*    StringBuffer sb = new StringBuffer();
    sb.append("Hello");
    sb.insert(0, "World");
    sb.insert(0, "World");
    sb.insert(0, "World");
    sb.insert(0, "World");
    System.out.println(sb);*/

    /*    int[] arr = new int[100];
    System.out.println(arr); // 배열 arr의 주소값 출력
    System.out.println(arr[0]); // [0, 0, 0 ...] 초기화된 값 0 출력

    String[] arr2 = new String[1000];
    System.out.println(arr2[0]); // 초기값 null 출력*/

    //    int x = 5;
    //    int y = 5;
    //
    //    System.out.println("전위 증가 연산자: " + (++x));
    //    System.out.println("후위 증가 연산자: " + (y++));
    //    System.out.println("========================");
    //    System.out.println("x = " + x);
    //    System.out.println("y = " + y);

    //    int x = 100;
    //    int y = 100;
    //
    //    System.out.println("전위 감소 연산자: " + (--x)); // 값: 99 출력: 99
    //    System.out.println("후위 감소 연산자: " + (y--)); // 값: 99 출력: 100
    //    System.out.println("전위 감소 연산자: " + (--x)); // 값: 98 출력: 98
    //    System.out.println("후위 감소 연산자: " + (y--)); // 값: 98 출력: 99
    //    System.out.println("전위 감소 연산자: " + (--x)); // 값: 97 출력: 97
    //    System.out.println("후위 감소 연산자: " + (y--)); // 값: 97 출력: 98
    //
    //    System.out.println("x = " + x);
    //    System.out.println("y = " + y);

    boolean isRaining = true;

    if (isRaining) {
      System.out.println("하늘에서 비가 와요.");
    }
    if (!isRaining) {
      System.out.println("비가 안 옵니다.");
    }

    boolean isSunny = false;

    if (!isSunny) {
      System.out.println("집에서 쉽니다.");
    } else {
      System.out.println("날씨가 맑아요.");
    }

    double[] arr = new double[100];
  }
}
