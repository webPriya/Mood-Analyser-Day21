public class MoodAnalyser {
public String analyseMood(String message){
    if (message.toLowerCase().contains("happy")) {
        return "Happy";
    } else if (message.toLowerCase().contains("sad")) {
        return "Sad";
    } else {
        return null;
    }
}
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am Happy");
        System.out.println(mood);
        mood = moodAnalyser.analyseMood("I am Sad");
        System.out.println(mood);
    }
}
