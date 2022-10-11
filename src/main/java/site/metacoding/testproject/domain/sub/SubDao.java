package site.metacoding.testproject.domain.sub;

import java.util.List;

public interface SubDao {
    public void insert(Sub sub);

    public Sub findById(Integer subId);

    public List<Sub> findAll();

    public void update(Sub sub);

    public void deleteById(Integer subId);
}
