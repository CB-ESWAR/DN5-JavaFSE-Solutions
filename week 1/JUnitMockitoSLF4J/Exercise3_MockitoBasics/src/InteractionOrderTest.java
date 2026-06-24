import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class InteractionOrderTest {

    @Test
    void testOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();

        mockApi.sendData("Hello");

        InOrder order = inOrder(mockApi);

        order.verify(mockApi).getData();

        order.verify(mockApi).sendData("Hello");
    }
}