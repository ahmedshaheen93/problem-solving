package first.demo;
import java.util.*;
public class Main{
  public static void main(String args[]){
    List names = new ArrayList<String>();
    names.add("ahmed");
    names.add("mohamed");
    names.add("shaheen");
    findMyName(names,"ahmed");
    findFirst(names);
  }

  /**
  * O(n) example
  */
  private static void findMyName(List<String> list, String name){
      for(int i = 0 ; i< list.size();i++){
        if(list.get(i).equals(name)){
          System.out.println("founded in location = "+ i);
        }
      }
  }

  /**
  * O(1) example
  */
  private static void findFirst(List<String> list){
    if(!list.isEmpty()){
      System.out.println(list.get(0));
    }
  }
}