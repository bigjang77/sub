package site.metacoding.testproject.domain.sub;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Sub {
    private Integer subId;
    private Integer userId;
    private Integer homeId;
}
