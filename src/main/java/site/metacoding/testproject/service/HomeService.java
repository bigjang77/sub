package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.home.Home;
import site.metacoding.testproject.domain.home.HomeDao;

@RequiredArgsConstructor
@Service
public class HomeService {

    private final HomeDao homedao;

    public Home 집상세보기(Integer homeId) {
        return homedao.findById(homeId);
    }
}
