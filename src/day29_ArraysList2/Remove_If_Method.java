package day29_ArraysList2;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_If_Method {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

       /* for(int i = 0; i< list.size();i++){
            if(list.get(i)%2!=0){
                list.remove(i);
            }
        }
         System.out.println(list);
*/

        //  when  you  use remove method with for loop properly
        //  no  all  odd  number was removed
        // only  removeIf  method  with contidion
        //  we can  use removeIf  method  with  any  collection

        list.removeIf(p -> p < 5);    //p  represents elements in arraysLIst
        System.out.println(list); // Lambda Expression
        // ->  error  toking  is reserved for  all Lambda Expression


        System.out.println("===============================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        //  i  want  to remove  all even numbers


        // list2.removeIf(p-> p%2==0);
        list2.removeIf(each -> each % 2 == 0);
        System.out.println(list2);

        System.out.println("==============================================");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Pithon", "JavaScript", "C#", "C++", "Java", "Java"));

        list3.removeIf(p -> p.startsWith("J")); //  remove  "Java"
        System.out.println(list3);
        //  removeIf  use  iterable interface  and loop
//  for  p  you can  use  any variable name.  you  can  use lower and upper Case methods

        System.out.println("===============================================");

        // remove all Palidrome string in Array List
        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Level","Racecar", "Java", "Python","Cydeo"));
        names.removeIf(name-> StringUtility.isPalindrome(name));
        System.out.println(names);

        //  remove  not Palidrome
        ArrayList<String>names1 = new ArrayList<>();
        names1.addAll(Arrays.asList("Anna", "Level","Racecar", "Java", "Python","Cydeo"));
        names1.removeIf(name->! StringUtility.isPalindrome(name));
        System.out.println(names1);

    }

}
