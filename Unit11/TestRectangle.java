public class TestRectangle{

  public static double averagePerimeter(Rectangle[][] rectangles){

    double result = 0;

    for(int i=0; i<rectangles.length; i++){
      for(int j=0; j<rectangles[i].length; j++){
        result += rectangles[i][j].perimeter();
      }
    }

    int size = rectangles.length*rectangles[0].length;

    result = result/size;
    return result;

  }

  public static Rectangle greatestArea(Rectangle[][] rectangles){

    Rectangle result = rectangles[0][0];

    for(int i=0; i<rectangles.length; i++){
      for(int j=0; j<rectangles[i].length; j++){
        if(rectangles[i][j].area() > result.area()){
          result = rectangles[i][j];
        }
      }
    }

    return result;

  }

  public static void main(String[] args){

    Rectangle a = new Rectangle("Hello", 2.0, 3.0);
    Rectangle b = new Rectangle("Hi", 5.5, 9.2);
    Rectangle c = new Rectangle("Bye", 7.4, 6.88);
    Rectangle d = new Rectangle("Goodbye", 0.2, 4.0);

    Rectangle[][] rectangles = {
      {a, b},{c, d}
    };

    System.out.println("average perimeter: " + averagePerimeter(rectangles));

    System.out.println();

    System.out.println("greatest area: " + greatestArea(rectangles).getName());

  }

}
