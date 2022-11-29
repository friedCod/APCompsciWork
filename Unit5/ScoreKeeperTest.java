class ScoreKeeperTest{

public static void main(String[] args){

  ScoreKeeper keeper = new ScoreKeeper();
  ScoreKeeper keeper2 = new ScoreKeeper();

  keeper.scoreNormal();
  keeper.scoreBonus();
  System.out.println("Keeper 1 score:");
  System.out.println(keeper.getScore());

  keeper2.scoreNormal();
  keeper2.scoreNormal();
  keeper2.scoreBonus();
  keeper2.scoreBonus();
  System.out.println("Keeper 2 score:");
  System.out.println(keeper2.getScore());

}

}
