import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoidMethodExceptionTest {

    @Test
    void testVoidException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Error"))
                .when(mockApi)
                .deleteData();

        assertThrows(
                RuntimeException.class,
                () -> mockApi.deleteData()
        );
    }
}