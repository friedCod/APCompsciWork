class SumOfSquaresArray{

  public static void TestSumOfSquares(double[] values, double expected){

    double result = SumOfSquares(values);

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

  public static double SumOfSquares(double[] values){

    double result = 0;

    for(double value : values){

      result += value*value;

    }
    return result;
  }

  public static void main(String[] args){

    double[] values1 = {0};
    double[] values2 = {1, 2, 3};
    double[] values3 = {2, 2, 2};

    System.out.println(SumOfSquares(values1));
    System.out.println(SumOfSquares(values2));
    System.out.println(SumOfSquares(values3));
    TestSumOfSquares(values1, 0.0);
    TestSumOfSquares(values2, 14.0);
    TestSumOfSquares(values3, 12.0);


  }

}
