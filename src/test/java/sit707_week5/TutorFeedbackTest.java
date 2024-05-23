package sit707_week5;

import org.junit.Test;
import static org.junit.Assert.*;

public class TutorFeedbackTest {
    @Test
    public void testProvideFeedback() {
        TutorFeedback tutorFeedback = new TutorFeedback();
        boolean feedbackProvided = tutorFeedback.provideFeedback(1, "Good job!");
        assertTrue(feedbackProvided);
    }
}
