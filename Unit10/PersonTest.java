import java.util.*;

class PeopleTest{

  public static void TestAverage(ArrayList<People> peoples, double expected){
    double result = PetsAverage(peoples);

    System.out.println("Number of everyone's pets:");

    for(People p : peoples){
      System.out.println(p.getPets());
    }

    System.out.println("Average: " + result);
    System.out.println("Expected Average: " + expected);

    if(result == expected){
      System.out.println(":)");
    }else{
      System.out.println(":(");
    }
  }

  public static void TestMostPets(ArrayList<People> peoples, String expected){
    String result = MostPets(peoples);

    System.out.println("Number of everyone's pets:");

    for(People p : peoples){
      System.out.println(p.getPets());
    }

    System.out.println("Person with most pets: " + result);
    System.out.println("Expected person with most pets: " + expected);

    if(result.equals(expected)){
      System.out.println(":)");
    }else{
      System.out.println(":(");
    }
  }

  public static void PeopleInfo(ArrayList<People> peoples){

    for(People p : peoples){
      System.out.println("Person name:");
      System.out.println(p.Name());
      System.out.println("Person number of pets:");
      System.out.println(p.getPets());
      System.out.println();
    }
  }

  public static double PetsAverage(ArrayList<People> peoples){
    double sum = 0;

    for(People p : peoples){
      sum += p.getPets();
    }
    return sum/peoples.size();
  }

  public static String MostPets(ArrayList <People> peoples){
    People result = new People("a", 0);

    for(People p : peoples){
      if(result.getPets() < p.getPets()){
        result = p;
      }
    }
    return result.Name();

  }

  public static ArrayList<People> ManyPets(ArrayList <People> peoples){

    ArrayList<People> result = new ArrayList<People>();

    for(People p : peoples){
      if(p.getPets() >= 2){
        result.add(p);
      }
    }
    return result;
  }

  public static void main(String[] args){
    //arraylist
    ArrayList<People> peoples = new ArrayList<People>();
    peoples.add(new People("Andrew", 0));
    peoples.add(new People("Zach", 1));
    peoples.add(new People("Lilly", 3));
    //functions
    //info function
    PeopleInfo(peoples);
    //pets average
    System.out.println();
    System.out.println("Average number of pets: " + PetsAverage(peoples));
    //most pets
    System.out.println();
    System.out.println("Person with most pets: " + MostPets(peoples));
    //many pets
    ArrayList<People> result = ManyPets(peoples);

    System.out.println();
    System.out.println("People with 2 or more pets: ");
    for(People p : result){
      System.out.println(p.Name());
    }
    //test functions
    //average test
    System.out.println();
    System.out.println("Test Average:");
    TestAverage(peoples, 1.3333333333333333);
    //most pets test
    System.out.println();
    System.out.println("Test most pets:");
    TestMostPets(peoples, "Lilly");
  }
}
