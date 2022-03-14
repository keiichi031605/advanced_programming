
// Week 2 practice, inheritance.
public class Person {
  private static int count = 0;
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;
  private String role;

  Person(String firstName, String lastName, int age, double height, double weight, String role) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.role = role;
  }
  // second constructor when middleName exists.
  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String role) {
    this(firstName, lastName, age, height, weight, role);
    this.middleName = middleName;
  }

  public String getMiddleName() {
    return this.middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  
  public String getRole(){
    return this.role;
  }
  public void setRole(String role){
    this.role = role;
  }

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("My name is " + this.fullName() + ".");
    System.out.println("My age is " + this.age + ".");
    System.out.println("BMI is " + Math.round(this.bmi()) + ".");
    System.out.println("My role is" + this.role + ".");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount(){
    System.out.println("Total number of person is "+Person.count+".");
  }
}
