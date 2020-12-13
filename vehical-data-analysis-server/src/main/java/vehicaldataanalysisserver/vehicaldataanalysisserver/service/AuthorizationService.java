package vehicaldataanalysisserver.vehicaldataanalysisserver.service;

import vehicaldataanalysisserver.vehicaldataanalysisserver.dto.AuthorizationDTO;

public interface AuthorizationService {

    AuthorizationDTO getAuthorizationConfig(String username, String password);
}
