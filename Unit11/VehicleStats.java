import java.util.*;
public class VehicleStats{

  public static int totalWheels(ArrayList<Vehicle> vehicles){
    int result = 0;
    for(Vehicle v : vehicles){
      result += v.wheelCount();
    }
  return result;
  }

  public static ArrayList<Vehicle> allHumanPowered(ArrayList <Vehicle> vehicles){
    ArrayList<Vehicle> result = new ArrayList<Vehicle>();
    for(Vehicle v : vehicles){
      if(v.isHumanPowered() == true){
        result.add(v);
      }
    }
    return result;
  }
}
