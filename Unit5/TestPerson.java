class TestPerson{

public static void main(String[] args){

  Person person1 = new Person("Jeff", 2);
  Person person2 = new Person("Sally", 1);

  System.out.println("Person 1 name");
  System.out.println(person1.getName());
  System.out.println("Person 1 pets");
  System.out.println(person1.getPets());
  System.out.println("Person 1 greeting");
  System.out.println(person1.greeting());
  System.out.println("Person 2 name");
  System.out.println(person2.getName());
  System.out.println("Person 2 pets");
  System.out.println(person2.getPets());
  System.out.println("Person 2 greeting");
  System.out.println(person2.greeting());
}

}
