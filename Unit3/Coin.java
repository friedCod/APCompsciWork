class Coin{

public static String coinflip(){
  int n = (int) (Math.random()*2);
  if(n == 1)
    return "heads";
  else
    return "tails";

  }

public static void main(String[] args){
  System.out.println(coinflip());

  }
}
