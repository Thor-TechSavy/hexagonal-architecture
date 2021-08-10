package com.example.appapi;

import com.example.business.objects.NewProfileDto;
import com.example.business.objects.ProfileDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles/v1/")
public interface ProfileContract {

    @GetMapping
    List<ProfileDto> findAll();

    @PostMapping
    ProfileDto create(@RequestBody NewProfileDto p);

}
