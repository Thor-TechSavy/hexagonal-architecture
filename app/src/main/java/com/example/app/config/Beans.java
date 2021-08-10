package com.example.app.config;

import adapters.ProfileRepositoryAdapter;
import com.example.business.port.api.ProfileServicePort;
import com.example.business.port.spi.ProfileRepositoryPort;
import com.example.business.service.ProfileServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public ProfileRepositoryPort profileRepository() {
        return new ProfileRepositoryAdapter();
    }

    @Bean
    public ProfileServicePort profileService(ProfileRepositoryPort r) {
        return new ProfileServiceImpl(r);
    }
}
