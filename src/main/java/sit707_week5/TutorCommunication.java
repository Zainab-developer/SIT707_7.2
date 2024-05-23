package sit707_week5;

public class TutorCommunication {
    public boolean sendMessage(int taskId, String message) {
 
        System.out.println("Message sent for Task " + taskId + ": " + message);
        return true;
    }
}
