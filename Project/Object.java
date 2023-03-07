import processing.core.*;

class Object {

  private float x;
  private float y;
  private int h;
  private int w;
  private PImage i;
  private PApplet p;

Object(float x, float y, int h, int w, PApplet p){

  this.x = x;
  this.y = y;
  this.h = h;
  this.w = w;
  this.p = p;
  i = loadIsmage("");

}

void display(){

  i.resize(p.height/h,p.width/w);
  image(i, p.width/x, p.height/y);

}

}
