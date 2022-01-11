package session001;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import session001.Student;


/**
 * Created by Mahdie Montazeralzohoor on 1/11/2022 10:12 AM
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("mahdie");
        student.setFamily("montazeralzohoor");
        student.setId(1);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        Student student1 = session.get(Student.class, 1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println(student);
        System.out.println("hello");
    }
}
