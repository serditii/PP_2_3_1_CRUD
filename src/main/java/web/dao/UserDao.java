package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {


    void addUser(User user);

    void deleteUser(int id);

    User showUser(int id);

    void updateUser(int id, User updateUser);

    @SuppressWarnings("unchecked")
    List<User> getListUsers();
}
