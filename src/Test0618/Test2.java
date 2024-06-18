package Test0618;

import java.util.Arrays;

public class Test2 {
  public static void main(String[] args) {
    Course<Person> personCourse = new Course<>("일반인", 5);
    personCourse.add(new Person("일반인"));
    personCourse.add(new Worker("직장인"));
    personCourse.add(new Student("학생"));
    personCourse.add(new HighStudent("고등학생"));

    Course<Worker> workerCourse = new Course<>("직장인과정", 5);
    workerCourse.add(new Worker("직장인")); // Person 객체는 안 됨

    Course<Student> studentCourse = new Course<>("학생과정", 5);
    studentCourse.add(new Student("학생"));
    studentCourse.add(new HighStudent("고등학생"));

    Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
    highStudentCourse.add(new HighStudent("고등학생"));

    registerCourse(personCourse); // 와일드카드가 모든 타입이기 때문에 다 가능
    registerCourse(workerCourse);
    registerCourse(studentCourse);
    registerCourse(highStudentCourse);

    System.out.println("=====================================");
    System.out.println("=====================================");

    registerCourseStudent(studentCourse); // workerCourse, personCourse은 상속 제약 범주를 벗어났기 때문에 불가
    registerCourseStudent(highStudentCourse);

    System.out.println("=====================================");
    System.out.println("=====================================");

    registerCourseWorker(personCourse);
    registerCourseWorker(workerCourse);
  }

  public static void registerCourse(Course<?> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseStudent(Course<? extends Student> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseWorker(Course<? super Worker> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }
}
