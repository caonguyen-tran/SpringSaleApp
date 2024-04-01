/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcn.utils;

import com.tcn.pojo.Category;
import com.tcn.pojo.Comment;
import com.tcn.pojo.OrderDetail;
import com.tcn.pojo.ProdTag;
import com.tcn.pojo.Product;
import com.tcn.pojo.SaleOrder;
import com.tcn.pojo.Tag;
import com.tcn.pojo.User;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author ACER
 */
public class HibernateUtils {

    private static final SessionFactory FACTORY;

    static {
        Configuration config = new Configuration();
        Properties props = new Properties();

        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        props.put(Environment.URL, "jdbc:mysql://localhost/saledb");
        props.put(Environment.USER, "root");
        props.put(Environment.PASS, "Admin@123");
        props.put(Environment.SHOW_SQL, "true");

        config.setProperties(props);
        config.addAnnotatedClass(Category.class);
        config.addAnnotatedClass(Product.class);
        config.addAnnotatedClass(OrderDetail.class);
        config.addAnnotatedClass(Comment.class);
        config.addAnnotatedClass(ProdTag.class);
        config.addAnnotatedClass(SaleOrder.class);
        config.addAnnotatedClass(Tag.class);
        config.addAnnotatedClass(User.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

        FACTORY = config.buildSessionFactory(registry);
    }

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    }
}
