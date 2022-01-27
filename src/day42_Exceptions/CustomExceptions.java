package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(String message){
       super(message);
    }
}

//  we can creat  Exc. by myself


public class CustomExceptions {

    public static void main(String[] args) {

        throw new FadyException("It's time for break");



    }





}
