package com.hedgefunds.services;


import com.hedgefunds.domain.Event;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
    public static SessionFactory sf = createSessionFactory();

    private static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Event.class);
        return configuration.buildSessionFactory();
    }
}
