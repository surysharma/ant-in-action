import com.hedgefunds.domain.Event;
import com.hedgefunds.services.SessionFactoryUtil;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import java.util.Date;

public class Bookstore {
    private static SessionFactoryUtil sessionFactoryUtil;

    public static void main(String[] args) {
        SessionFactory sf = SessionFactoryUtil.sf;
        Session session = sf.getCurrentSession();
        session.beginTransaction();
        Event event = Event.getEvent("event1", new Date());
        session.save(event);
        session.getTransaction().commit();
        System.out.println("Bookstore...");
    }
}
