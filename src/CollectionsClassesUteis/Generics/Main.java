package CollectionsClassesUteis.Generics;

import CollectionsClassesUteis.Generics.dao.ClientDAO;
import CollectionsClassesUteis.Generics.dao.GenericDAO;
import CollectionsClassesUteis.Generics.dao.UserDAO;
import CollectionsClassesUteis.Generics.domain.ClientDomain;
import CollectionsClassesUteis.Generics.domain.UserDomain;

import java.util.function.Predicate;

public class Main {

    private static final GenericDAO<Integer, UserDomain> userDao = new UserDAO();
    private static final GenericDAO<String, ClientDomain> clientDao = new ClientDAO();

    public static void main(String[] args){
        var user = new UserDomain(1, "Jonas", 24);
        System.out.println(userDao.count());
        System.out.println(userDao.save(1, user));
        System.out.println(userDao.findAll());
        System.out.println(userDao.find(d -> d.getId().equals(1)));
        System.out.println(userDao.find(d -> d.getId().equals(4)));
        System.out.println(userDao.count());
        System.out.println(userDao.delete(new UserDomain(-1, "dawd", -2)));
        System.out.println(userDao.delete(user));
        System.out.println(userDao.findAll());
        System.out.println(userDao.count());

        System.out.println("\n====================\n");

        var client = new ClientDomain("A", "Jonas", 24);
        System.out.println(clientDao.count());
        System.out.println(clientDao.save(1, client));
        System.out.println(clientDao.findAll());
        System.out.println(clientDao.find(d -> d.getId().equals("A")));
        System.out.println(clientDao.find(d -> d.getId().equals("4")));
        System.out.println(clientDao.count());
        System.out.println(clientDao.delete(new ClientDomain("-1", "dawd", -2)));
        System.out.println(clientDao.delete(client));
        System.out.println(clientDao.findAll());
        System.out.println(clientDao.count());

    }
}
