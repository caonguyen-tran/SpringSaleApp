/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcn.formatter;

import org.springframework.format.Formatter;
import com.tcn.pojo.Category;
import java.text.ParseException;
import java.util.Locale;
/**
 *
 * @author ACER
 */
public class CategoryFormatter implements Formatter<Category>{

    @Override
    public String print(Category category, Locale locale) {
        return String.valueOf(category.getId());
    }

    @Override
    public Category parse(String id, Locale locale) throws ParseException {
        Category c = new Category();
        c.setId(Integer.parseInt(id));
        
        return c;
    }
    
}
