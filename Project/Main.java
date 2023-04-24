import processing.core.*;

public class Main extends PApplet{

  public void settings(){
   size(400,400);
  }

  public void setup(){

    rectMode(CENTER);

  }

  Character c = new Character(this);


  public void draw(){

    background(255);

    c.update();
    c.display();

  }

  public void keyPressed(){
    if(key == 'd'){
      c.move(1);
    }else if(key == 'a'){
      c.move(-1);
    }
  }

  public void keyReleased(){
    if((key == 'd') || (key == 'a')){
      c.stop();
    }
  }

  public static void main(String[] args){
    PApplet.main("Main");
  }

}
