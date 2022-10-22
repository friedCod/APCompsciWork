class CountOccurrences{

public static void countOccurrencesTest(String str, String sub, int expected){
  int result = countOccurrences(str, sub);
  if(result == expected)
    System.out.println("yay");
  else
    System.out.println("nay");
}

public static int countOccurrences(String str, String sub){
  int count = 0;
  int index = str.length() - sub.length();

  for(int i = 0; i <= index; i++){
    String s = str.substring(i,i+sub.length());

    if(s.equals(sub)){
      count++;
    }

  }
  return count;
}

public static void main(String[] args){
  System.out.println(countOccurrences("Mississippi", "iss"));
  System.out.println(countOccurrences("banananana", "na"));
  System.out.println(countOccurrences("yayaya", "ya"));
  System.out.println(countOccurrences("who what when why how", "wh"));
  countOccurrencesTest("Mississippi", "iss", 2);
  countOccurrencesTest("banananana", "na", 4);
  countOccurrencesTest("yayaya", "ya", 3);
  countOccurrencesTest("who what when why how", "wh", 4);



}

}
