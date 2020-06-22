package amit.springframework.springrestclientexamples.service;

import amit.springframework.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

//@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest
class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    //@BeforeEach
    @Before
    void setUp() {
    }

    @Test
    void testGetUsers() throws Exception{
        List<User> users = apiService.getUsers(1);
        assertEquals(1, users.size());
    }
}