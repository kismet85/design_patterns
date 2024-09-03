package AssertEqualTest;

import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorIsmetTest {

    private static StringManipulatorIsmet stringManipulatorIsmet;

    @Before
    public void setUp() {
        stringManipulatorIsmet = new StringManipulatorIsmet();
    }

    @Test
    public void testReverse() {
        assertEquals("Hello World", stringManipulatorIsmet.reverse("dlroW olleH"));
    }

    @Test
    public void testCapitalize() {
        assertEquals("HELLO", stringManipulatorIsmet.capitalize("hello"));
    }

    @After
    public void tearDown() {
        stringManipulatorIsmet = null;
    }
}