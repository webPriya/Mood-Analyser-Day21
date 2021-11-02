import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() throws MoodAnalyserException {
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }

    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() throws MoodAnalyserException {
        moodAnalyser.setMessage("I am in Any Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnHappy() throws MoodAnalyserException {
        moodAnalyser.setMessage(null);
        try {
            String actualResult = moodAnalyser.analyseMood();
            Assert.assertEquals("Entered Invalid Mood", actualResult);
        } catch (MoodAnalyserException e) {
            e.printStackTrace();
        }
    }
}