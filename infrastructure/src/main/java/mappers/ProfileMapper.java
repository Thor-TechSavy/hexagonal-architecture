package mappers;

import com.example.business.objects.ProfileDto;
import entity.ProfileEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    ProfileDto profileToProfileDto(ProfileEntity profileEntity);

    ProfileEntity profileDtoToProfile(ProfileDto profileDto);

    List<ProfileDto> profileListToProfileDtoList(List<ProfileEntity> bookList);

    List<ProfileEntity> profileDtoListToProfileList(List<ProfileDto> BookDtoList);
}
