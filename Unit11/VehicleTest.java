import java.util.*;
public class VehicleTest{

  public static void printVehicles(ArrayList <Vehicle> vehicles){
    for(Vehicle v : vehicles){
        System.out.println("Vehicle name: " + v.name());
        System.out.println("Number of wheels: " + v.wheelCount());
        System.out.println("Human powered?: " + v.isHumanPowered());
        System.out.println();
    }
  }

  public static void main(String[] args){

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Car c = new Car();
    vehicles.add(c);

    Motorcycle m = new Motorcycle();
    vehicles.add(m);

    Bicycle b = new Bicycle();
    vehicles.add(b);

    Unicycle u = new Unicycle();
    vehicles.add(u);

    VehicleStats vs = new VehicleStats();

    System.out.println("All vehicles:");
    System.out.println();
    printVehicles(vehicles);

    System.out.println();

    System.out.println("Total wheels: " + vs.totalWheels(vehicles));
    ArrayList<Vehicle> result = vs.allHumanPowered(vehicles);

    System.out.println();
    System.out.println();

    System.out.println("Human powered vehicles:");
    System.out.println();
    printVehicles(result);

  }

}
