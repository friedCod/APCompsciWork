import processing.core.*;

public class Test extends PApplet{

float x, y, z;

public void settings(){
  size(400, 400);
  }

public void setup(){

  }

public void draw(){
  for(int x=0; x<height; x+=10){
    line(0,x,height,x);
  }
  for(int y=0; y<height; y+=10){
    line(y,0,y,height);
  }
}

public static void main(String[] args){
  PApplet.main("Test");
}

}
