import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class MoodAnalyserTest {
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
        Assert.assertEquals("SAD", actualResult);
    }
}