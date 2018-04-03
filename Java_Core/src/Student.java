
public class Student {
  private int id;
  private String name;
  public int a;
  protected int b;
  int c;

  public Student() {
    super();
  }

  public Student(int id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.id + " - " + this.name;
  }

  public void compare() {
    String a = "a";
    String b = "a";
    System.out.println(a == b);
    System.out.println(a.equals(b));
  }

  public static void main(String[] args) {
    new Student().compare();
  }

//  @Override
//  public int compareTo(Student o) {
//    return Integer.valueOf(this.id).compareTo(o.getId());
//  }
}
