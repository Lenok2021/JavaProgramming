package day28_ArrayList;

import java.util.ArrayList;

public class IndexOfLastIndexOf {

    public static void main(String[] args) {

        ArrayList<Character>character = new ArrayList<>();
        character.add('A');
        character.add('B');
        character.add('C');
        character.add('D');
        character.add('E');
        character.add('F');

        int a = character.indexOf("A"); // 0
        int b = character.indexOf("B"); // 1
        int d = character.lastIndexOf('F');


        System.out.println(" =============================");
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
