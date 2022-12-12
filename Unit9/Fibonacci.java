import java.util.*;

class Fibonacci{

  public static ArrayList<Integer> Fibonnaci(int n){

    int a = 0;
    int b = 0;
    int c = 1;

    ArrayList<Integer> result = new ArrayList<Integer>();

    result.add(c);

    for(int i = 0; i<n-1; i++){
      a = b;
      b = c;
      c = a+b;
      result.add(c);
    }

    return result;
  }

  public static void main(String[] args){

    System.out.println("First 20 Fibonnaci numbers:" + Fibonnaci(20));
    System.out.println("First 2 Fibonnaci numbers:" + Fibonnaci(2));
    System.out.println("First 3 Fibonnaci numbers:" + Fibonnaci(3));
    System.out.println("First 4 Fibonnaci numbers:" + Fibonnaci(4));
    System.out.println("First 5 Fibonnaci numbers:" + Fibonnaci(5));


  }

}
