package com.example.business.service;

import com.example.business.objects.NewProfileDto;
import com.example.business.objects.ProfileDto;
import com.example.business.port.api.ProfileServicePort;
import com.example.business.port.spi.ProfileRepositoryPort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileServicePort {

    private final ProfileRepositoryPort profileRepositoryPort;

    public List<ProfileDto> getAll() {
        return profileRepositoryPort.findAll();
    }

    public ProfileDto create(NewProfileDto newProfileDto) {
        var profileDto = ProfileDto.of(newProfileDto);
        return profileRepositoryPort.save(profileDto);
    }

}
