package org.jukefr.fabric_admin.dao.impl;

import org.jukefr.fabric_admin.dao.LogDAO;
import org.jukefr.fabric_admin.entity.Log;
import org.hibernate.HibernateException;

import java.util.List;

public class LogDaoImpl extends CommonDaoImpl implements LogDAO {

    @Override
    public Integer createLog(Log log) throws HibernateException {
        return super.saveEntity(log);
    }

    @Override
    public Log getLog(Integer id) throws HibernateException {
        return null;
    }

    @Override
    public List<Log> listAllLogs() throws HibernateException {
        return null;
    }

}
