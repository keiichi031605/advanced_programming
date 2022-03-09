
public class Bird {
  public String name, colour;
  Bird(String name, String colour) {
    this.name = name;
    this.colour = colour;
  } 

  public String greeting() {
    return "My name is " + this.name + ". My body is " + this.colour;
  }

  public String fly() {
    return "Yeahhhh I'm flying!!!";
  }
  
}
