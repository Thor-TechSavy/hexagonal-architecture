package com.example.business.port.api;

import com.example.business.objects.NewProfileDto;
import com.example.business.objects.ProfileDto;

import java.util.List;

public interface ProfileServicePort {


    public List<ProfileDto> getAll();

    public ProfileDto create(NewProfileDto newProfileDto);

}
