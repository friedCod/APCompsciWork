class CountOccurrences{

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


}

}
