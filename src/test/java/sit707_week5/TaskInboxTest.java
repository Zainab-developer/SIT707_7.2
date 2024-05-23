package sit707_week5;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class TaskInboxTest {
    @Test
    public void testViewTaskInbox() {
        TaskView taskView = new TaskView();
        List<Task> tasks = taskView.viewTaskInbox(123);
        assertNotNull(tasks);
        assertEquals(2, tasks.size());
    }

    @Test
    public void testViewTaskDetail() {
        TaskView taskView = new TaskView();
        TaskDetail taskDetail = taskView.viewTaskDetail(1);
        assertNotNull(taskDetail);
        assertEquals(1, taskDetail.getId());
        assertEquals("Sample feedback", taskDetail.getFeedback());
        assertEquals(2, taskDetail.getChatMessages().size());
    }
}
