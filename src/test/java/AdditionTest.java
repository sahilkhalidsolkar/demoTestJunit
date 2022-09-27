import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void add() {
        int result = Addition.add(10,10);
        int correct = 20;

        assertEquals(correct, result);

    }
}