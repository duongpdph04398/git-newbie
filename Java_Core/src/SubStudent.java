import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubStudent {

  LocalDate dat = LocalDate.now();

  public static void main(String[] args) {
    System.out.println("In main block !");
    List<String> strList = new ArrayList<>();
    strList.add("duong");
    strList.add("thanh");
    strList.add("anh");
    for (int i = 0; i < strList.size(); i++) {
      System.out.println(strList.size());
      if (strList.get(i).equals("thanh")) {
        System.out.println("Remove " + strList.remove("thanh"));
      }
      System.out.println(strList.get(i));
    }
    Iterator<String> iterator = strList.iterator();
    String data;
    while (iterator.hasNext()) {
      data = iterator.next();
      System.out.println(data);
      if (data.equals("duong")) {
        System.out.println("Removed " + strList.remove(data));
      }
    }
    // for (String s : strList) {
    // System.out.println(s);
    // }
  }

  static {
    System.out.println("In block static !");
  }

}
// class Student2 {
// public static void main(String[] args) {
//
// }
// }
//
// class Student3 {
// public static void main(String[] args) {
//
// }
// }
