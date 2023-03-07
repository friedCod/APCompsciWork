public class ArrayComp{

  public static int smallest(int[][] integers){

    int small = integers[0][0];

    for(int i=0; i<integers.length; i++){
      for(int j=0; j<integers[i].length; j++){
        if(integers[i][j] < small){
          small = integers[i][j];
        }
      }
    }

    return small;

  }

  public static void main(String[] args){

    int[][] integers = {
      {5, 2, 6},{2, 7, 1},{-3, 0, 4}
    };

    System.out.println(smallest(integers));
  }

}
