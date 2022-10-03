public class vampire{

public static void isVampTest(float hour, boolean awake, boolean expected){
  boolean result = isVampire(hour, awake);
  System.out.println("Hour:" + hour + " Awake:" + awake + " Expected:"
                     + expected);
  if(result == expected)
    System.out.println("yay");
     else
    System.out.println("nay");
}

public static boolean isVampire(float hour, boolean awake){
  if((6<hour && hour<22) && awake == false)
    return true;
  else
    return false;
 }

public static void main(String[] args){
  isVampTest(7, false, true);
  isVampTest(24, false, false);
  isVampTest(24, false, true);
 }
}
