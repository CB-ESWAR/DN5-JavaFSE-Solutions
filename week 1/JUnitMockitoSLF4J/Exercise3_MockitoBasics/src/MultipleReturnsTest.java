import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultipleReturnsTest {

    @Test
    void testMultipleReturns() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First")
                .thenReturn("Second");

        assertEquals("First", mockApi.getData());

        assertEquals("Second", mockApi.getData());
    }
}