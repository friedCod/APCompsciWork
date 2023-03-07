public class ArrayInitialization{

  public static void main(String[] args){

    int[][] a = new int[10][10];

    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        if(i==j){
          a[i][j] = 1;
        }else{
          a[i][j] = 0;
        }
      }
    }

    for(int i=0; i<10; i++){

      System.out.println();

      for(int j=0; j<10; j++){
        System.out.print(a[i][j]);
      }
    }

  }

}
