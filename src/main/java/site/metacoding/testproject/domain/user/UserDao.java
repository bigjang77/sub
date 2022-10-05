package site.metacoding.testproject.domain.user;

import java.util.List;

public interface UserDao {
    public void insert(User user);

    public User findById(Integer id);

    public List<User> findAll();

    public void update(User user);

    public void delete(Integer id);
}
