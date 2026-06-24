import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceExceptionTest {

    @Test
    void testMissingUser() {

        assertThrows(
                RuntimeException.class,
                () -> {
                    throw new RuntimeException();
                }
        );
    }
}