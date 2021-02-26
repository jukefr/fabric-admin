package org.jukefr.fabric_admin.dao;

import org.jukefr.fabric_admin.entity.Log;
import org.hibernate.HibernateException;

import java.util.List;

public interface LogDAO {

     Integer createLog(Log log) throws HibernateException;

     Log getLog(Integer id) throws HibernateException;

     List<Log> getLogs() throws HibernateException;

}
