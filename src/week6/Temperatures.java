
package week6;
import java.util.ArrayList;
import java.util.Collections;

public class Temperatures {

    public final static int MIN_TEMP = -50;
    public final static int MAX_TEMP = 60;

    ArrayList<Integer> temps = new ArrayList<Integer>();
    
    public Temperatures () 
    {
    
    }
    
    public void setTemps(ArrayList<Integer> temps) {
        this.temps = temps;
    }
    
    public void add (int temp) throws InvalidTemp {
    // appends a new temperature reading to the collection
    // temp must be between MIN_TEMP and MAX_TEMP (Celcius)
        if (temp < MIN_TEMP || temp > MAX_TEMP)
            throw new InvalidTemp();
        else temps.add(temp);
    }        
    
    
    public int min()  {
    // returns the minimum temperature found
        return (int) Collections.min(temps);
    }

}

