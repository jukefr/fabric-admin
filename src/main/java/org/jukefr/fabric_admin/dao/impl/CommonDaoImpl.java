package org.jukefr.fabric_admin.dao.impl;

import org.jukefr.fabric_admin.config.HibernateConfig;
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

    protected Integer saveEntity(Object obj) throws HibernateException {
        Transaction transaction = session.beginTransaction();
        Integer id = (Integer) session.save(obj);
        transaction.commit();
        return id;
    }
}
