class SumOfSquares{

public static void sumOfSquaresTest(int n, int expected){
  int result = sumOfSquares(n);
  System.out.println("Input: " + n + " Expected: " + expected);
  if(result == expected)
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static int sumOfSquares(int n){
  int answer = 0;
  for(int i = 1; i <= n; i++){
    answer = answer + i*i;
  }
  return answer;
}

public static void main(String[] args){
  System.out.println(sumOfSquares(1));
  sumOfSquaresTest(1, 1);
  System.out.println(sumOfSquares(2));
  sumOfSquaresTest(2, 5);
  System.out.println(sumOfSquares(3));
  sumOfSquaresTest(3, 14);
}

}
