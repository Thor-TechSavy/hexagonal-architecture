package com.example.app.config;

import com.example.business.port.api.ProfileServicePort;
import com.example.business.port.spi.ProfileRepositoryPort;
import com.example.business.service.ProfileServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public ProfileServicePort profileService(ProfileRepositoryPort profileRepositoryPort) {
        return new ProfileServiceImpl(profileRepositoryPort);
    }
}
