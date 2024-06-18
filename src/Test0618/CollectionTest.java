package Test0618;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTest {

  public static void main(String[] args) {

    //    List<String> arrayList = new ArrayList<>();
    //    arrayList.add("Java");
    //    arrayList.add("Spring");
    //    arrayList.add("Servlet/JSP");
    //    arrayList.add("DBMS");
    //    arrayList.add("JPA");
    //
    //    System.out.println("총 객체수: " + arrayList.size());
    //    System.out.println("============================");
    //
    //    System.out.println("두 번째 인덱스: " + arrayList.get(2));
    //
    //    System.out.println("============================");
    //
    //    // foreach문
    //    for (String str : arrayList) {
    //      System.out.println(str);
    //    }
    //
    //    System.out.println("============================");
    //
    //    System.out.println(arrayList.contains("java"));
    //    System.out.println(arrayList.contains("Java"));
    //
    //    System.out.println("============================");
    //
    //    ArrayList<Object> objects = new ArrayList<>();
    //
    //    objects.add(null);
    //
    //    System.out.println(objects.isEmpty()); // null값도 값이다. null 값이 들어가기 때문에 false가 나옴.
    //    objects.clear();
    //    System.out.println(objects.isEmpty());

    List<String> arrayList = new ArrayList<>();
    List<String> linkList = new LinkedList<>();

    long startTime, endTime;
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("arrayList 걸린시간: " + (endTime - startTime));

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("arrayList 걸린시간: " + (endTime - startTime));
  }
}
