//Array Program- 23.3
//Written by Audrey Moore

import java.util.*;

public class ArrayListProgram{
  public static ArrayList<String> arrayList1(){
    ArrayList<String> name = new ArrayList<String>();
    Scanner reader = new Scanner(System.in);
    System.out.println("How many names would you like in your list? ");
    int x = reader.nextInt();
    reader.nextLine();
    for (int i = 1; i<=x; i++){
      System.out.println("Please enter a name: ");
      name.add(reader.nextLine());
    }return name;
  }public static ArrayList<String> arrayList2(ArrayList<String> n){
    int i = 0;
    boolean eM = true;
    while ((i<n.size())&&eM){
      eM = false;
      i++;
      for (int j = 0; j< n.size()-i; j++){
        if (n.get(j).compareTo(n.get(j+1)) > 0){
          String s = n.get(j);
          n.set(j, n.get(j+1));
          n.set(j+1, s);
          eM = true;
        }
      }
    }return n;
  }
  public static ArrayList<String> arrayList3(ArrayList<String> n, String str){
    int c = 0;
    for (String s:n){
      if (str.compareTo(s) < 0){
        n.add(c, str);
        break;
      }c++;
    }return n;
  }
  public static ArrayList<String> arrayList4(ArrayList<String> n, String s){
    int c = 0;
    int k = n.size();
    while (c<k){
      if ((n.get(c)).equals(s)){
        n.remove(c);
        c--;
        k--;
      }c++;
    }return n;
  }
      
  public static void main (String [] args){
    ArrayList<String> names = new ArrayList<String>();
    names = arrayList1();
    System.out.println(names);
    names = arrayList2(names);
    System.out.println(names);
    names = arrayList3(names, "audrey");
    System.out.println(names);
    names = arrayList4(names, "audrey");
    System.out.println(names);
  }
}