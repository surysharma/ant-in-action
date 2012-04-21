import com.hedgefunds.services.SessionFactoryUtil;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public class Bookstore {
    private static SessionFactoryUtil sessionFactoryUtil;

    public static void main(String[] args) {
        SessionFactory sf = SessionFactoryUtil.sf;
        Session session = sf.openSession();
        session.beginTransaction();
        session.getTransaction().commit();
        System.out.println("Bookstore...");
    }
}
