import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> test1 = Arrays.asList(new String[]{"one", "two", "three"});
        StringChecker sc = new ListExamples();

        List<String> result = ListExamples.filter(test1, sc);
        assertEquals(Arrays.asList(new String[]{"one", "two", "three"}), result);
    }

    @Test
    public void testMerge() {
        List<String> lst1 = Arrays.asList(new String[]{"apple", "banana"});
        List<String> lst2 = Arrays.asList(new String[]{"pineapple", "oranges"});
        List<String> test = Arrays.asList(new String[]{"apple", "banana", "pineapple", "oranges"});
        List<String> result = ListExamples.merge(lst1, lst2);
        assertEquals(test, result);
    }

}
