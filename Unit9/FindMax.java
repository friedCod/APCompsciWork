import java.util.*;

class FindMax{

  public static Double findMax(ArrayList<Double> numbers){

    double result = numbers.get(0);

    for(Double number : numbers){
      if(number > result)
        result = number;
    }
    return result;
  }

  public static void main(String[] args){

    ArrayList<Double> numbers = new ArrayList<Double>();
    numbers.add(1.0);
    numbers.add(2.1);
    numbers.add(5.3);

    System.out.println("Maximum for first set: " + findMax(numbers));

    System.out.println();

    ArrayList<Double> numbers2 = new ArrayList<Double>();
    numbers2.add(0.0);
    numbers2.add(-35.0);
    numbers2.add(90.1);

    System.out.println("Maxiumum for second set: " + findMax(numbers2));


  }

}
