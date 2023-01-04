package com.example.onlinepizza;

public class DeliveryClass {
    int Id;
    public int OrderId;
    public String Address;

    public DeliveryClass() {
    }

    public DeliveryClass(int id, int orderId, String address) {
        Id = id;
        OrderId = orderId;
        Address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
