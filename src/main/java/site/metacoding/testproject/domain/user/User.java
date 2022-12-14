package site.metacoding.testproject.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
    private Integer userId;
    private String name;
    private String username;
    private String password;
    private String job;
}
