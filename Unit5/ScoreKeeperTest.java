class ScoreKeeperTest{

public static void main(String[] args){

  ScoreKeeper keeper = new ScoreKeeper();

  keeper.scoreNormal();
  keeper.scoreBonus();

  System.out.println(keeper.getScore());

}

}
