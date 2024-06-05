import java.util.stream.IntStream;
import java.util.Arrays;

public class Test0604 {
  public static void main(String[] args) {
    // 반복문
    //    int i = 1;
    //    while (i <= 5) { // i가 5이 되면 반복문 탈출
    //      System.out.println("i = " + i);
    //      i++;
    //    }

    //    int count = 10;
    //    while (count >= 0) {
    //      System.out.println("현재 카운트: " + count);
    //      count--;
    //    }
    //    System.out.println("카운트 종료");

    //    int n = 100;
    //    int i = 1;
    //    int result = 0;
    //    while (i <= 100) {
    //      result += i;
    //      i++;
    //    }
    //    System.out.println(String.format("1부터 %s까지의 합: %s", n, result));
    //
    //    // 실무에서는 이런 식으로 함
    //    int sum = IntStream.rangeClosed(1, 100).sum();
    //    System.out.println(sum);

    //    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    //    int i = 0;
    //    int sum = 0;
    //    while (i < numbers.length) {
    //      sum += numbers[i];
    //      i++;
    //    }
    //    System.out.println(sum/numbers.length);

    //    int i = 0;
    //    while (i <= 300) {
    //      if (i % 3 == 0) {
    //        System.out.println(i);
    //      }
    //      i++;
    //    }

    //    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    //    int i = 1;
    //    int max = numbers[0];
    //    while (i < numbers.length) {
    //      if (max < numbers[i]) {
    //        max = numbers[i];
    //      }
    //      i++;
    //    }
    //    System.out.println(max);

    //    int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    //    int positiveSum = 0;
    //    int negativeSum = 0;
    //    int i = 0;
    //    while (i < numbers.length) {
    //      if (numbers[i] > 0) {
    //        positiveSum += numbers[i];
    //      } else {
    //        negativeSum += numbers[i];
    //      }
    //      i++;
    //    }
    //    System.out.println("양수: " + positiveSum);
    //    System.out.println("음수: " + negativeSum);
    //
    //    // 실무에서는
    //    int posNum = IntStream.of(numbers).filter(num -> num > 0).sum();
    //    int neNum = IntStream.of(numbers).filter(num -> num < 0).sum();

    //    for (int i = 0; i <= 5; i++) {
    //      System.out.println("현재 i의 값은 " + i);
    //    }
    //    int sum = 0;
    //    for (int i = 1; i <= 100; i++) {
    //      if (i % 2 == 0) {
    //        sum += i;
    //      }
    //    }
    //    System.out.println(sum);

    //    int sum = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum();
    //    System.out.println(sum);

    //    int n = 20;
    //    int result = 0;
    //    for (int i = 1; i <= n; i++) {
    //      if (i % 3 == 0 && i % 5 == 0) {
    //        result += i;
    //      }
    //    }
    //    System.out.println("result = " + result);
    //
    //    int streamResult = IntStream.rangeClosed(1, n).filter(i -> (i % 3 == 0) && (i % 5 ==
    // 0)).sum();
    //    System.out.println("streamResult = " + streamResult);

    //    int num1 = 1;
    //    int num2 = 1;
    //    for (int i = 3; i <= 10; i++) {
    //      int temp = num1;
    //      num1 = num1 + num2;
    //      num2 = temp;
    //    }
    //    System.out.println(num1);

    //    // 배열 사용해서 구현
    //    int[] arr = new int[6];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //    for (int n=2; n<arr.length;n++){
    //      arr[n] = arr[n - 2] + arr[n - 1];
    //    }
    //    for(int i:arr){
    //      System.out.println(i);
    //    }

    //    for (int i = 0; i >= -100; i--) {
    //      if (i % 2 == 0) System.out.println(i);
    //    }

    //        IntStream.rangeClosed(0, -100).filter(i -> i % 2 == 0).forEach(System.out::println);
    //    System.out.println(IntStream.rangeClosed(0, -100).filter(i -> i % 2 == 0).sum());

    //    int[] arr = new int[100];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //    //    for (int i = 2; i < arr.length; i++) {
    //    //      arr[i] = arr[i - 2] + arr[i - 1];
    //    //    }
    //    Arrays.parallelSetAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
    //    for (int i : arr) {
    //      System.out.println(i);
    //    }

    //    for (int i = 2; i < 10; i++) {
    //      System.out.println(i + "단");
    //      for (int j = 1; j < 10; j++) {
    //        System.out.println(String.format("%s * %s = %s", i, j, i * j));
    //      }
    //    }

    //    for (int i = 19; i > 0; i--) {
    //      for (int j = 19; j > 0; j--) {
    //        System.out.println(String.format("%s * %s = %s", i, j, i * j));
    //      }
    //    }
    //    int number = 0;
    //    while (number < 10) {
    //      System.out.println("현재숫자: " + number);
    //      if (number == 5) {
    //        System.out.println("5가 되었습니다.");
    //        break;
    //      }
    //      number++;
    //    }

    //    for (int i = 0; i < 10; i++) {
    //      System.out.println("현재 i의 값은: " + i);
    //      for (int j = 0; j < 10; j++) {
    //        System.out.println("현재 j의 값은: " + j);
    //        if(j==5){
    //          break;
    //        }
    //      }
    //    }

    //    for (int i=1; i<=100; i++){
    //      if(i==50) break;
    //      System.out.println("i = " + i);
    //      for(int j=2; j<=100; j++){
    //        if(j==80)  break;
    //        System.out.println("j = " + j);
    //      }
    //    }
    //    int number = 0;
    //
    //    while (number < 10) {
    //      number++;
    //      if (number == 3) {
    //        continue;
    //      } else {
    //        System.out.println("현재 값은: " + number);
    //      }
    //    }

    //    for (int i = 1; i <= 10; i++) {
    //      if (i == 4 || i == 7) continue;
    //      System.out.println(i);
    //    }

    int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    //    int sum = 0;
    //    for (int score : scores) {
    //      sum += score;
    //    }
    //    System.out.println("합: " + sum);
    //    System.out.println("평균: " + (double) sum / scores.length);

    //    System.out.println(IntStream.of(scores).sum());
    //    System.out.println(IntStream.of(scores).average());

    //    String[] names = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    //
    //    for (String name : names) {
    //      if (name.length() >= 5) System.out.println(name);
    //    }
    //    int count =1;
    //    while(true){
    //      System.out.println(count);
    //      if(count==10000) break;
    //      count++;
    //    }
    for (int i = 9; i >= 2; i--) {
      System.out.println("--------------------");
      for (int j = 9; j >= 1; j--) {
        System.out.println(String.format("%s * %s = %s", i, j, i * j));
      }
    }
  }
}
