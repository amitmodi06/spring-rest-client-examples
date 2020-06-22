package amit.springframework.springrestclientexamples.service;

import amit.springframework.api.domain.User;

import java.util.List;

/**
 * created by KUAM on 6/21/2020
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
