import com.hedgefunds.services.SessionFactoryUtil;
import org.hibernate.SessionFactory;

public class Bookstore {
    private static SessionFactoryUtil sessionFactoryUtil;

    public static void main(String[] args) {
        SessionFactory sf = SessionFactoryUtil.sf;
        System.out.println("Bookstore...");
    }
}
