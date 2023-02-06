import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SampleTest {

    static String setupStr;
    @BeforeAll
    static void setUp() {
        setupStr = new String("Hello World");
        System.out.println("This is only going to be ran once!");
    }


    @BeforeEach
    void init() {
        System.out.println("This is running before each test cases!");
    }

    @Test
    void testOne() {
        assertEquals(5, 5, "testone failed");
    }

    @Test
    void testTwo() {
        assertEquals("Hello World", "Hello World", "testtwo failed");
    }

    @Test
    void testThree() {
        int[] expected = {5, 7, 2};
        int[] actual = {5, 7, 2};
        assertArrayEquals(expected, actual, "We got the wrong list");
    }

    @Test
    void testFour() {
        assertEquals("Hello World", setupStr, "wrong string found");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,-3})
    void testFive(int x) {
        System.out.println(x);
        assertTrue(Numbers.isOdd(x));
    }
}
