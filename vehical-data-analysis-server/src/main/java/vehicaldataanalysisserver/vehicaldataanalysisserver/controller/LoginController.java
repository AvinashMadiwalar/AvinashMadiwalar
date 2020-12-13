package vehicaldataanalysisserver.vehicaldataanalysisserver.controller;

import vehicaldataanalysisserver.vehicaldataanalysisserver.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicaldataanalysisserver.vehicaldataanalysisserver.dto.AuthorizationDTO;

@RestController
@CrossOrigin
@RequestMapping
public class LoginController {

    @Autowired
    private AuthorizationService authorizationService;

    @GetMapping(value = "/login", produces = "application/json")
    public AuthorizationDTO
    login(
            @RequestParam("username") String username,
            @RequestParam("password") String password) throws Exception {
        return authorizationService.getAuthorizationConfig(username, password);
    }
}
