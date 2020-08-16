package DAO;

import hibernateUtil.Hibernate;
import model.Human;

import java.util.List;

public class HumanDAO implements IDAO<Human>{
    @Override
    public Human getById(int id) {
        return Hibernate.getSessionFactory().openSession().get(Human.class, id);
    }

    @Override
    public List<Human> getAll() {
        return Hibernate.getSessionFactory().openSession().createQuery("From Human").list();
    }
}
