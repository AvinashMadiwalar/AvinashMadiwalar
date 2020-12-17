package vehicaldataanalysisserver.vehicaldataanalysisserver.dto;

import vehicaldataanalysisserver.vehicaldataanalysisserver.entity.AuthorizationConfig;

public class AuthorizationDTO {

    private String accessToken;
    private String tokenType;
    private String expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public static AuthorizationDTO convertToDto(AuthorizationConfig auth) {
        AuthorizationDTO authorizationDTO = new AuthorizationDTO();
        authorizationDTO.setAccessToken(auth.getAccess_token());
        authorizationDTO.setTokenType(auth.getToken_type());
        authorizationDTO.setExpiresIn(auth.getExpires_in());
        return authorizationDTO;
    }
}
