package site.metacoding.testproject.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.sub.Sub;
import site.metacoding.testproject.domain.user.User;
import site.metacoding.testproject.service.HomeService;
import site.metacoding.testproject.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final HomeService homeService;
    private final HttpSession session;

    @GetMapping("/home/{homeId}")
    public String getHomeDetail(@PathVariable Integer homeId, Model model) {
        model.addAttribute("home", homeService.집상세보기(homeId));
        return "home/detail";
    }

    @PostMapping("/home/{homeId}/sub")
    public @ResponseBody CMRespDto<?> insertSub(@PathVariable Integer subId) {
        User principal = (User) session.getAttribute("principal");
        Sub sub = new Sub(principal.getUserId(), subId);
        homeService.구독하기(sub);
        return new CMRespDto<>(1, "구독성공", null);
    }
}
