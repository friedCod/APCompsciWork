import java.util.*;
public ShapeCollection{

  private ArrayList<Shape> shapes = new ArrayList<Shape>();

  public void addShape(Shape s){
    shapes.add(s);
  }

  public int numberOfSides(String shapeName){

    for(Shape shape : shapes){
      if(shape.getName().equals(shapeName)){
        return shape.getSides();
      }
    }

    return 0;

  }

  public double averageSides(){

    double result = 0.0;

    for(Shape shape : shapes){
      result += shape.getSides();
    }

    result = result/shapes.size();
    return result;

  }

  public ArrayList<Shape> evenSides(){

    ArrayList<Shape> result = new ArrayList<Shape>();

    for(Shape shape : shapes){
      if(shape.getSides()%2 = 0){
        result.add(shape);
      }
    }

    return result;

  }

  public static void main(String[] args){



  }

}
