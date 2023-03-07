public class ArrayCompC{

  public static int startWithA(String[][] words){

    int result = 0;

    for(int i=0; i<words.length; i++){
      for(int j=0; j<words[i].length; j++){
        if(words[i][j].substring(0,1).equals("A")){
          result++;
        }
      }
    }

    return result;

  }

  public static void main(String[] args){

    String[][] s = {
      {"Hello", "Actually"},{"Apple", "Bird"}
    };

    System.out.println(startWithA(s));

  }

}
