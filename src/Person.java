public class Person {

  String name;
  int phoneNumber;
  int money;
  int age;

  // 생성자
  public Person(String name, int phoneNumber, int money, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.money = money;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("my name is " + name);
  }

  public void sayMoney() {
    System.out.println(String.format("내가 가지고 있는 돈은 %s원이야!", money * 10000));
  }

  public void teaching(Student student) {
    student.levelUp();
  }

  public void cheating(Student student) {
    student.levelDown();
  }
}
