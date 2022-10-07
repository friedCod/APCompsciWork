class Attention{

public static void attentionCheck(String input, String expected){
  String result = attention(input);
  if(result.equals(expected))
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static String attention(String input){
  String start = input.substring(0,9);
  if(start.equals("Hey you! "))
    return "true";
  else
    return "false";
}

public static void main(String[] args){
  System.out.println(attention("Hey you! Get over here"));
  attentionCheck("Hey you! Get over here", "true");
}

}
