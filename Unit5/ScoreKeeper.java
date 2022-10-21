class ScoreKeeper{

private int score = 0;

public int getScore(){
  return score;
}

public void scoreNormal(){
  score = score + 100;
}

public void scoreBonus(){
  score = score + 1000;
}

}
