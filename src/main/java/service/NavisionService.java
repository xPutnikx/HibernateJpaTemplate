package service;

import dao.NavisionDao;
import model.Navision;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Putnik
 * Date: 19.09.12
 * Time: 0:18
 * To change this template use File | Settings | File Templates.
 */
public class NavisionService {
    public static List<Navision> getList(){
        return NavisionDao.list();
    }
    public static Navision readList(Long id){
        return NavisionDao.read(id);
    }
}
