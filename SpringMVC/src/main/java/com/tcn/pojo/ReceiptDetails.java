/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tcn.pojo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ACER
 */
@Entity
@Table(name = "receipt_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReceiptDetails.findAll", query = "SELECT r FROM ReceiptDetails r"),
    @NamedQuery(name = "ReceiptDetails.findByQuantity", query = "SELECT r FROM ReceiptDetails r WHERE r.quantity = :quantity"),
    @NamedQuery(name = "ReceiptDetails.findByPrice", query = "SELECT r FROM ReceiptDetails r WHERE r.price = :price"),
    @NamedQuery(name = "ReceiptDetails.findById", query = "SELECT r FROM ReceiptDetails r WHERE r.id = :id"),
    @NamedQuery(name = "ReceiptDetails.findByCreatedDate", query = "SELECT r FROM ReceiptDetails r WHERE r.createdDate = :createdDate"),
    @NamedQuery(name = "ReceiptDetails.findByActive", query = "SELECT r FROM ReceiptDetails r WHERE r.active = :active")})
public class ReceiptDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "quantity")
    private Integer quantity;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Float price;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "created_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "active")
    private Boolean active;
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product productId;
    @JoinColumn(name = "receipt_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Receipt receiptId;

    public ReceiptDetails() {
    }

    public ReceiptDetails(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Receipt getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Receipt receiptId) {
        this.receiptId = receiptId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReceiptDetails)) {
            return false;
        }
        ReceiptDetails other = (ReceiptDetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tcn.pojo.ReceiptDetails[ id=" + id + " ]";
    }
    
}
