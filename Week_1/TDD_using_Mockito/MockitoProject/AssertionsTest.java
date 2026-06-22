package Week_1.TDD_using_Mockito.MockitoProject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");

        // Assert true
        assertTrue(5 > 3, "5 should be greater than 3");

        // Assert false
        assertFalse(5 < 3, "5 should not be less than 3");

        // Assert null
        String str = null;
        assertNull(str, "String should be null");

        // Assert not null
        Object obj = new Object();
        assertNotNull(obj, "Object should not be null");

        // Assert same (reference equality)
        Object ref = obj;
        assertSame(obj, ref, "Both references should point to same object");

        // Assert not same
        Object anotherObj = new Object();
        assertNotSame(obj, anotherObj, "Objects should not be the same reference");
    }
}
