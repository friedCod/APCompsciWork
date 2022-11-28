import processing.core.*;

public class TestLine extends PApplet{

  Line line1 = new Line(this,0,3,224,11,11);
  Line line2 = new Line(this,0,8,84,58,240);

  public void settings(){
    size(400,400);
  }

  public void setup(){

  }

  public void draw(){

    background(0);

    line1.update();
    line1.checkEdges();
    line1.display();

    line2.update();
    line2.checkEdges();
    line2.display();
  }

  public static void main(String[] args){
    PApplet.main("TestLine");
  }

}
