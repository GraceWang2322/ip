package task.event;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class EventTest {

        @Test
        public void getTask_newTask_success() {
            assertEquals(" party (at 2019-10-15)",
                    new Event("event party /at 2019-10-15").get_task());
        }
}