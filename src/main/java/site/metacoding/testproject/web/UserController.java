package site.metacoding.testproject.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.user.User;
import site.metacoding.testproject.service.UserService;
import site.metacoding.testproject.web.dto.request.user.LoginDto;
import site.metacoding.testproject.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;
    private final HttpSession session;

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @PostMapping("/login")
    public @ResponseBody CMRespDto<?> login(@RequestBody LoginDto loginDto) {
        User principal = userService.로그인(loginDto);

        if (principal == null) {
            return new CMRespDto<>(-1, "로그인실패", null);
        }

        session.setAttribute("principal", principal);
        return new CMRespDto<>(1, "로그인성공", null);
    }
}
