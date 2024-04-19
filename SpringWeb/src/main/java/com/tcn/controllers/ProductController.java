/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcn.controllers;

import com.tcn.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.tcn.pojo.Product;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author ACER
 */
@Controller
public class ProductController {

    @Autowired
    private ProductService prodService;

    @GetMapping("/products")
    public String createView(Model model) {
        model.addAttribute("product", new Product());
        return "products";
    }

    @PostMapping("/products")
    public String createProduct(@ModelAttribute(value = "product") @Valid Product p, BindingResult rs) {
        if (!rs.hasErrors()) {
            try {
                this.prodService.addOrUpdate(p);
                return "redirect:/";
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return "products";
    }
}
