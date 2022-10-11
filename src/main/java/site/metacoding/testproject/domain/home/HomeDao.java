package site.metacoding.testproject.domain.home;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import site.metacoding.testproject.web.dto.response.home.DetailDto;

public interface HomeDao {
    public void insert(Home home);

    public Home findById(Integer homeId);

    public List<Home> findAll();

    public void update(Home home);

    public void delete(Integer homeId);

    public DetailDto findByDetail(@Param("homeId") Integer homeId, @Param("principalId") Integer principalId);
}
