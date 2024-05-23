package sit707_week5;

public class TaskSubmitDriver {
    public void testSubmitTask() {
        TaskSubmit taskSubmit = new TaskSubmit();
        Task task = new Task(3, "Task 3", "Description of Task 3");
        boolean submitted = taskSubmit.submitTask(task);
        System.out.println("Task submitted: " + submitted);
    }

    public static void main(String[] args) {
        TaskSubmitDriver driver = new TaskSubmitDriver();
        driver.testSubmitTask();
    }
}