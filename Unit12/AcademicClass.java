import java.util.*;
public class AcademicClass{

  private Teacher teacher;
  private ArrayList<Student> students;

  public AcademicClass(Teacher teacher){

    this.teacher = teacher;
    students = new ArrayList<Student>();

  }

  public void addStudent(Student student){

    students.add(student);

  }

  public void printInfo(){

    System.out.println("Teacher name: " + teacher.getName());
    System.out.println();
    System.out.print("Student names: ");
    for(Student s : students){

      System.out.print(s.getName() + " ");

    }
  }

  public ArrayList<String> favoriteNumber(int n){

    ArrayList<String> result = new ArrayList<String>();

    for(Student s: students){
      if(s.getFavorite() == n){
        result.add(s.getName());
      }
    }

    return result;

  }

  public ArrayList<String> oddFavorite(){

    ArrayList<String> result = new ArrayList<String>();

    for(Student s: students){
      if((s.getFavorite() % 2) > 0){
        result.add(s.getName());
      }
    }

    return result;

  }

  public static void main(String[] args){

    Teacher teacher1 = new Teacher("Dr. Kessner", "APCS");
    Student student1 = new Student("Andrew", 4);
    Student student2 = new Student("Kai", 7);
    Student student3 = new Student("Sally", 15);
    Student student4 = new Student("Viktor", 7);
    AcademicClass apcs = new AcademicClass(teacher1);

    apcs.addStudent(student1);
    apcs.addStudent(student2);
    apcs.addStudent(student3);
    apcs.addStudent(student4);

    apcs.printInfo();

    System.out.println();

    System.out.println("Students with fav # as 7:");

    for(String n: apcs.favoriteNumber(7)){
      System.out.print(n + " ");
    }

    System.out.println();

    System.out.println("Students with fav # as an odd #:");

    for(String o: apcs.oddFavorite()){
      System.out.print(o + " ");
    }

  }

}
