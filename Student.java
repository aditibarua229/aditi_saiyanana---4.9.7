public class Student 
{ 
  private String name;
  private int id;
  private String year;

  // Constructor that requires all attributes
  public Student(String name, int id, String year) 
  { 
    this.name = name;
    this.id = id;
    this.year = year;
  } 

  // toString method to show all attributes
  @Override
  public String toString() 
  {
    return "Name: " + name + ", ID: " + id + ", Year: " + year;
  }

  // equals method comparing by id
  @Override
  public boolean equals(Object obj)
  {
    if (this == obj) return true;  // same object in memory
    if (obj == null || getClass() != obj.getClass()) return false;

    Student other = (Student) obj;
    return this.id == other.id;
  }
}
