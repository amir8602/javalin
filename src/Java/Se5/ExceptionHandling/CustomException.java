package Java.Se5.ExceptionHandling;

public class CustomException extends Exception{
    int line ;
    String msg ;

    public CustomException(String s, int line, String msg) {
        super(s);
        this.line = line;
        this.msg = msg;
    }
}
