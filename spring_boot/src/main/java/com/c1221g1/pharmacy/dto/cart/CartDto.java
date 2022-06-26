package com.c1221g1.pharmacy.dto.cart;

import com.c1221g1.pharmacy.entity.cart.CartDetail;
import com.c1221g1.pharmacy.entity.cart.PaymentOnline;
import com.c1221g1.pharmacy.entity.customer.Customer;

import java.util.List;

public class CartDto {
    private Integer cartId;
    private boolean cartStatus;
    private String dateCreate;
    private Customer customer;
    private List<PaymentOnline> paymentOnlineList;
    private List<CartDetail> cartDetailList;

    public CartDto() {
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
