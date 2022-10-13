class LoneTeen{

public static void loneTeenCheck(int a, int b, boolean expected){
  boolean result = loneTeen(a, b);
  System.out.println("a: " + a + " b: " + b + " expected: " + expected);
  if(result == expected)
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static boolean loneTeen(int a, int b){
  if((a <= 19 && a >= 13) && (b <= 19 && b >= 13))
    return false;
  else if((a <= 19 && a >= 13) || (b <= 19 && b >= 13))
    return true;
  else
    return false;
 }

public static void main(String[] args){
  loneTeenCheck(13, 99, true);
  loneTeenCheck(25,30, false);
 }
}
