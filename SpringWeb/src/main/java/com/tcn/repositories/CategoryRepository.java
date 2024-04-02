/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcn.repositories;

import com.tcn.pojo.Category;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface CategoryRepository {
    
    List<Category> getCategories();
}
