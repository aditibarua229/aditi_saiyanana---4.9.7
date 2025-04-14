public class StudentRunner
{ 
  public static void main(String[] args) 
  { 
    Student s = new Student("Alice", 101, "Freshman"); 
    Student t = new Student("Bob", 101, "Sophomore"); 
    Student r = new Student("Charlie", 202, "Junior");

    // Test equals (based on ID)
    System.out.println(s.equals(t)); // true, same ID
    System.out.println(s.equals(r)); // false, different ID

    // Print out objects to test toString
    System.out.println(s); 
    System.out.println(t);
    System.out.println(r);
  } 
}
