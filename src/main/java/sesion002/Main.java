package sesion002;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import session001.Student;

/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 8:12 PM
 */
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        /*session.save();*/
        transaction.commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        Student student1 = session.get(Student.class, 1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
