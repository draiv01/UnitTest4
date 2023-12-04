package seminar4;

import Homework3.User;
import Homework3.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int userId) {
// Логика получения пользователя из репозитория
        return userRepository.getUserById(userId);
    }
}
