import java.util.Scanner;

public class Test0611 {
  public static void main(String[] args) {
    //    System.out.println(add(2, 3));
    //    System.out.println(minus(3, 4));
    //    System.out.println(times(5, 3));
    //    System.out.println(division(6, 2));

    //    Test2 okayTest2 = new Test2();
    //    System.out.println(okayTest2.b);
    //    System.out.println(okayTest2.good());
    //
    //    Test2.call(1, 2);
    //    Test2 test2 = new Test2();
    //    System.out.println(test2.add(1, 2));
    //    System.out.println(test2.minus(3, 4));

    Person person1 = new Person("박예린", 01000000000, 100000, 10);
    //    Person person2 = new Person("홍길동", 01000000003, 200000, 20);
    //    Person person3 = new Person("심청이", 01000000002, 200000, 30);
    //    Person person4 = new Person("콩쥐", 01000000001, 200000, 40);
    //    person1.sayHello();
    //    person1.sayMoney();

    //    Student student = new Student();
    //
    //    person1.teaching(student);
    //    person1.cheating(student);
    //    person1.cheating(student);

    Scanner sc = new Scanner(System.in);

    System.out.println("계좌번호를 입력하세요: ");
    String accountNumber = sc.nextLine();
    System.out.println("소유자 이름을 입력하세요:");
    String ownerName = sc.nextLine();

    BankAccount account = new BankAccount(accountNumber, ownerName);

    account.deposit(1000000);
    account.withdraw(20000);

    account.printBalance();

    sc.close();
  }

  //  static int add(int a, int b) {
  //    return a + b;
  //  }
  //
  //  static int minus(int a, int b) {
  //    return a - b;
  //  }
  //
  //  static int times(int a, int b) {
  //    return a * b;
  //  }
  //
  //  static int division(int a, int b) {
  //    return a / b;
  //  }
  //
  //  static boolean login(String email, String pw){
  //    return true;
  //  }
}
