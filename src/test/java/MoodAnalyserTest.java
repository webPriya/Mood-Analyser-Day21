import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", actualResult);
    }

}