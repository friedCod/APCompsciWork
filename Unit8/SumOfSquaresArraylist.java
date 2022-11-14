import java.util.*;

class SumOfSquaresArraylist{

    public static void SumOfSquaresTest(ArrayList<Double> values, double expected){

      double result = SumOfSquares(values);

      System.out.println("Input: " + values + " Expected: " + expected);

      if(expected==result)
        System.out.println(":)");
      else
        System.out.println(":(");

    }

    public static double SumOfSquares(ArrayList<Double> values){

      double result = 0;

      for(double value : values){

        result += value*value;

      }
      return result;
    }

    public static void main(String[] args){

      ArrayList<Double> values1 = new ArrayList<Double>();

      values1.add(0.0);

      ArrayList<Double> values2 = new ArrayList<Double>();

      values2.add(1.0);
      values2.add(2.0);
      values2.add(3.0);

      ArrayList<Double> values3 = new ArrayList<Double>();

      values3.add(2.0);
      values3.add(2.0);
      values3.add(2.0);

      System.out.println(SumOfSquares(values1));
      System.out.println(SumOfSquares(values2));
      System.out.println(SumOfSquares(values3));
      SumOfSquaresTest(values1, 0.0);
      SumOfSquaresTest(values2, 14.0);
      SumOfSquaresTest(values3, 12.0);


    }

}
