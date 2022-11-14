import java.util.*;

class TotalZNameLengthArraylist{

  public static void CountZNamesTest(ArrayList<String> words, int expected){

    int result = CountZNames(words);

    System.out.println("Input: " + words + " Expected: " + expected);

    if(expected==result)
      System.out.println(":)");
    else
      System.out.println(":(");

  }

  public static int CountZNames(ArrayList<String> words){

    int result = 0;

    for(String word : words){

      String first = word.substring(0,1);

      if(first.equals("Z")||first.equals("z")){

          result += word.length();

        }
      }
      return result;
    }

    public static void main(String[] args){

      ArrayList<String> words1 = new ArrayList<String>();

      words1.add("Dr. Kessner");
      words1.add("Dr. Sands");

      ArrayList<String> words2 = new ArrayList<String>();

      words2.add("Zorro");
      words2.add("zero");
      words2.add("zippy");

      System.out.println(CountZNames(words1));
      System.out.println(CountZNames(words2));
      CountZNamesTest(words1, 0);
      CountZNamesTest(words2, 14);

    }

  }
