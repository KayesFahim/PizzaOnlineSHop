package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Order extends AppCompatActivity {
    public static class OrderClass {
        int Id;
        public int PizzaId;
        public int PizzaSize;
        public String DeliveType;
        public String PaymentType;
        public String Status;

        public OrderClass() {
        }

        public OrderClass(int id, int pizzaId, int pizzaSize, String deliveType, String paymentType, String status) {
            Id = id;
            PizzaId = pizzaId;
            PizzaSize = pizzaSize;
            DeliveType = deliveType;
            PaymentType = paymentType;
            Status = status;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public int getPizzaId() {
            return PizzaId;
        }

        public void setPizzaId(int pizzaId) {
            PizzaId = pizzaId;
        }

        public int getPizzaSize() {
            return PizzaSize;
        }

        public void setPizzaSize(int pizzaSize) {
            PizzaSize = pizzaSize;
        }

        public String getDeliveType() {
            return DeliveType;
        }

        public void setDeliveType(String deliveType) {
            DeliveType = deliveType;
        }

        public String getPaymentType() {
            return PaymentType;
        }

        public void setPaymentType(String paymentType) {
            PaymentType = paymentType;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void PlaceOrder(){

    }

    public void UpdateOrder(){

    }

    public void ViewOrder(){

    }

    public void DeliveryOn(){

    }
}