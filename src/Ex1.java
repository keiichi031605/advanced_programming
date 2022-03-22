
import java.util.ArrayList;
import java.util.Collections;
public class Ex1 {

	public static void main(String[] args) {
    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
    myArrayList.add(3);
    myArrayList.add(1);
    myArrayList.add(7);
    myArrayList.add(20);
    myArrayList.add(5);

    // for (int i = 0; i < myArrayList.size(); i++) {
    //   int number = myArrayList.get(i);
    //   System.out.println(number);
    // }
    printMinMax(myArrayList);
  }

  public static void printMinMax(ArrayList<Integer> numbers) {
    int maxValue = Collections.max(numbers);
    System.out.println("Max value is: " + maxValue);

    int minValue = Collections.min(numbers);
    System.out.println("Minimum value is: " + minValue);
  }
}
