class MagicEightBall{

private String messageOne = "Yes";
private String messageTwo = "No";
private String messageThree = "Maybe";

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
