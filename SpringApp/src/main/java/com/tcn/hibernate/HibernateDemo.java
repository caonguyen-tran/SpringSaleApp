package com.tcn.hibernate;

import com.tcn.pojo.Category;
import jakarta.persistence.Query;
import org.hibernate.Session;

import java.util.List;

public class HibernateDemo {
    public static void main(String[] args) {
        try(Session session = HibernateUtils.getFactory().openSession()){
            Query q = session.createQuery("FROM Category", Category.class);
            List<Category> cates = q.getResultList();

            cates.forEach(cate -> System.out.println(cate.getName()));
        }
    }
}
