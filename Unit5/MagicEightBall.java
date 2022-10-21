import java.lang.Math;

class MagicEightBall{

private final String messageOne = "Yes";
private final String messageTwo = "No";
private final String messageThree = "Maybe";

public String ask(String input){
  double number = Math.random();
     
  if(number<.33){
    return messageOne;
  }
  if(number>.33 && number<.66){
    return messageTwo;
  }else{
    return messageThree;
  }
}


}
