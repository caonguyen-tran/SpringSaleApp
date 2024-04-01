/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcn.controllers;

import com.tcn.pojo.Category;
import com.tcn.utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author ACER
 */
public class TestController {
    public static void main(String[] args) {
        try(Session session = HibernateUtils.getSessionFactory().openSession()){
            session.getTransaction().begin();
            
            Query query = session.createNamedQuery("Category.findAll");
            
            List<Category> cates = query.getResultList();
            
            cates.forEach(c -> System.out.println(c.getName()));
            session.getTransaction().commit();
        }
    }
}
