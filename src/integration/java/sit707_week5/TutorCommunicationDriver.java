package sit707_week5;

public class TutorCommunicationDriver {
    public void testSendMessage() {
        TutorCommunication tutorCommunication = new TutorCommunication();
        boolean messageSent = tutorCommunication.sendMessage(1, "Please review my task.");
        System.out.println("Message sent: " + messageSent);
    }

    public static void main(String[] args) {
        TutorCommunicationDriver driver = new TutorCommunicationDriver();
        driver.testSendMessage();
    }
}