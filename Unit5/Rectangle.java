import java.lang.Math;

class Rectangle{

private double base, height;

public Rectangle(double base, double height){
  this.base = base;
  this.height = height;
}

public double getBase(){
  return base;
}

public double getHeight(){
  return height;
}

public double area(){
  return base*height;
}

public double perimeter(){
  return (base*2)+(height*2);
}

public double diagonal(){
  return Math.sqrt((base*base)+(height*height));
}

}
