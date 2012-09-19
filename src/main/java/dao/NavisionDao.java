package dao;

import java.util.List;

import core.HibernateUtil;
import model.Navision;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: v.hudnitsky
 * Date: 17.09.12
 * Time: 18:59
 */
@Repository
public class NavisionDao {
    @Transactional
    public static List list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List employees = session.createQuery("from Navision").list();
        session.close();
        return employees;
    }
    @Transactional
    public static Navision read(Long id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Navision employee = (Navision) session.get(Navision.class, id);
        session.close();
        return employee;
    }
}
