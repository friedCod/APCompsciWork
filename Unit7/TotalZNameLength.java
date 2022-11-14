class TotalZNameLength{

  public static void TestCountZNames(String[] words, int expected){

    int result = CountZNames(words);

    System.out.println("Words: ");
    for(String word : words){
      System.out.println(word + " ");
    }

    System.out.println("Expected: " + expected);

    if(result == expected)
      System.out.println(":)");
    else
      System.out.println(":(");

  }

  public static int CountZNames(String[] words){

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

      String[] words1 = {"Dr. Kessner", "Dr. Sands"};
      String[] words2 = {"Zorro", "zero", "zippy"};

      System.out.println(CountZNames(words1));
      System.out.println(CountZNames(words2));
      TestCountZNames(words1, 0);
      TestCountZNames(words2, 14);

    }

  }
