
// Managing Bird class
import java.util.ArrayList; 
public class Week2 {

	public static void main(String[] args) {
    ArrayList<Bird> bird_database = new ArrayList<Bird>();

    Bird bird_a = new Bird("general bird", "white");
    bird_database.add(bird_a);
    // System.out.println(bird_a.greeting());
    // System.out.println(bird_a.fly());

    Bird bird_b = new Eagle("Keiichi", "red");
    bird_database.add(bird_b);
    // System.out.println(bird_b.greeting());
    // System.out.println(bird_b.fly());

    Bird bird_c = new Chicken("KFC", "brown");
    bird_database.add(bird_c);
    // System.out.println(bird_c.greeting());
    // System.out.println(bird_c.fly());
    
    for (int i = 0; i < bird_database.size(); i++) {
      Bird bird = bird_database.get(i);
      System.out.println(bird.greeting());
      System.out.println(bird.fly());
    }
// google other way of for loop in java as well!!

	}

}
