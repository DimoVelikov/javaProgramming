package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        super("Time for short break!");
    }

    public FadyException(String message) {
        super(message);
    }
}

class NoBreakException extends RuntimeException{

    public NoBreakException(){
        super("NO BREAK!!!");
    }

    public NoBreakException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
       // throw new FadyException();

        throw new NoBreakException();
    }
}
