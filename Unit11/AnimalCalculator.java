import java.util.*;

public class AnimalCalculator{

  public static void animalInfo(ArrayList<Animal> animals){

    for(Animal a : animals){
      System.out.println("Animal name: " + a.getName());
      System.out.println("Number of legs: " + a.getLegCount());
      if(a.getFurriness() == true){
        System.out.println("Furry");
      }else{
        System.out.println("Not furry");
      }
    }

  }

  public static int averageLegs(ArrayList<Animal> animals){

    int result = 0;

    for(Animal a : animals){
      result += a.getLegCount();
    }

    result = result/animals.size();
    return result;

  }

  public static Animal fewestLegs(ArrayList<Animal> animals){

    Animal result = animals.get(0);

    for(Animal a : animals){
      if(a.getLegCount() > result.getLegCount()){
        result = a;
      }
    }

    return result;

  }

  public static void main(String[] args){

    ArrayList<Animal> animals = new ArrayList<Animal>();

    Human h = new Human("Andrew", 2, false);
    Cat c = new Cat("Prim", 4, true);
    Sponge s = new Sponge("Spongebob", 0, false);
    Caterpillar r = new Caterpillar("Sherlock Holmes", 6, true);

    animals.add(h);
    animals.add(c);
    animals.add(s);
    animals.add(r);

    System.out.println("All animals:");
    System.out.println();
    animalInfo(animals);

    System.out.println();
    System.out.println();

    System.out.println("Average number of legs:" + averageLegs(animals));

    System.out.println();
    System.out.println();

    System.out.println("Animal with the fewest legs:" + fewestLegs(animals));



  }

}
