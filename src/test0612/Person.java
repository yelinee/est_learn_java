package test0612;

public class Person {
  String name;
  int age;
  static final String GENDER = "여";
  final String address;

  public Person(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
    System.out.println("성별은 " + GENDER);
    System.out.println("사는 곳은 " + this.address);
  }
}
