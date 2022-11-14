class CountLucky{

  public static void TestCountLucky(double[] values, int expected){

    double result = CountLucky(values);

    System.out.println("values: ");
    for(double value : values){
      System.out.println(value + " ");
    }

    System.out.println("Expected: " + expected);

    if(result == expected)
      System.out.println(":)");
    else
      System.out.println(":(");

  }

  public static double CountLucky(double[] values){

    double result = 0;

    for(double value : values){
      if((value%7==0)||((value-7)%10==0)){
        result = result+1;
      }
    }
    return result;
  }

  public static void main(String[] args){

    double[] values = new double[4];
    values[0] = 7;
    values[1] = 14;
    values[2] = 27;
    values[3] = 5;

    double[] values2 = new double[3];
    values2[0] = 64937;
    values2[1] = 0;
    values2[2] = 3;

    TestCountLucky(values, 3);
    TestCountLucky(values2, 2);

  }
}
