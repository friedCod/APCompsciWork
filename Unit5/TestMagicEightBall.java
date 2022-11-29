class TestMagicEightBall{

public static void main(String[] args){

  MagicEightBall eight = new MagicEightBall();

  System.out.println("Should I take a walk?");
  System.out.println(eight.ask("Should I take a walk?"));
  System.out.println("Should I go to the store");
  System.out.println(eight.ask("Should I go to the store?"));
  System.out.println("Should I cook dinner tonight?");
  System.out.println(eight.ask("Should I cook dinner tonight?"));

}

}
