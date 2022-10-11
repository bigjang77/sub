package site.metacoding.testproject.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.home.Home;
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
        User principal = (User) session.getAttribute("principal");
        if (principal == null) {
            model.addAttribute("detailDto", homeService.집상세보기(homeId, 0));
        } else {
            model.addAttribute("detailDto", homeService.집상세보기(homeId, principal.getUserId()));
        }
        return "home/detail";
    }

    @PostMapping("/home/{homeId}/sub")
    public @ResponseBody CMRespDto<?> insertSub(@PathVariable Integer homeId) {
        User principal = (User) session.getAttribute("principal");
        Sub sub = new Sub(principal.getUserId(), homeId);
        homeService.구독하기(sub);
        return new CMRespDto<>(1, "구독성공", sub);
    }

    @DeleteMapping("/home/{homeId}/sub/{subId}")
    public @ResponseBody CMRespDto<?> deleteSub(@PathVariable Integer homeId, @PathVariable Integer subId) {
        homeService.구독취소하기(subId);
        return new CMRespDto<>(1, "구독취소성공", null);
    }

    @GetMapping("/home")
    public String getHomeList(Model model) {
        List<Home> homeList = homeService.집목록보기();
        model.addAttribute("homeList", homeList);
        return "/home/list";
    }
}
