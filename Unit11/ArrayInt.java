public class ArrayInt{

  public static void main(String[] args){

    int[][] o = new int[6][5];

    for(int i=0; i<6; i++){
      for(int j=0; j<5; j++){
        o[i][j] = i+1;
      }
    }

  for(int i=0; i<6; i++){

    System.out.println();

    for(int j=0; j<5; j++){
      System.out.print(o[i][j] + " ");
      }
    }

  }

}
