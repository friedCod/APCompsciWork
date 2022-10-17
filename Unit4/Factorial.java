class Factorial{

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
}

}
