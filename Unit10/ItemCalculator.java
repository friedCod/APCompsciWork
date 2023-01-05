import java.util.*;

public class ItemCalculator{

  public static void AverageTest(ArrayList<Item> items, double expected){
    double result = ItemAverage(items);

    System.out.println("Item prices:");

    for(Item i : items){
      System.out.println(i.getPrice());
    }

    System.out.println("Average: " + result);
    System.out.println("Expected Average: " + expected);

    if(result == expected){
      System.out.println(":)");
    }else{
      System.out.println(":(");
    }
  }

  public static void HighestTest(ArrayList<Item> items, String expected){
    String result = HighestPrice(items);

    System.out.println("Item prices:");

    for(Item i : items){
      System.out.println(i.getPrice());
    }

    System.out.println("Highest: " + result);
    System.out.println("Expected Value: " + expected);

    if(result.equals(expected)){
      System.out.println(":)");
    }else{
      System.out.println(":(");
    }
  }

  public static void ItemInfo(ArrayList<Item> items){

    for(Item i : items){
      System.out.println("Item Name:");
      System.out.println(i.getName());
      System.out.println("Item Price:");
      System.out.println(i.getPrice());
      System.out.println();
    }
  }

  public static double ItemAverage(ArrayList<Item> items){
    double sum = 0;

    for(Item i : items){
      sum += i.getPrice();
    }
    return sum/items.size();
  }

  public static String HighestPrice(ArrayList <Item> items){
    Item result = new Item("a", 0);

    for(Item i : items){
      if(result.getPrice() < i.getPrice()){
        result = i;
      }
    }
    return result.getName();

  }

  public static void main(String[] args){
    //arraylist
    ArrayList<Item> items = new ArrayList<Item>();

    items.add(new Item("Computer", 2000));
    items.add(new Item("Water Bottle", 25));
    items.add(new Item("Apple", 2));
    //functions
    //item info
    ItemInfo(items);
    System.out.println();
    //average
    System.out.println("Price average of items: " + ItemAverage(items));
    System.out.println();
    //highest price
    System.out.println("Highest priced item: " + HighestPrice(items));
    //test functions
    //test average
    System.out.println();
    System.out.println("Test average function:");
    AverageTest(items, 675.6666666666666);
    //test highest price
    System.out.println();
    System.out.println("Test highest function:");
    HighestTest(items, "Computer");

  }

}
