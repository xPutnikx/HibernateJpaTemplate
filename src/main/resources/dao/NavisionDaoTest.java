package dao;

/**
 * Created with IntelliJ IDEA.
 * User: Putnik
 * Date: 18.09.12
 * Time: 18:01
 * To change this template use File | Settings | File Templates.
 */
import core.HibernateUtil;
import junit.framework.TestCase;
import model.Navision;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import service.NavisionService;

import java.util.List;

public class NavisionDaoTest extends TestCase {
        public static final Log logger =  LogFactory.getLog(NavisionDaoTest.class
                .getName());
    @Autowired
    public NavisionDao navisionDao;

        @Override
        protected void setUp() throws Exception {
            super.setUp();

        }

        @Override
        protected void tearDown() throws Exception {
            super.tearDown();
        }
    public void testList() throws Exception {
        List<Navision> nav= NavisionService.getList();
        try{
        Navision navision=NavisionService.readList(new Long(1));
        System.out.println(navision.getEmployeeId());
        }
        catch (NullPointerException ex){
            ex.getMessage();
        }
        assertNotNull(nav);
    }

    public void testRead() throws Exception {

    }

    public void testSave() throws Exception {

    }

    public void testUpdate() throws Exception {

    }

    public void testDelete() throws Exception {

    }
}
