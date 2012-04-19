package com.hedgefunds.services;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class SessionFactoryUtil {
    public static SessionFactory sf = createSessionFactory();

    private static SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure(new File("bookstore/hibernate.cfg.xml"));
        return configuration.buildSessionFactory();
    }
}
