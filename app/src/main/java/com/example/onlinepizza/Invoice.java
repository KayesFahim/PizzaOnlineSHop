package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Invoice extends AppCompatActivity {

    public static class InvoiceClass {
        int Id;
        public int PaymentId;
        public int OrderId;
        public int Amount;
        public int PaymentBy;
        public int DiscountAmount;

        public InvoiceClass() {
        }

        public InvoiceClass(int id, int paymentId, int orderId, int amount, int paymentBy, int discountAmount) {
            Id = id;
            PaymentId = paymentId;
            OrderId = orderId;
            Amount = amount;
            PaymentBy = paymentBy;
            DiscountAmount = discountAmount;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public int getPaymentId() {
            return PaymentId;
        }

        public void setPaymentId(int paymentId) {
            PaymentId = paymentId;
        }

        public int getOrderId() {
            return OrderId;
        }

        public void setOrderId(int orderId) {
            OrderId = orderId;
        }

        public int getAmount() {
            return Amount;
        }

        public void setAmount(int amount) {
            Amount = amount;
        }

        public int getPaymentBy() {
            return PaymentBy;
        }

        public void setPaymentBy(int paymentBy) {
            PaymentBy = paymentBy;
        }

        public int getDiscountAmount() {
            return DiscountAmount;
        }

        public void setDiscountAmount(int discountAmount) {
            DiscountAmount = discountAmount;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);
    }

    public void ViewInvoice(){

    }
    public void DownloadInvoice(){

    }
}