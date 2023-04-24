import java.util.*;
public class ShapeCollection{

  private ArrayList<Shape> shapes;

  public ShapeCollection(){
    shapes = new ArrayList<Shape>();
  }

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
      if(shape.getSides()%2 == 0){
        result.add(shape);
      }
    }

    return result;

  }

  public static void main(String[] args){

    ArrayList<Shape> shapes = new ArrayList<Shape>();

    Shape shape1 = new Shape("Square", 4);
    Shape shape2 = new Shape("Triangle", 3);
    Shape shape3 = new Shape("Circle", 0);
    Shape shape4 = new Shape("Dodecagon", 12);
    ShapeCollection collection = new ShapeCollection();

    collection.addShape(shape1);
    collection.addShape(shape2);
    collection.addShape(shape3);
    collection.addShape(shape4);

    System.out.println("Average number of sides: " + collection.averageSides());
    System.out.println("Shapes with even sides:" );

    for(Shape e: collection.evenSides()){
      System.out.print(e.getName() + " ");
    }




  }

}
