package day52Map_Continue;

public class TaskFunctionalInterface {

    public static void main(String[] args) {


        // we need some functions in our class
        // to create 3 methods is not a good choice, consume memory
        // FI  can be signature for all 3 functions
        //regular method: we can use this method to perform specific tasks
        // FI (abstract method) we can apply for multiple tasks
        // we can create ONLY one method!!!!!

        //1. create F. that can display if the number is odd or even

        // call FI, the AM in FI does not have body
        // we can provide the implementation by using Lambda Exp.
        // () ->{   } = Lambda EXp.
        // if your FI  has apr.  you have to provide the character (name) in Lambda Exp.
        // you don't need () for Lambda if AM of FI passes only one parameter
        // in this case  is an optional


        FunctionalInterface oddEvenNumber = (n) ->{
            if(n%2 ==0){
                System.out.println(n+ " even number");
            }else{
                System.out.println(n+ " odd number");
            }
        };
           oddEvenNumber.apply(20);  // we called FI through the method name


        System.out.println("=================================================================");

        //2. create F.  that can check is the person eligible to buy beer

        FunctionalInterface eligibleToBuyBeer = (age) -> {
            if(age < 21 ){
                System.out.println("Eligible");
            }else{
                System.out.println("Not eligible");
            }

        };
        eligibleToBuyBeer.apply(34);

        //3. create the F. that can display the cube of a number

        FunctionalInterface printCubeOfNumbers = (a) ->{System.out.println(a*a*a);};

        printCubeOfNumbers.apply(5);





    }
}
