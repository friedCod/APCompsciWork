import java.util.*;

class ReverseAll{

  public static String Reverse(String s){

    String result = "";

    for(int i = s.length()-1; i >= 0; i--){
      result = result + s.substring(i, i+1);
    }
    return result;
  }

  public static ArrayList<String> ReverseAll(ArrayList<String> words){

    ArrayList<String> result = new ArrayList<String>();

    for(String word : words){
      result.add(Reverse(word));
    }
    return result;
}

  public static void main(String[] args){

    ArrayList<String> words = new ArrayList<String>();
    words.add("abcd");
    words.add("xyz");

    ArrayList<String> words2 = new ArrayList<String>();
    words2.add("racecar");
    words2.add("tacocat");
    words2.add("izzi");

    ArrayList<String> words3 = new ArrayList<String>();
    words3.add("4321");
    words3.add("8765");

    System.out.println("First set:");
    for(String word : words){
      System.out.println(word);
    }
    System.out.println("First set reversed:" + ReverseAll(words));

    System.out.println();

    System.out.println("Second set:");
    for(String word2 : words2){
      System.out.println(word2);
    }
    System.out.println("Second set reversed:" + ReverseAll(words2));

    System.out.println();

    System.out.println("Third set:");
    for(String word3 : words3){
      System.out.println(word3);
    }
    System.out.println("Third set reversed:" + ReverseAll(words3));

  }

}
