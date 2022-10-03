public class icyHot{

 public static void icyHotCheck(int temp1, int temp2, boolean expected){
   boolean result = icyhot(temp1, temp2);
   System.out.println("1st temp:" + temp1 + " 2nd temp:" + temp2
                      + " expected:" + expected);
   if(result == expected)
    System.out.println("yay");
   else
    System.out.println("nay");
 }

 public static boolean icyhot(int temp1, int temp2){
   if(temp1<0 && temp2>100)
    return true;
   else
    return false;
 }

public static void main(String[] args){
  icyHotCheck(-1, 200, true);
  icyHotCheck(5, 80, false);
  icyHotCheck(-10, 110, false);
 }
}
