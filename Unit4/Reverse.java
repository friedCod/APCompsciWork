class Reverse{

public static String reverse(String str){
  String result = "";
  for(int i = str.length()-1; i >= 0; i--){
    result = result + str.substring(i, i+1);
  }
  return result;
}

public static void main(String[] args){
  System.out.println(reverse("bad"));
  System.out.println(reverse("Hello, world!"));
  System.out.println(reverse("tacocat"));
  System.out.println(reverse("!dlrow olleH"));
  System.out.println(reverse("cool :)"));
}

}
