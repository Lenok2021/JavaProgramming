package day42_Exceptions;

class FadyException extends RuntimeException {

    public FadyException() {
        super("Time for a short break");
    }

    public FadyException(String message) {
        super(message);
    }
}

class NoBreakException extends Exception {

}

//  we can creat  Exc. by myself


public class CustomExceptions {

    public static void main(String[] args) {

        // throw new FadyException("It's time for break");
        throw new FadyException();
        // when we have 2 Constructor we have two ways  how to create OB



         // throw new NoBreakException();

        // we get error BC is a checked Exc.
        // we don't use Throw KeyWord for checked Exc.
        // checked Exc/ does not have is a relationship with RunTime Class


    }

}
