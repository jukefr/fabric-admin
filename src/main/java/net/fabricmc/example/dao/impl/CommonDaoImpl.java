package net.fabricmc.example.dao.impl;

import net.fabricmc.example.config.HibernateConfig;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CommonDaoImpl {

    private final Session session;

    public CommonDaoImpl() {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        this.session = sessionFactory.getCurrentSession();
    }

    protected int saveEntity(Object obj) throws HibernateException {
        Transaction transaction = session.beginTransaction();
        int id = (Integer) session.save(obj);
        transaction.commit();
        return id;
    }
}
