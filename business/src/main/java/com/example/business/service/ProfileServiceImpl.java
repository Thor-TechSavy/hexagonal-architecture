package com.example.business.service;

import com.example.business.objects.NewProfileDto;
import com.example.business.objects.ProfileDto;
import com.example.business.port.api.ProfileServicePort;
import com.example.business.port.spi.ProfileRepositoryPort;

import java.util.List;

public class ProfileServiceImpl implements ProfileServicePort {

    private final ProfileRepositoryPort repository;

    public ProfileServiceImpl(ProfileRepositoryPort repository) {
        this.repository = repository;
    }

    public List<ProfileDto> getAll() {
        return repository.findAll();
    }

    public ProfileDto create(NewProfileDto newProfileDto) {
        var profileDto = ProfileDto.of(newProfileDto);
        return repository.save(profileDto);
    }

}
