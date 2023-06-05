package web.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
@Repository
@PersistenceContext
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    @Override
    public User show(int id) {
        User user = entityManager.find(User.class, id);
        return user;

    }

    @Override
    public void update(int id, User updateUser) {
        User userToBeUpdate = entityManager.find(User.class, id);
        userToBeUpdate.setName(updateUser.getName());
        userToBeUpdate.setLastName(updateUser.getLastName());
        userToBeUpdate.setAge(updateUser.getAge());
        userToBeUpdate.setEmail(updateUser.getEmail());
        userToBeUpdate.setSity(updateUser.getSity());
        entityManager.merge(userToBeUpdate);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> listUsers() {
        TypedQuery<User> query = entityManager.unwrap(Session.class).createQuery("from User");
        return query.getResultList();
    }
}

