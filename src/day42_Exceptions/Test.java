package day42_Exceptions;

public class Test {

    String className;

    public static void main(String[] args){


        try{

            Test t = new Test();
            if(t.className.equals("Test"))
                System.out.print("Test ");
            else
                System.out.print("Other ");

        }catch(Exception e){
            System.out.print("Exception ");

        }

    }



}
