package com.example.business.port.spi;

import com.example.business.objects.ProfileDto;

import java.util.List;

public interface ProfileRepositoryPort {

    List<ProfileDto> findAll();

    ProfileDto save(ProfileDto profileDto);
}
