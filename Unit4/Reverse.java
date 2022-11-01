class Reverse{

public static void reverseTest(String str, String expected){
  String result = reverse(str);
  System.out.println("input: " + str + " expected: " + expected);
  if(result.equals(expected))
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static String reverse(String str){
  String result = "";
  for(int i = str.length()-1; i >= 0; i--){
    result = result + str.substring(i, i+1);
  }
  return result;
}

public static void main(String[] args){
  System.out.println(reverse("bad"));
  reverseTest("bad", "dab");
  System.out.println(reverse("Hello, world!"));
  reverseTest("Hello, world!", "!dlrow ,olleH");
  System.out.println(reverse("tacocat"));
  reverseTest("tacocat", "tacocat");
  System.out.println(reverse("!dlrow olleH"));
  reverseTest("!dlrow olleH", "Hello world!");
  System.out.println(reverse("cool :)"));
  reverseTest("cool :)", "): looc");
}

}
