package day28_ArrayList;

import java.util.ArrayList;

public class UnidueElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");
        
        ArrayList<String> unique = new ArrayList();
        for (String element : list) {
            if(list.indexOf(element)== list.lastIndexOf(element)){
                unique.add(element);
            }
            
        }
        System.out.println("unique = " + unique);

        
        
    }


}
