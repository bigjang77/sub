package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.user.User;
import site.metacoding.testproject.domain.user.UserDao;
import site.metacoding.testproject.web.dto.request.user.LoginDto;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserDao userDao;

    public User 로그인(LoginDto loginDto) {
        User userPS = userDao.findByUsername(loginDto.getUsername());

        if (userPS.getPassword().equals(loginDto.getPassword())) {
            return userPS;
        } else {
            return null;
        }
    }
}
