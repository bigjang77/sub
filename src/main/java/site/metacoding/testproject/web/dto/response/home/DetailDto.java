package site.metacoding.testproject.web.dto.response.home;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DetailDto {
    private Integer homeId;
    private String homeName;
    private String homeTel;
    private String homeLocation;
    private Integer userId;
    private boolean isSubed;
    private Integer subId;
}
