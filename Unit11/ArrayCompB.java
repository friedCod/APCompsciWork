public class ArrayCompB{

  public static float sum(float[][] floats){

    float total = 0;

    for(int i=0; i<floats.length; i++){
      for(int j=0; j<floats[i].length; j++){
        total += floats[i][j];
    }
  }

  return total;

}


  public static void main(String[] args){

    float[][] floats = {
      {5.3f, 2.2f, 6f},{2f, 7.5f, 1.9f},{-3f, 0.6f, 4f}
    };

    System.out.println(sum(floats));

  }

}
