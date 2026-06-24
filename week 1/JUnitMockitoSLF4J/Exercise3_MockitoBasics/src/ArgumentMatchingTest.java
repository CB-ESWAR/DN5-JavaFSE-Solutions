import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class ArgumentMatchingTest {

    @Test
    void testArgumentMatcher() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.send("Hello");

        verify(mockApi).sendData(anyString());
    }
}