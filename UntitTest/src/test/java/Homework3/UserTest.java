package Homework3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserTest {
    public static User userActual;
    public static User userFail;

    public UserTest() {
    }

    @BeforeAll
    public static void createUsers() {
        userActual = new User("someName", "somePassword", Role.ADMIN);
        userFail = new User("someName", "somePassword", Role.USER);
    }

    @Test
    void checkAuthenticatePositive() {
        userActual.authenticate("someName", "somePassword");
        Assertions.assertTrue(userActual.isAuthenticate);
    }

    @Test
    void checkAuthenticateNegative() {
        userFail.authenticate("wrongName", "wrongPassword");
        Assertions.assertFalse(userFail.isAuthenticate);
    }

    @Test
    void checkIsRoleAdminPositive() {
        Assertions.assertTrue(userActual.isRoleAdmin());
    }

    @Test
    void checkIsRoleAdminNegative() {
        Assertions.assertFalse(userFail.isRoleAdmin());
    }
}
