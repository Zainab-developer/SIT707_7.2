package sit707_week5;

import java.util.ArrayList;
import java.util.List;

public class TaskView {
    public List<Task> viewTaskInbox(int studentId) {
      
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(1, "Task 1", "Description of Task 1"));
        tasks.add(new Task(2, "Task 2", "Description of Task 2"));
        return tasks;
    }

    public TaskDetail viewTaskDetail(int taskId) {
        
        List<String> chatMessages = new ArrayList<>();
        chatMessages.add("Message 1");
        chatMessages.add("Message 2");
        return new TaskDetail(taskId, "Sample feedback", chatMessages);
    }
}
