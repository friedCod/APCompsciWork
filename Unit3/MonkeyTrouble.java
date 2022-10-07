class MonkeyTrouble{

public static void monkeyTroubleCheck(boolean aSmile,
boolean bSmile, boolean expected){
  boolean result = monkeyTrouble(aSmile, bSmile);
  System.out.println("aSmile: " + aSmile + "bSmile: " + bSmile +
                     "expected: " + expected);
  if(result == expected)
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
  if(aSmile == bSmile)
    return true;
  else
    return false;
}

public static void main(String[] args){
  monkeyTroubleCheck(true, true, true);
  monkeyTroubleCheck(true, true, false);
  monkeyTroubleCheck(false, false, true);
  monkeyTroubleCheck(false, false, false);
}

}
