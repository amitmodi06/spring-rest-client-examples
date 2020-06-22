package amit.springframework.springrestclientexamples.service;

import amit.springframework.api.domain.User;
import amit.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * created by KUAM on 6/21/2020
 */
@Service
public class ApiServiceImpl implements ApiService{

    private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UserData userData = restTemplate.getForObject("https://private-anon-2fcbf4dfb2-apifaketory.apiary-mock.com/api/user?limit="+limit, UserData.class);
        return userData.getData();
    }
}
