import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    void testRepositoryMock() {

        UserRepository repository =
                mock(UserRepository.class);

        User user =
                new User(1L, "Eswar");

        when(repository.findById(1L))
                .thenReturn(user);

        UserService service =
                new UserService(repository);

        User result =
                service.getUserById(1L);

        assertEquals("Eswar",
                result.getName());
    }
}