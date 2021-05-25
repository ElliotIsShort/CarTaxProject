package com.example.cartax.config;

import com.example.cartax.models.Car;
import com.example.cartax.models.Customer;
import com.example.cartax.models.Registration;
import com.example.cartax.models.Tax;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer
{
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors)
    {
        config.exposeIdsFor(Car.class);
        config.exposeIdsFor(Customer.class);
        config.exposeIdsFor(Registration.class);
        config.exposeIdsFor(Tax.class);
    }
}
