package site.metacoding.testproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.home.HomeDao;
import site.metacoding.testproject.domain.sub.Sub;
import site.metacoding.testproject.domain.sub.SubDao;
import site.metacoding.testproject.web.dto.response.home.DetailDto;

@RequiredArgsConstructor
@Service
public class HomeService {

    private final HomeDao homedao;
    private final SubDao subDao;

    public DetailDto 집상세보기(Integer homeId, Integer principalId) {
        return homedao.findByDetail(homeId, principalId);
    }

    public void 구독하기(Sub sub) {
        subDao.insert(sub);
    }

    public void 구독취소하기(Integer subId) {
        homedao.delete(subId);
    }

}
