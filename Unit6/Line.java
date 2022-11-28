import processing.core.*;

  public class Line{

    private PApplet p;
    private int x, vx, r, g, b;

    Line(PApplet p, int x, int vx, int r, int g, int b){
      this.p = p;
      this.x = x;
      this.vx = vx;
      this.r = r;
      this.g = g;
      this.b = b;
    }

    void update(){
      x+=vx;
    }

    void checkEdges(){
      if(x>p.width){
        x=0;
      }
    }

    void display(){
      p.stroke(r,g,b);
      p.line(x,0,x,p.height);
    }

  }
