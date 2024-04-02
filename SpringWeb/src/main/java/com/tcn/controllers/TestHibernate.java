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
public class TestHibernate {
    public static void main(String[] args) {
        try(Session s = HibernateUtils.getFactory().openSession()){
            s.getTransaction().begin();
            
            Query q = s.createNamedQuery("Category.findAll");
            List<Category> cates = q.getResultList();
            cates.forEach(c -> System.out.println(c.getName()));
            
            s.getTransaction().commit();
        }
    }
}
