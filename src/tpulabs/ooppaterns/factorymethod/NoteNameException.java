package tpulabs.ooppaterns.factorymethod;

public class NoteNameException extends Exception{

    public NoteNameException(String message){
        super(message);
    }

    public NoteNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoteNameException(Throwable cause) {
        super(cause);
    }

    protected NoteNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
