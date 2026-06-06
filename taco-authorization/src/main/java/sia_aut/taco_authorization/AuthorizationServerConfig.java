package sia_aut.taco_authorization;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration(proxyBeanMethods = false)
public class AuthorizationServerConfig {
    public SecurityFilterChain authrizationServerSecurityFilterChain(HttpSecurity httpSecurity)
        throws Exception {
        OAuth2AuthorizationServerConfiguration
                .applyDefaultSecurity(httpSecurity);
        return httpSecurity
                .formLogin(Customizer.withDefaults())
                .build();
    }
}
