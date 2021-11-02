public class MoodAnalyserException extends Exception {
    public String message;
    public ExceptionType exceptionType;

    enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY;
    }

    public MoodAnalyserException(String message, ExceptionType type) {
        this.message = message;
        this.exceptionType = type;
    }
}
