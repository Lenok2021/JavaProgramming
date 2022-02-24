package day49Collection_contihue;

import java.util.Arrays;
import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(); //  has the fastest performance
        //Hashset  remove duplicates from you  and return 
        // we cannot  use index number to get Element
        // there is no index number
        // has random order
        // accepts null  value
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null, null));
        System.out.println("hashSet = " + hashSet);

        System.out.println("=====================================");
        // let's compare Set with List
        
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println("list = " + list);

        //LinkedHashset  remove duplicates from you  and return 
        // we cannot  use index number to get Element
        // there is no index number
        // does not have a  random order
        // accepts null  value

        Set<Integer>   LinkedHashSet  = new LinkedHashSet();
        LinkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        LinkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        LinkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        LinkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        LinkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        LinkedHashSet.addAll(Arrays.asList(null, null, null, null));
        System.out.println("LinkedHashSet = " + LinkedHashSet);
                
        // treeSet  does not  accept null keyword
        // NullPointerExeption - if you try to store Ob. with null keyword
        // maintain sorted order (1,2,3,4,5) (for String alphabetical order).
        // in Asci table  we have number
        Set<Integer>   treeSet  = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //treeSet.addAll(Arrays.asList(null, null, null, null)); //we get NullPointerException
        System.out.println("treeSet = " + treeSet);

        //  in the  future that depends on  scenario.
        // if you need to remove duplicates then to leave sorted order,
        //or if you need to remove duplicates then to leave random order




    }
        
    
    
    
    
}
