class DoubleX{

public static void doubleXTest(String str, boolean expected){
  boolean result = doubleX(str);
  if(result == expected)
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static boolean doubleX(String str){
  int i = str.indexOf("x");
  String a = str.substring(i+1, i+2);
  if(i == -1)
    return false;
  else if(i+1 >= str.length())
    return false;
  else
    return a.equals("x");
}

public static void main(String[] args){
  System.out.println(doubleX("aaxaa"));
  doubleXTest("aaxaa", false);
  System.out.println(doubleX("aaxxaa"));
  doubleXTest("aaxxaa", true);
}

}
