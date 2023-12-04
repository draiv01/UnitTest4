package Homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepository {
    List<User> data = new ArrayList();

    public UserRepository() {
    }

    public void addUser(User user) {
        if (user.isAuthenticate) {
            this.data.add(user);
        } else {
            throw new RuntimeException("wrong login or password!");
        }
    }

    public boolean findByName(String username) {
        Iterator var2 = this.data.iterator();

        User user;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            user = (User)var2.next();
        } while(!user.name.equals(username));

        return true;
    }

    public void logOutExceptAdministrator() {
        this.data.removeIf((user) -> {
            return !user.isRoleAdmin();
        });
    }
}

