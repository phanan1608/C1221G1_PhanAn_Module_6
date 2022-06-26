package com.c1221g1.pharmacy.entity.customer;

import com.c1221g1.pharmacy.entity.cart.Cart;
import com.c1221g1.pharmacy.entity.user.Users;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String customerId;
    private String customerName;
    @Column(columnDefinition = "DATE")
    private String customerBirthday;
    private String customerAddress;
    private String customerPhone;
    private String customerNote;
    @Column(columnDefinition = "BIT")
    private boolean flag;

    @OneToOne
    @JoinColumn(name = "customer_username", referencedColumnName = "username")
    private Users customerUsername ;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "customerTypeId")
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private List<Cart> cartList;


    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public void setCustomerNote(String customerNote) {
        this.customerNote = customerNote;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Users getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(Users customerUsername) {
        this.customerUsername = customerUsername;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }
}