package day23_CustomMethod_Void;

public class CustomMethodIntro2 {
    public static void main(String[] args) {

        helloWord5Times();

        System.out.println("=====================");

        helloCydeo5Times();

        System.out.println("===============================");
        evenNumbers();


    }

    //  create a function that can print hello word  5 times ==> helloWord5Times(name must meaninfull)
    public static void helloWord5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello word!");
        }

    }


    //  create a function  that can print hello Cydeo  5 times ===> helloCydeo5Times   (the name of method)
    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }

    //  create function that  can print all the even numbers  from 1~10

    public static void evenNumbers(){
        for (int i=2; i<11; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }



}
