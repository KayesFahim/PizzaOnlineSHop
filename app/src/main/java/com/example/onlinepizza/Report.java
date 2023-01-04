package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Report extends AppCompatActivity {
    public static class ReportClass {
        int Id;
        public int CustomerId;
        public int OrderId;
        public int PaymentId;

        public ReportClass() {
        }

        public ReportClass(int id, int customerId, int orderId, int paymentId) {
            Id = id;
            CustomerId = customerId;
            OrderId = orderId;
            PaymentId = paymentId;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public int getCustomerId() {
            return CustomerId;
        }

        public void setCustomerId(int customerId) {
            CustomerId = customerId;
        }

        public int getOrderId() {
            return OrderId;
        }

        public void setOrderId(int orderId) {
            OrderId = orderId;
        }

        public int getPaymentId() {
            return PaymentId;
        }

        public void setPaymentId(int paymentId) {
            PaymentId = paymentId;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }

    public void AddRePort(){

    }

    public void ViewReport(){

    }
    public void DownloadReport(){

    }
}