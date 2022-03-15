class Car extends Vehicle {
  private int fuel = 50;

  Car(String name, String color) {
    super(name, color);
  }

  public int getFuel() {
    return this.fuel;
  }

  public void printData() {
    super.printData();
    System.out.println(this.fuel + "L of petrol left");
  }

  public void run(int distance) {
    System.out.println("Able to run " + distance + "km");
    if (distance <= this.fuel) {
      this.distance += distance;
      this.fuel -= distance;
    } else {
      System.out.println("Not enough petrol");
    }
    System.out.println("Distance: " + this.distance + "km");
    System.out.println("Petrol: " + this.fuel + "L");
  }

  public void charge(int litre) {
    System.out.println(litre + "L is charged.");
    if (litre <= 0) {
      System.out.println("Can't fulfill");
    } else if (litre + this.fuel >= 100) {
      System.out.println("Fulfill the petrol");
      this.fuel = 100;
    } else {
      this.fuel += litre;
    }
    System.out.println(this.fuel + "L of petrol left");
  }
}
