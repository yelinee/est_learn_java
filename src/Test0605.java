import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test0605 {
  public static void main(String[] args) {
    //    String[] words = {"apple", "banana", "cherry", "durian"};
    // 단어 쌍의 순서를 고려함
    //    for (int i = 0; i < words.length; i++) {
    //      for (int j = 0; j < words.length; j++) {
    //        if (words[i] == words[j]) continue;
    //        System.out.println(words[i] + " " + words[j]);

    // 단어 쌍의 순서를 고려하지 않음
    //    for (int i = 0; i < words.length; i++) {
    //      for (int j = i + 1; j < words.length; j++) {
    //        System.out.println(words[i] + " " + words[j]);
    //      }
    //    }

    // 선생님 코드(i의 불필요한 범위를 줄임)
    //    for (int i = 0; i < words.length - 1; i++) {
    //      for (int j = i + 1; j < words.length; j++) {
    //        System.out.println(words[i] + " " + words[j]);
    //      }
    //    }

    // foreach 활용(비추 방법)
    //    int index = 0;
    //    for (String word : words) {
    //      for (int i = index + 1; i < words.length; i++) {
    //        String word2 = words[i];
    //        System.out.println(word + " " + word2);
    //      }
    //      index++;
    //    }

    //    Scanner sc = new Scanner(System.in);
    //
    //    System.out.println("정수를 입력해주세요.");
    //    int number = sc.nextInt();
    //    sc.nextLine(); // 엔터도 문자열로 인식하기 때문에 필요
    //
    //    System.out.println("문자열을 입력하세요: ");
    //    String line = sc.nextLine();
    //
    //    System.out.println("정수는 = " + number);
    //    System.out.println("문자열은 = " + line);
    //
    //    sc.close();

    // 문자열을 입력시 그냥 런타임 에러가 남. 이를 개선하고 싶음!
    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("계절을 맞혀보세요!");
    //    int season = sc.nextInt();
    //
    //    switch(season){
    //      case 1:
    //        System.out.println("봄");
    //        break;
    //      case 2:
    //        System.out.println("여름");
    //        break;
    //      case 3:
    //        System.out.println("가을");
    //        break;
    //      case 4:
    //        System.out.println("겨울");
    //        break;
    //      default:
    //        System.out.println("잘못된 입력입니다!");
    //    }

    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("계절을 맞혀보세요!");
    //    String season = sc.nextLine();
    //    // 숫자 외의 문자열 입력 시 런타임 에러가 남. 이를 개선하기 위해 문자열로 입력 받음.
    //
    //    switch(season){
    //      case "1":
    //        System.out.println("봄");
    //        break;
    //      case "2":
    //        System.out.println("여름");
    //        break;
    //      case "3":
    //        System.out.println("가을");
    //        break;
    //      case "4":
    //        System.out.println("겨울");
    //        break;
    //      default:
    //        System.out.println("잘못된 입력입니다!");
    //    }

    //    Random random = new Random();
    //
    //    boolean i = random.nextBoolean();
    //    System.out.println(i);

    //    Random random = new Random();
    //    int number = 0;
    //    ArrayList<Integer> list = new ArrayList<Integer>();
    //    for (int i = 0; i < 6; i++) {
    //      number = random.nextInt(45) + 1;
    //      list.add(number);
    //    }
    //    System.out.print("로또 번호: ");
    //    for (int num : list) {
    //      System.out.print(num + " ");
    //    }

    // 선생님 코드
    //    Random random = new Random();
    //    ArrayList<Integer> list = new ArrayList<Integer>();
    //
    //    while (list.size() != 6) {
    //      int number = random.nextInt(45) + 1;
    //
    //      if (!list.contains(number)) {
    //        list.add(number);
    //      }
    //    }
    //    for (int data : list) {
    //      System.out.println(data);
    //    }

    // set은 알아서 중복을 제거해줌. 더 편함
    //    Set<Integer> set = new HashSet<Integer>();
    //    while(set.size()!=){
    //      int number = random.nextInt(45) + 1;
    //      set.add(number);
    //    }

    //    Random random = new Random();
    //    int targetNum = random.nextInt(100) + 1;
    //
    //    Scanner sc = new Scanner(System.in);
    //    while (true) {
    //      System.out.println("1~100 사이의 숫자를 입력하세요.");
    //      int input = sc.nextInt();
    //      if (input > 100 || input < 1) {
    //        System.out.println("범위를 벗어났습니다.");
    //      } else if (input == targetNum) {
    //        System.out.println("정답입니다!");
    //        break;
    //      } else if (input > targetNum) {
    //        System.out.println("더 작은 수를 입력하세요.");
    //      } else {
    //        System.out.println("더 큰 수를 입력하세요.");
    //      }
    //    }
    //    sc.close();

    //    Scanner sc = new Scanner(System.in);
    //    System.out.println("관람하시고자 하는 영화를 입력하세요.");
    //    String movieTitle = sc.nextLine();
    //    System.out.println("관람 인원 수를 입력하세요.");
    //    int numPeople = sc.nextInt();
    //    sc.nextLine();
    //    System.out.println("예매자의 이름을 입력하세요.");
    //    String name = sc.nextLine();
    //    System.out.println("예매자의 번호를 입력하세요.");
    //    String tel = sc.nextLine();
    //
    //    System.out.println("===== 영화 티켓 예매 정보 =====");
    //    System.out.println("영화 제목: " + movieTitle);
    //    System.out.println("관람 인원: " + numPeople+"명");
    //    System.out.println("예매자 이름: " + name);
    //    System.out.println("예매자 전화번호: " + tel);
    //    System.out.println("총 결제 금액: " + 10000 * numPeople + "원");
    //
    //    sc.close();

  }
}
