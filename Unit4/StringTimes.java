class StringTimes{

public static void stringTimesCheck(String str, int n, String expected){
  String result = stringTimes(str, n);
  System.out.println("String: " + str " Number: " + n + "Expected: " + expected);
  if(result.equals(expected))
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static String stringTimes(String str, int n){
  String a = "";
  for(int i = 0; i < n; i++){
    a = a + str;
  }
  return a;
}


public static void main(String[] args){
  System.out.println(stringTimes("Hi", 4));
  stringTimesCheck("Hi", 4, "HiHiHiHi");
  System.out.println(stringTimes("Hello", 5));
  stringTimesCheck("Hello", 5, "HelloHelloHelloHelloHello");

}

}
