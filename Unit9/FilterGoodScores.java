import java.util.*;
class FilterGoodScores{

  public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> scores){

    ArrayList<Integer> result = new ArrayList<Integer>();

    for(int score : scores){
      if(score >= 90){
        result.add(score);
      }
    }
    return result;
  }

  public static void main(String[] args){

    ArrayList<Integer> scores = new ArrayList<Integer>();
    scores.add(51);
    scores.add(52);
    scores.add(53);
    scores.add(100);

    ArrayList<Integer> scores2 = new ArrayList<Integer>();
    scores2.add(92);
    scores2.add(89);
    scores2.add(90);
    scores2.add(99);

    System.out.println(filterGoodScores(scores));
    System.out.println(filterGoodScores(scores2));

  }

}
