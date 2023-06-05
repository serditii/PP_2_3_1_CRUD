package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {


    void add(User user);

    void delete(int id);

    User show(int id);

    void update(int id, User updateUser);

    @SuppressWarnings("unchecked")
    List<User> listUsers();
}
