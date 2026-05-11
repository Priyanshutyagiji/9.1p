package ontrack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaskStatusTest {

    @Test
    public void testMarkedCompleteStatus() {

        TaskStatus status = new TaskStatus();

        assertEquals("Marked Complete",
                status.checkStatus("S101", "9.1P"));
    }
}