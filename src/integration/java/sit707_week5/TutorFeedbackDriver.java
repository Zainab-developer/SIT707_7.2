package sit707_week5;

public class TutorFeedbackDriver {
    public void testProvideFeedback() {
        TutorFeedback tutorFeedback = new TutorFeedback();
        boolean feedbackProvided = tutorFeedback.provideFeedback(1, "Good job!");
        System.out.println("Feedback provided: " + feedbackProvided);
    }

    public static void main(String[] args) {
        TutorFeedbackDriver driver = new TutorFeedbackDriver();
        driver.testProvideFeedback();
    }
}