package web.servise;

import org.springframework.transaction.annotation.Transactional;
import web.entity.User;

import java.util.List;

public interface UserServise {

    void add(User user);

    void delete(int id);

    User show(int id);

    void update(int id, User updateUser);

    @Transactional(readOnly = true)
    List<User> listUsers();
}
