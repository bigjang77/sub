package site.metacoding.testproject.domain.home;

import java.util.List;

public interface HomeDao {
    public void insert(Home home);

    public Home findById(Integer homeId);

    public List<Home> findAll();

    public void update(Home home);

    public void delete(Integer homeId);
}
