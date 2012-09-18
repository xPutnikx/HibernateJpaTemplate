package com.itransition.dao;

import java.util.List;

import com.itransition.HibernateUtil;
import com.itransition.model.Navision;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created with IntelliJ IDEA.
 * User: v.hudnitsky
 * Date: 17.09.12
 * Time: 18:59
 */
public class NavisionDao {

    public static List list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List employees = session.createQuery("from Navision").list();
        session.close();
        return employees;
    }
    public static Navision read(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Navision employee = (Navision) session.get(Navision.class, id);
        session.close();
        return employee;
    }
    public static Navision save(Navision employee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(employee);
        employee.setEmployeeId(id);
        session.getTransaction().commit();
        session.close();
        return employee;
    }

    public static Navision update(Navision employee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
        return employee;

    }

    public void delete(Navision employee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
    }
}
