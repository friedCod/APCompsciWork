public class ArrayInitial{

  public static void main(String[] args){

    String[][] s = {
      {"Hello", "Cat"},{"Dog", "Bird"}
    };

    for(int i=0; i<2; i++){

      System.out.println();

      for(int j=0; j<2; j++){
        System.out.print(s[i][j] + " ");
      }
    }

  }

}
