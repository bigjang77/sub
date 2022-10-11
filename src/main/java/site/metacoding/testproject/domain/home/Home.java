package site.metacoding.testproject.domain.home;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Home {
    private Integer homeId;
    private String homeName;
    private String homeTel;
    private String homeLocation;
}
