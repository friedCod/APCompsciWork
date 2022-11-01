class Factorial{

public static void factorialTest(int n, int expected){
  int result = factorial(n);
  System.out.println("Input: " + n + " Expected: " + expected);
  if(result == expected)
    System.out.println("yay");
  else
    System.out.println("nay");
  }


public static int factorial(int n){
  int result = 1;

  for(int i = 1; i <= n; i++){
    result = result*i;
  }
  return result;
}

public static void main(String[] args){
  System.out.println(factorial(0));
  System.out.println(factorial(1));
  System.out.println(factorial(2));
  System.out.println(factorial(3));
  System.out.println(factorial(4));
  System.out.println(factorial(5));
  System.out.println(factorial(6));
  System.out.println(factorial(7));
  factorialTest(0,1);
  factorialTest(1,1);
  factorialTest(2,2);
  factorialTest(3,6);
}

}
