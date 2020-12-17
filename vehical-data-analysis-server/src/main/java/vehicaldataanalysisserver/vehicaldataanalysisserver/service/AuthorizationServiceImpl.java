package vehicaldataanalysisserver.vehicaldataanalysisserver.service;

import vehicaldataanalysisserver.vehicaldataanalysisserver.entity.AuthorizationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import vehicaldataanalysisserver.vehicaldataanalysisserver.dto.AuthorizationDTO;

import java.util.Objects;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    private vehicaldataanalysisserver.vehicaldataanalysisserver.configuration.AuthorizationConfig env;

    @Override
    public AuthorizationDTO getAuthorizationConfig(String username, String password) {
        RestTemplate restTemplate = new RestTemplate();
        String authBody = "username=" + username + "&password=" + password + "&grant_type=password";
        HttpEntity<String> request =
                new HttpEntity<>(authBody, createHeader());
        ResponseEntity<AuthorizationConfig> authorizationResponse = restTemplate.postForEntity(env.getAuthorizationUrl(), request, AuthorizationConfig.class);
        return AuthorizationDTO.convertToDto(Objects.requireNonNull(authorizationResponse.getBody()));
    }

    private HttpHeaders createHeader() {
        return new HttpHeaders() {{
            String encodedAuth = encodeBasicAuth(env.getClientId(), env.getClientSecret(), null);
            String authHeader = "Basic " + encodedAuth;
            set("Authorization", authHeader);
            setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        }};
    }
}
