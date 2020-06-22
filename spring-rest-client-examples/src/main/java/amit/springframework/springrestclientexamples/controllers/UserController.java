package amit.springframework.springrestclientexamples.controllers;

import amit.springframework.springrestclientexamples.service.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ServerWebExchange;

/**
 * created by KUAM on 6/22/2020
 */
@Slf4j
@Controller
public class UserController {

    private ApiService apiService;

    public UserController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping({"", "/", "/index"})
    public String index(){
        return "index";
    }

    @PostMapping("/users")
    public String formPost(Model model, ServerWebExchange serverWebExchange){
        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();

        Integer limit = new Integer(map.get("limit").get(0));
        log.debug("Received Limit Value: " + limit);

        //default if null of zero
        if(limit == null || limit == 0){
            log.debug("Setting limit to default of 1");
            limit = 1;
        }

        model.addAttribute("users", apiService.getUsers(limit));

        return "userlist";
    }
}
