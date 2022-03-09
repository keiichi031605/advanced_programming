
import java.util.ArrayList; 
public class Main {

public static void main(String[] args) {

    ArrayList<Person> employees = new ArrayList<Person>(); // Create an ArrayList object

    Person person1 = new Person("Keiichi", "Katsuno", 31, 1.7, 75.0);
    // person1.printData();
    employees.add(person1);
    
    Person person2 = new Person("Jinkoo", "Kang", 35, 1.75, 80.0);
    // person2.printData();
    employees.add(person2);

    SoftwareEngineer person3 = new SoftwareEngineer("Reece", "Arms", 28, 1.7, 65);
    employees.add(person3);

    for (int i = 0; i < employees.size(); i++) {
      Person employee = employees.get(i);
      employee.printData();
    }

    
    Person.printCount();
	}
}
