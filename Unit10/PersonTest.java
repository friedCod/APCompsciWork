import java.util.*;

class PersonTest{

  public static void TestAverage(ArrayList<Person> persons, double expected){
    double result = PetsAverage(persons);

    System.out.println("Number of everyone's pets:");

    for(Person p : persons){
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

  public static void TestMostPets(ArrayList<Person> persons, String expected){
    String result = MostPets(persons);

    System.out.println("Number of everyone's pets:");

    for(Person p : persons){
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

  public static void PersonInfo(ArrayList<Person> persons){

    for(Person p : persons){
      System.out.println("Person name:");
      System.out.println(p.Name());
      System.out.println("Person number of pets:");
      System.out.println(p.getPets());
      System.out.println();
    }
  }

  public static double PetsAverage(ArrayList<Person> persons){
    double sum = 0;

    for(Person p : persons){
      sum += p.getPets();
    }
    return sum/persons.size();
  }

  public static String MostPets(ArrayList <Person> persons){
    Person result = new Person("a", 0);

    for(Person p : persons){
      if(result.getPets() < p.getPets()){
        result = p;
      }
    }
    return result.Name();

  }

  public static ArrayList<Person> ManyPets(ArrayList <Person> persons){

    ArrayList<Person> result = new ArrayList<Person>();

    for(Person p : persons){
      if(p.getPets() >= 2){
        result.add(p);
      }
    }
    return result;
  }

  public static void main(String[] args){
    //arraylist
    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Person("Andrew", 0));
    persons.add(new Person("Zach", 1));
    persons.add(new Person("Lilly", 3));
    //functions
    //info function
    PersonInfo(persons);
    //pets average
    System.out.println();
    System.out.println("Average number of pets: " + PetsAverage(persons));
    //most pets
    System.out.println();
    System.out.println("Person with most pets: " + MostPets(persons));
    //many pets
    ArrayList<Person> result = ManyPets(persons);

    System.out.println();
    System.out.println("People with 2 or more pets: ");
    for(Person p : result){
      System.out.println(p.Name());
    }
    //test functions
    //average test
    System.out.println();
    System.out.println("Test Average:");
    TestAverage(persons, 1.3333333333333333);
    //most pets test
    System.out.println();
    System.out.println("Test most pets:");
    TestMostPets(persons, "Lilly");
    //many pets test
    System.out.println();
    System.out.println("Test many tests:");
    TestMostPets(persons, );
  }

}
