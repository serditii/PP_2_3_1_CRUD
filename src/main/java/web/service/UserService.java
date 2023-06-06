package web.service;

import web.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(int id);

    User showUser(int id);

    void updateUser(int id, User updateUser);

    List<User> getListUsers();
}
