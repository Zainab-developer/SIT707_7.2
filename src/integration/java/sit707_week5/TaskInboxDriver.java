package sit707_week5;

import java.util.List;

public class TaskInboxDriver {
    public void testTaskInbox() {
        TaskView taskView = new TaskView();
        List<Task> tasks = taskView.viewTaskInbox(123);
        for (Task task : tasks) {
            System.out.println("Task: " + task.getTitle());
            TaskDetail taskDetail = taskView.viewTaskDetail(task.getId());
            System.out.println("Feedback: " + taskDetail.getFeedback());
            for (String message : taskDetail.getChatMessages()) {
                System.out.println("Message: " + message);
            }
        }
    }

    public static void main(String[] args) {
        TaskInboxDriver driver = new TaskInboxDriver();
        driver.testTaskInbox();
    }
}