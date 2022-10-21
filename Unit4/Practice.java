class Practice{

public static String reverse(String str){
  String result = "";
  for(int i = str.length()-1; i >= 0; i--){
    String sub = str.substring(i, i+1);
    result = result + sub;
  }
  return result;
}

public static void main(String[] args){
  System.out.println(reverse("hi"));
}

}
