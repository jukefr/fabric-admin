package org.jukefr.fabric_admin.dao.impl;

import org.jukefr.fabric_admin.config.HibernateConfig;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class CommonDaoImpl {

    private final Session session;

    public CommonDaoImpl() {
        SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        this.session = sessionFactory.openSession();
    }

    protected Integer saveEntity(Object obj) throws HibernateException {
        Transaction transaction = session.beginTransaction();
        Integer id = (Integer) session.save(obj);
        transaction.commit();
        return id;
    }

    protected Object getEntity(Class type, Integer id) throws  HibernateException {
        return session.get(type, id);
    }

    protected <T> List<T> getEntities(Class<T> type) throws  HibernateException {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> criteria = builder.createQuery(type);
        criteria.from(type);
        return session.createQuery(criteria).getResultList();
    }
}
