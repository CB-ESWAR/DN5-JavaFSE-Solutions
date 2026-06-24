import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserIntegrationTest {

    @Test
    void testIntegration() {

        UserService service =
                mock(UserService.class);

        User user =
                new User(1L, "Eswar");

        when(service.getUserById(1L))
                .thenReturn(user);

        UserController controller =
                new UserController(service);

        User result =
                controller.getUser(1L);

        assertNotNull(result);

        assertEquals("Eswar",
                result.getName());
    }
}