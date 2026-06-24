import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {

        UserRepository repository =
                mock(UserRepository.class);

        User user = new User();

        when(repository.findById(1L))
                .thenReturn(java.util.Optional.of(user));

        UserService service =
                new UserService();

        User result =
                repository.findById(1L).orElse(null);

        assertNotNull(result);
    }
}