package addition;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    public void testAdd() {
        Addition addition = new Addition();
        assertEquals(5, addition.add(2, 3));
    }
}
