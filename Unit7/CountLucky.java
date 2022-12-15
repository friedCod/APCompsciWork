class CountLucky{

  public static void TestCountLucky(int[] values, int expected){

    int result = CountLucky(values);

    System.out.println("values: ");
    for(int value : values){
      System.out.println(value + " ");
    }

    System.out.println("Expected: " + expected);

    if(result == expected)
      System.out.println(":)");
    else
      System.out.println(":(");

  }

  public static int CountLucky(int[] values){

    int result = 0;

    for(int value : values){
      if((value%7==0)||((value-7)%10==0)){
        result = result+1;
      }
    }
    return result;
  }

  public static void main(String[] args){

    int[] values = new int[4];
    values[0] = 7;
    values[1] = 14;
    values[2] = 27;
    values[3] = 5;

    int[] values2 = new int[3];
    values2[0] = 64937;
    values2[1] = 0;
    values2[2] = 3;

    int[] values3 = {7,13,17};

    TestCountLucky(values, 3);
    TestCountLucky(values2, 2);
    TestCountLucky(values3, 2);


  }
}
