class TestPerson{

public static void main(String[] args){

  Person person1 = new Person("Jeff", 2);
  Person person2 = new Person("Sally", 1);

  System.out.println(person1.getName());
  System.out.println(person2.getPets());
  System.out.println(person1.greeting());
}

}
