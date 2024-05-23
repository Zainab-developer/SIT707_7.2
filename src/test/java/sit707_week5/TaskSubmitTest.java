package sit707_week5;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskSubmitTest {
    @Test
    public void testSubmitTask() {
        TaskSubmit taskSubmit = new TaskSubmit();
        Task task = new Task(3, "Task 3", "Description of Task 3");
        boolean submitted = taskSubmit.submitTask(task);
        assertTrue(submitted);
    }
}
