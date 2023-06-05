package web.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImpl;
import web.entity.User;

import java.util.List;

@Component
@Service
public class UserServiseImpl implements UserServise {
    private final UserDaoImpl userDao;

    @Autowired
    public UserServiseImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public User show(int id) {
        return userDao.show(id);
    }

    @Transactional
    @Override
    public void update(int id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
