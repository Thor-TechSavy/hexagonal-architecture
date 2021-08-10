package adapters;

import com.example.business.port.spi.ProfileRepositoryPort;
import com.example.business.objects.ProfileDto;
import entity.ProfileEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import mappers.ProfileMapper;
import org.springframework.stereotype.Component;
import repository.ProfilesRepositoryJpa;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ProfileRepositoryAdapter implements ProfileRepositoryPort {

    private final ProfilesRepositoryJpa repositoryJpa;
    private final ProfileMapper profileMapper;

    @Override
    public List<ProfileDto> findAll() {
        List<ProfileEntity> all = repositoryJpa.findAll();

        return profileMapper.profileListToProfileDtoList(all);

    }

    @Override
    public ProfileDto save(ProfileDto profileDto) {


        ProfileEntity profileEntity = repositoryJpa.save(profileMapper.profileDtoToProfile(profileDto));

        return profileMapper.profileToProfileDto(profileEntity);
    }
}
