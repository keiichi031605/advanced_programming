
import java.util.ArrayList;
public class Ex1 {

	public static void main(String[] args) {
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
    myArrayList.add(-5);
    myArrayList.add(20);
    myArrayList.add(0);
    myArrayList.add(100);

    printAverage(myArrayList);
  }

  public static void printAverage(ArrayList<Integer> numbers) {
    int sum = 0;
    int count = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) > -1) {
        sum = sum + numbers.get(i);
        count = count + 1;
      }
    }
    double av = sum/count;
    
    System.out.println("Average value is: " + av);
  }
}
