package net.fabricmc.example.dao.impl;

import net.fabricmc.example.dao.LogDAO;
import net.fabricmc.example.entity.Log;
import org.hibernate.HibernateException;

import java.util.List;

public class LogDaoImpl extends CommonDaoImpl implements LogDAO {

    @Override
    public int createLog(Log log) throws HibernateException {
        return super.saveEntity(log);
    }

    @Override
    public Log getLog(int id) throws HibernateException {
        return null;
    }

    @Override
    public List<Log> listAllLogs() throws HibernateException {
        return null;
    }

}
