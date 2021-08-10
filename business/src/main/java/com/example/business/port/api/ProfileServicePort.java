package com.example.business.port.api;

import com.example.business.objects.NewProfileDto;
import com.example.business.objects.ProfileDto;

import java.util.List;

public interface ProfileServicePort {


    List<ProfileDto> getAll();

    ProfileDto create(NewProfileDto newProfileDto);

}
