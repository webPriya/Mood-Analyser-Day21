public class MoodAnalyser {

    private String message;

    public MoodAnalyser(String message) throws MoodAnalyserException {
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

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Entered Invalid Mood");
        }
    }
}
