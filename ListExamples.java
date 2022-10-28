import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

  // Returns a new list that has all the elements of the input list for which
  // the StringChecker returns true, and not the elements that return false, in
  // the same order they appeared in the input list;
  static List<String> filter(List<String> list, StringChecker sc) {
    List<String> result = new ArrayList<>();
    for(String s: list) {
      if(sc.checkString(s)) {
        result.add(0, s);
      }
    }
    return result;
  }


  // Takes two sorted list of strings (so "a" appears before "b" and so on),
  // and return a new list that has all the strings in both list in sorted order.
  static List<String> merge(List<String> list1, List<String> list2) {
    List<String> result = new ArrayList<>();
    int index1 = 0, index2 = 0;
    while(index1 < list1.size() || index2 < list2.size()) {
      if (index1 < list1.size() && index2 < list2.size()) {
        if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
          result.add(list1.get(index1));
          index1 += 1;
        }
        else {
          result.add(list2.get(index2));
          index2 += 1;
        }
      }
      else if(index1 < list1.size()) {
        result.add(list1.get(index1));
          index1 += 1;
      }
      else {
        result.add(list2.get(index2));
          index2 += 1;
      }
    }
    return result;
  }    

  public static void main(String[] args) {
    List<String> test1 = Arrays.asList(new String[]{"a", "c", "e"});
    List<String> test2 = Arrays.asList(new String[]{"b", "d"});
    //List<String> result = merge(test1, test2);

    //for (int i = 0; i < test1.size(); i++) {
    System.out.println(merge(test1, test2));
    //}

    

  }  

}