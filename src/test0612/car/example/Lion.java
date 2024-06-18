package test0612.car.example;

import test0612.car.Animal;

public class Lion extends Animal {
  public static void main(String[] args) {
    Lion lion = new Lion();
    System.out.println("이름: " + lion.name);
    System.out.println("성별: " + lion.gender);
  }
}
