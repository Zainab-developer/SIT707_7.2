package sit707_week5;

import org.junit.Test;
import static org.junit.Assert.*;

public class TutorCommunicationTest {
    @Test
    public void testSendMessage() {
        TutorCommunication tutorCommunication = new TutorCommunication();
        boolean messageSent = tutorCommunication.sendMessage(1, "Please review my task.");
        assertTrue(messageSent);
    }
}
