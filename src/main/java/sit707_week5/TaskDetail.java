package sit707_week5;

import java.util.List;

public class TaskDetail {
    private int id;
    private String feedback;
    private List<String> chatMessages;

    public TaskDetail(int id, String feedback, List<String> chatMessages) {
        this.id = id;
        this.feedback = feedback;
        this.chatMessages = chatMessages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public List<String> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<String> chatMessages) {
        this.chatMessages = chatMessages;
    }
}