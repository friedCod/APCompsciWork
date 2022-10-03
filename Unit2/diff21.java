public class diff21{
  public static void testdiff(int n, int expected){
int result = diff(n);

System.out.println("input:" + n + " result:" + result + " expected:" + expected);

if(result == expected){
  System.out.println("yay");
}else{
  System.out.println("nay");
 }
}

  public static int diff(int n){
    if(n<=21){
      return 21-n;
    }else{
      return 2*(n-21);
   }
  }
  public static void main(String[] args){
    testdiff(10, 11);
    testdiff(5, 6);
    testdiff(30, 18);
  }

}
