package com.example.app.controller;


import com.example.appapi.ProfileContract;
import com.example.business.objects.NewProfileDto;
import com.example.business.objects.ProfileDto;
import com.example.business.port.api.ProfileServicePort;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequiredArgsConstructor
public class ProfileController implements ProfileContract {

    private final ProfileServicePort profileService;

    public List<ProfileDto> findAll() {
        return profileService.getAll();
    }

    public ProfileDto create(@RequestBody NewProfileDto p) {
        return profileService.create(p);
    }

}
