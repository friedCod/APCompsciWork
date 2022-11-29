class TestRectangle{

public static void main(String[] args){

  Rectangle rect = new Rectangle(3,4);

  System.out.println("Base length:");
  System.out.println(rect.getBase());
  System.out.println("height length:");
  System.out.println(rect.getHeight());
  System.out.println("Area:");
  System.out.println(rect.area());
  System.out.println("Perimeter length:");
  System.out.println(rect.perimeter());
  System.out.println("Diagonal length:");
  System.out.println(rect.diagonal());
}

}
