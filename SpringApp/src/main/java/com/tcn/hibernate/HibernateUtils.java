package com.tcn.hibernate;

import com.tcn.pojo.Category;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtils {
    private static final SessionFactory factory;

    static {
        Configuration conf = new Configuration();
        conf.configure("hibernate.config.xml");
//        Properties props = new Properties();
//        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//        props.put(Environment.URL, "jdbc:mysql://localhost/sale_db");
//        props.put(Environment.USER, "root");
//        props.put(Environment.PASS, "Admin@123");
//        props.put(Environment.SHOW_SQL, "true");
//        conf.setProperties(props);

        conf.addAnnotatedClass(Category.class);
        ServiceRegistry register = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(register);
    }

    public static SessionFactory getFactory(){
        return factory;
    }
}
