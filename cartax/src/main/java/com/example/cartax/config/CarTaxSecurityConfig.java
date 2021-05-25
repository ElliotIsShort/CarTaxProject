package com.example.cartax.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;

@Configuration
@EnableWebSecurity
public class CarTaxSecurityConfig extends WebSecurityConfigurerAdapter
{
    String jwkSetUri = "http://localhost:8090/auth/realms/CarTaxAuthRealm/protocol/openid-connect/certs";

    private Converter<Jwt, ? extends AbstractAuthenticationToken> jwtAuthenticaionConverter()
    {
        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();

        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(new KeycloakRealmRoleConverter());

        return jwtAuthenticationConverter;
    }

    @Bean
    JwtDecoder jwtDecoder()
    {
        return NimbusJwtDecoder.withJwkSetUri(this.jwkSetUri).build();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.cors().and().authorizeRequests()
                .antMatchers(HttpMethod.GET, "/**").hasRole("cartaxuser")
                .antMatchers(HttpMethod.POST, "/car/").hasRole("cartaxuser")
                .antMatchers(HttpMethod.POST, "/customer/").hasRole("cartaxuser")
                .antMatchers(HttpMethod.POST, "/**").hasRole("cartaxadmin")
                .antMatchers(HttpMethod.DELETE, "/**").hasRole("cartaxadmin")
                .antMatchers(HttpMethod.PATCH, "/**").hasRole("cartaxadmin")
                .antMatchers(HttpMethod.PUT, "/**").hasRole("cartaxadmin")
                .anyRequest().authenticated().and().oauth2ResourceServer().jwt(jwt -> jwt.jwtAuthenticationConverter(jwtAuthenticaionConverter()));
    }
}
