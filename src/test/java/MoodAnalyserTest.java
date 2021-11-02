import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();
    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.analyseMood("I am Sad in Mood");
        Assert.assertEquals("SAD", actualResult);
    }

    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        String actualResult = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", actualResult);
    }

//    @Test
//    public void givenMessage_Null_ShouldReturnExceptionHandled() {
//        moodAnalyser.setMessage(null);
//        String actualResult = moodAnalyser.analyseMood("I am in Any Mood");
//        Assert.assertEquals("Exception Handled", actualResult);
//    }

}