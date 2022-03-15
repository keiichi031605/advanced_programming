class Bicycle extends Vehicle {
  Bicycle(String name, String color) {
    super(name, color);
  }

  public void run(int distance) {
    System.out.println("Able to run" + distance + "km");
    this.distance += distance;
    System.out.println("Distance this bicycle ran is " + this.distance + "km");
  }
}
