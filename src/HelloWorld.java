
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // no.1
	    for (int i = 0; i < 16; i++) {
	      if (i > 9) {
	        System.out.println("================================================");
	      } else if (i % 2 == 0) {
	        System.out.println("* * * * * * ====================================");
	      } else {
	        System.out.println(" * * * * *  ====================================");
	      }
	    }
	    // no.2
	    Integer dec = 25;
	    String bin = Integer.toBinaryString(dec);
	    System.out.println(bin);

	    // no.3
	    { float Fahrenheit, Celsius;  
	      Fahrenheit = 43;  
	      Celsius  = ((Fahrenheit-32)*5)/9;  
	      System.out.println("Temperature in celsius is: "+Celsius);  
	    }

	    // no.4
	    Integer num = 0;
	    for (int i = 0; i < 1001; i++) {
	      num = i;

	    }
	}
}
