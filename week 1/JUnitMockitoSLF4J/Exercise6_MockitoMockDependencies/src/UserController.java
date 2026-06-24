public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUser(Long id) {
        return userService.getUserById(id);
    }
}