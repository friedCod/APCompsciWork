class SumOfSquares{

public static int sumOfSquares(int n){
  int result = 0;
  for(int i = 1; i <= n; i++){
    result = result + i*i;
  }
  return result;
}

public static void main(String[] args){
  System.out.println(sumOfSquares(1));
  System.out.println(sumOfSquares(2));
  System.out.println(sumOfSquares(3));
}

}
