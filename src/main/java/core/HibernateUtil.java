package core; /**
* Created with IntelliJ IDEA.
* User: v.hudnitsky
* Date: 17.09.12
* Time: 18:57
* To change this template use File | Settings | File Templates.
*/
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationBinder;
import org.hibernate.cfg.AnnotationConfiguration;

import javax.persistence.PersistenceContext;

public class HibernateUtil {
    @PersistenceContext
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new AnnotationConfiguration().
                    configure("/hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

