class Greetings{

public static void greetingsCheck(String input, String expected){
  String result = greetings(input);
  if(result.equals(expected))
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static String greetings(String input){
  String output = ("Hello, " + input + ", how are you?");
  return(output);
}

public static void main(String[] args){
  greetingsCheck("I am a person", "Hello, I am a person, how are you?");
  System.out.println(greetings("I am a person"));
}

}
