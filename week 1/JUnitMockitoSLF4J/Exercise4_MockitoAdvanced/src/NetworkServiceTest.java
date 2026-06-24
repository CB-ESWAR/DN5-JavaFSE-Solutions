import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NetworkServiceTest {

    @Test
    void testServiceWithMockNetworkClient() {

        NetworkClient client =
                mock(NetworkClient.class);

        when(client.connect())
                .thenReturn("Mock Connection");

        NetworkService service =
                new NetworkService(client);

        String result =
                service.connectToServer();

        assertEquals(
                "Connected to Mock Connection",
                result
        );
    }
}