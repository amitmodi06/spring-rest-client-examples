package amit.springframework.api.domain;

import java.util.List;

/**
 * created by KUAM on 6/21/2020
 */
public class UserData {

    List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
