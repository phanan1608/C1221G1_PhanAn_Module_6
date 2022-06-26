package com.c1221g1.pharmacy.entity.cart;

import com.c1221g1.pharmacy.entity.customer.Customer;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;
    @Column(columnDefinition = "BIT")
    private boolean cartStatus;
    @Column(columnDefinition = "DATE")
    private String dateCreate;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    private Customer customer;
    @OneToMany(mappedBy = "cart")
    private List<PaymentOnline> paymentOnlineList;
    @OneToMany(mappedBy = "cart")
    private List<CartDetail> cartDetailList;

    public Cart() {
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public boolean isCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(boolean cartStatus) {
        this.cartStatus = cartStatus;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<PaymentOnline> getPaymentOnlineList() {
        return paymentOnlineList;
    }

    public void setPaymentOnlineList(List<PaymentOnline> paymentOnlineList) {
        this.paymentOnlineList = paymentOnlineList;
    }

    public List<CartDetail> getCartDetailList() {
        return cartDetailList;
    }

    public void setCartDetailList(List<CartDetail> cartDetailList) {
        this.cartDetailList = cartDetailList;
    }
}
