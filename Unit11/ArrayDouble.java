public class ArrayDouble{

  public static void main(String[] args){

    double[][] d = new double[5][5];

    for(int i=0; i<5; i++){
      for(int j=0; j<5; j++){
        d[i][j] = (i+1)*10+(j+1);
      }
    }

  for(int i=0; i<5; i++){

    System.out.println();

    for(int j=0; j<5; j++){
      System.out.print(d[i][j] + " ");
      }
    }

  }

}
