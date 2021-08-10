package com.example.business.objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileDto {

    private Long id;
    private String name;

    public static ProfileDto of(NewProfileDto newProfileDto) {
        var result = new ProfileDto();
        result.setName(newProfileDto.getName());

        return result;
    }
}
