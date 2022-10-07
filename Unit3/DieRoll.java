class DieRoll{

public static int roll(){
  int n = (int) ((Math.random()*6)+1);
  return n;
}

public static void main(String[] args){
  System.out.println(roll());
}

}
