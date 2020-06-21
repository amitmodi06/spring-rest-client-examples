package amit.springframework.api.domain;

import java.util.List;

/**
 * created by KUAM on 6/21/2020
 */
public class UserData {

    List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
