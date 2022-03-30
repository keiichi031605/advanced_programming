package week2;

import java.util.ArrayList; 
public class Main {

public static void main(String[] args) {

    ArrayList<Person> employees = new ArrayList<Person>(); // Create an ArrayList object

    Person person1 = new Person("Keiichi", "Katsuno", 31, 1.7, 75.0, "RoR Developer");
    person1.setRole("Full-Stack Developer");
    employees.add(person1);
    
    Person person2 = new Person("Jinkoo", "WebDev", "Kang", 35, 1.75, 80.0, "React Developer");
    employees.add(person2);

    // SoftwareEngineer person3 = new SoftwareEngineer("Reece", "Arms", 28, 1.7, 65);
    // employees.add(person3);

    Vehicle car = new Car("TOYOTA", "Red");
    Vehicle bicycle = new Bicycle("FUJI", "Gray");
    
    person1.buy(bicycle);
    person2.buy(car);

    System.out.println("Car Info");
    car.printData();
    System.out.println("-----------------");
    System.out.println("Car Owner's Info");
    car.getOwner().printData();

    System.out.println("=================");
    System.out.println("Bicycle Info");
    bicycle.printData();
    System.out.println("-----------------");
    System.out.println("Bicycle Owner's Info");
    bicycle.getOwner().printData();

    // for (int i = 0; i < employees.size(); i++) {
    //   Person employee = employees.get(i);
    //   employee.printData();
    //   System.out.println("----------------------");
    // }

    
    Person.printCount();
	}
}
