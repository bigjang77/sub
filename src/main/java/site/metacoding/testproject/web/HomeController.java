package site.metacoding.testproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.service.HomeService;

@RequiredArgsConstructor
@Controller
public class HomeController {

    private final HomeService homeService;

    @GetMapping("/home/{homeId}")
    public String getHomeDetail(@PathVariable Integer homeId, Model model) {
        model.addAttribute("home", homeService.집상세보기(homeId));
        return "home/detail";
    }
}
