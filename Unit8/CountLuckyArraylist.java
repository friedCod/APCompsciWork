import java.util.*;

class CountLuckyArraylist{

  public static void CountLuckyTest(ArrayList<Double> values, double expected){

    double result = CountLucky(values);

    System.out.println("Input: " + values + " Expected: " + expected);

    if(expected==result)
      System.out.println(":)");
    else
      System.out.println(":(");

    }


    public static double CountLucky(ArrayList<Double> values){

      double result = 0;

      for(double value : values){
        if((value%7==0)||((value-7)%10==0)){
          result = result+1;
        }
      }
      return result;
    }

    public static void main(String[] args){

      ArrayList<Double> values = new ArrayList<Double>();

      values.add(7.0);
      values.add(14.0);
      values.add(27.0);
      values.add(5.0);

      ArrayList<Double> values2 = new ArrayList<Double>();

      values2.add(64937.0);
      values2.add(0.0);
      values2.add(3.0);

      System.out.println(CountLucky(values));
      System.out.println(CountLucky(values2));
      CountLuckyTest(values, 3.0);
      CountLuckyTest(values2, 2.0);

    }

}
