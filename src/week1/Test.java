package week1;
// Test for assignment 1
import java.util.Scanner;
import java.util.InputMismatchException;
public class Test {
	public static void main(String[] args) {

			Scanner Selection1 = new Scanner(System.in);
			do {
        System.out.println("1. Buy a travel pass");
        System.out.println("2. Charge my MyTi");
        System.out.println("3. Show remaining credit");
        System.out.println("0. Quit");
        
        try {
					System.out.print("Please make a selection: ");
					int input1 = Selection1.nextInt();
					if (input1 == 1) {
						System.out.println("What time period:");
            System.out.println("a) 2 hours");
            System.out.println("b) All day");
            System.out.println("c) Cancel");
            System.out.print("Your selection: ");
            
            String input1a = Selection1.next();
            if (input1a.contains("a")) {
              System.out.println("Which zone:");
              System.out.println("a) Zone 1");
              System.out.println("b) Zones 1 and 2");
              System.out.println("c) Cancel");
              System.out.print("Your selection: ");
              
              String input1b = Selection1.next();
              if (input1b.contains("a")) {
                System.out.println("You purchased 2 hour pass for Zones 1, costing $2.50. Your remaining credit is ???"); 
              } else if (input1b.contains("b")) {
                System.out.println("You purchased 2 hour pass for Zones 1 and 2, costing $3.50. Your remaining credit is ???"); 
              } else if (input1b.contains("c")) {
                System.out.println("Cancel"); 
              }
            } else if (input1a.contains("b")) {
              System.out.println("Which zone:");
              System.out.println("a) Zone 1");
              System.out.println("b) Zones 1 and 2");
              System.out.println("c) Cancel");
              System.out.print("Your selection: ");
            }
          } else if (input1 == 2) {
            System.out.println("select 2"); 
          }
          } catch (InputMismatchException e) {
          System.out.println("\nSorry, that is not an integer, which is an invalid option!\n");
        }
        Selection1.nextLine();
        Selection1.close();
			} while(true);
  }
}

