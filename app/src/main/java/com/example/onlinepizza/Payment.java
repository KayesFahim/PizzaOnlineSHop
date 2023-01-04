package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Payment extends AppCompatActivity {
    public class PaymentClass {
        int Id;
        public int OrderId;
        public String CardNumber;
        public int Amount;

        public PaymentClass() {
        }

        public PaymentClass(int id, int orderId, String cardNumber, int amount) {
            Id = id;
            OrderId = orderId;
            CardNumber = cardNumber;
            Amount = amount;
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

        public String getCardNumber() {
            return CardNumber;
        }

        public void setCardNumber(String cardNumber) {
            CardNumber = cardNumber;
        }

        public int getAmount() {
            return Amount;
        }

        public void setAmount(int amount) {
            Amount = amount;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public void SavePaymentOption(){

    }
    public void EditPaymentOption(){

    }
    public void ProceedPayment(){

    }



}