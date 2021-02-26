package net.fabricmc.example.dao;

import net.fabricmc.example.entity.Log;
import org.hibernate.HibernateException;

import java.util.List;

public interface LogDAO {

    int createLog(Log log) throws HibernateException;

     Log getLog(int id) throws HibernateException;

     List<Log> listAllLogs() throws HibernateException;

}
