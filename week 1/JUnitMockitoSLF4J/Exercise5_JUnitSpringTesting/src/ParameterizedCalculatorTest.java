import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "2,3,5",
            "4,5,9",
            "10,20,30"
    })
    void testAdd(
            int a,
            int b,
            int expected
    ) {

        assertEquals(
                expected,
                a + b
        );
    }
}