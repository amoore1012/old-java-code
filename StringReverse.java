public class StringReverse{
  public static String stringReverse(String str){
    int i = str.length()-1;
    if (i<0){
      return "";
    }else{
      return str.charAt(i) + (stringReverse(str.substring(0,i)));
    }
  }
  public static void main (String [] args){
    System.out.println(stringReverse("recurse"));
  }
}