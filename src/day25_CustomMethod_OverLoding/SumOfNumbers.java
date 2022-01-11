package day25_CustomMethod_OverLoding;

public class SumOfNumbers {

    public static void main(String[] args) {
       int sum=sumOf2Numbers(10,20); // method returns you a value, you can assingh it to a variable
        System.out.println("sum = " + sum);

        System.out.println("===========================");
        int sum2 = sumOf3Numbers(10,20,30);
        System.out.println(sum2);

        System.out.println("===================================");

        System.out.println(sumOf4Numbers(10,20,30,40)); // we can just print

    }
    //create a method that can find the sum of two numbers
    //	                    method name: sumOf2Numbers, sumOf3Numbers,sumOf4Numbers
    
    public static int sumOf2Numbers (int number1, int number2){
        return number1+number2;
    }

    public static int sumOf3Numbers (int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOf4Numbers (int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }



}


