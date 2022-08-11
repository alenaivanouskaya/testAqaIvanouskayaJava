package test;

import main.Task3Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class Task3Test {
    @Test
    public void testExample1() {
        List<Integer> inputValue = List.of(1, 2, 3, 4, 5);
        List<Integer> result = Task3Main.filter(inputValue);
        Assertions.assertTrue(result.contains(3));
        Assertions.assertFalse(result.contains(1));
        Assertions.assertFalse(result.contains(2));
        Assertions.assertFalse(result.contains(4));
        Assertions.assertFalse(result.contains(5));
    }

    @Test
    public void testExample2() {
        List<Integer> inputValue = List.of();
        List<Integer> result = Task3Main.filter(inputValue);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void testExample3() {
        try {
            List<Integer> result = Task3Main.filter(null);
        } catch (NullPointerException e) {
            Assertions.assertNotNull(e);
        }
    }
}