
public class Main {

public static void main(String[] args) {
  // TODO Auto-generated method stub
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    
    Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    person2.printData();
    
    Person.printCount();
	}
}
