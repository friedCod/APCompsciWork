import processing.core.*;

public class Character{

  private PApplet p;
  private PVector position;
  private PVector velocity;
  private PVector acceleration;
  private float topSpeed;
  private float h;
  private float w;

  Character(PApplet p){

    this.p = p;
    position = new PVector(p.width/4, p.height - p.height/5);
    velocity = new PVector(0,0);
    acceleration = new PVector(0,0);
    topSpeed = 10;
    w = p.width/10;
    h = p.height/4;

  }

  public void update(){
    velocity.add(acceleration);
    velocity.limit(topSpeed);
    position.add(velocity);
  }

  public void move(float acc){
    acceleration.x = acc;
    velocity.x += acc*2;
  }

  public void stop(){
    velocity.x = 0;
    acceleration.x = 0;
  }

  public void display(){
    p.fill(0);
    p.rect(position.x, position.y, w, h);
  }




//collision reference:

/*
  void Collision(object o){

    if(position.x + radius > o.x && position.x - radius < o.x + o.w
    && position.y + radius + velocity.y > o.y && position.y-radius < o.y+o.h) {
      position.y = o.y-radius;
  } else if (position.x + radius + velocity.x > o.x && position.x - radius < o.x+o.w
    && position.y + radius > o.y && position.y-radius < o.y+o.h) {
      position.x = o.x-radius;
  } else if (position.x + radius > o.x && position.x - radius + velocity.x < o.x+o.w
    && position.y + radius > o.y && position.y-radius < o.y+o.h) {
      position.x = o.x+o.w+radius;
  } else if (position.x + radius > o.x && position.x - radius < o.x +o.w
    && position.y + radius > o.y && position.y-radius + velocity.y< o.y+o.h) {
      position.y=o.y+o.h+radius;
    }
 }
*/
}
