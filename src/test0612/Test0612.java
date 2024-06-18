package test0612;

public class Test0612 {
  public static void main(String[] args) {
    Person person1 = new Person("예린", 27, "남양주시");
    Person person2 = new Person("max", 26, "용인시");

    person1.sayHello();
    person1.introduce();


    person2.sayHello();
    person2.introduce();


  }
}
