package Homework3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRepositoryTest {
    public UserRepository userRepository;
    public User userActual;
    public User userFail;

    public UserRepositoryTest() {
    }

    @BeforeEach
    public void setUp() {
        this.userRepository = new UserRepository();
        this.userActual = new User("someName", "somePassword", Role.ADMIN);
        this.userFail = new User("someName", "somePassword", Role.USER);
    }

    @Test
    void checkAddUserPositive() {
        this.userActual.authenticate("someName", "somePassword");
        this.userRepository.addUser(this.userActual);
        int expectListSize = 1;
        Assertions.assertEquals(expectListSize, this.userRepository.data.size());
    }

    @Test
    void checkExceptionWithAddUser() {
        this.userFail.authenticate("wrongName", "wrongPassword");
        Exception exception = (Exception)Assertions.assertThrows(RuntimeException.class, () -> {
            this.userRepository.addUser(this.userActual);
        });
        String message = "wrong login or password!";
        Assertions.assertEquals(message, exception.getMessage());
    }

    @Test
    void checkFindByNamePositive() {
        this.userActual.authenticate("someName", "somePassword");
        this.userRepository.addUser(this.userActual);
        Assertions.assertTrue(this.userRepository.findByName("someName"));
    }

    @Test
    void checkFindByNameNegative() {
        this.userActual.authenticate("someName", "somePassword");
        this.userRepository.addUser(this.userActual);
        Assertions.assertFalse(this.userRepository.findByName("wrongName"));
    }

    @Test
    void checkLogOutExceptAdministrator() {
        this.userActual.authenticate("someName", "somePassword");
        this.userFail.authenticate("someName", "somePassword");
        this.userRepository.addUser(this.userActual);
        this.userRepository.addUser(this.userFail);
        this.userRepository.logOutExceptAdministrator();
        int expectListSize = 1;
        Assertions.assertEquals(expectListSize, this.userRepository.data.size());
    }
}
