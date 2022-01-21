package day41_Exceptions;

import day39_Encapsulation_Inherintance_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;
        System.out.println( employee.getSalary() );  // Null Pointer Exception

        //  in order  to specify all possible Exceptions I created multiCatchBlock

        try{
            System.out.println( employee.getSalary() );
        }catch(IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();

        }catch(ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();

        }catch(ClassCastException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }


    }

}
