public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {

        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else if (message.toLowerCase().contains("any")) {
            return "HAPPY";
        } else {
            return null;
        }
    }
}
