import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public static void main(String[] args) {

      Scanner selection = new Scanner(System.in);
      
      while(true) {
        System.out.println("1. Buy a travel pass");
        System.out.println("2. Charge my MyTi");
        System.out.println("3. Show remaining credit");
        System.out.println("0. Quit");
        try {
          System.out.print("Please make a selection: ");
          int input1 = selection.nextInt();
          if (input1 == 1) {
            System.out.println("What time period:");
            System.out.println("a) 2 hours");
            System.out.println("b) All day");
            System.out.println("c) Cancel");
            System.out.print("Your selection: ");
            String input1a = selection.next();
            if (input1a.contains("a")) {
              System.out.println("Which zone:");
              System.out.println("a) Zone 1");
              System.out.println("b) Zones 1 and 2");
              System.out.println("c) Cancel");
              System.out.print("Your selection: ");
              String input1b = selection.next();
              if (input1b.contains("a")) {
                System.out.println("You purchased 2 hour pass for Zones 1, costing $2.50. Your remaining credit is ???"); 
              } else if (input1b.contains("b")) {
                System.out.println("You purchased 2 hour pass for Zones 1 and 2, costing $3.50. Your remaining credit is ???"); 
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
          } else if (input1 ==3) {
            System.out.println("select 3"); 
          } else if (input1 == 0) {
            System.out.println("quit");
            break;
          } else {
            System.out.println("invalid option");
          }
        } catch (InputMismatchException e) {
            System.out.println("\nSorry, that is not an integer, which is an invalid option!\n");
            selection.nextLine();
        }
      } 
  } 
}
