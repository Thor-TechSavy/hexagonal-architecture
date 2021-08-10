package entity;

import com.example.business.objects.NewProfileDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class ProfileEntity {

    @Id
    private Long id;

    private String name;

    public static ProfileEntity of(NewProfileDto newProfileDto) {
        var result = new ProfileEntity();
        result.setName(newProfileDto.getName());

        return result;
    }
}
