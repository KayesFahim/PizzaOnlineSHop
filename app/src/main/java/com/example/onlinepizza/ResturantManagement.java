package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ResturantManagement extends AppCompatActivity {
    public class ResturantManagementClass {
        int Id;
        public int OrderId;
        public String ApprovedBy;

        public ResturantManagementClass() {
        }

        public ResturantManagementClass(int id, int orderId, String approvedBy) {
            Id = id;
            OrderId = orderId;
            ApprovedBy = approvedBy;
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

        public String getApprovedBy() {
            return ApprovedBy;
        }

        public void setApprovedBy(String approvedBy) {
            ApprovedBy = approvedBy;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant_management);
    }

    public void ManageMenu(){

    }
    public void OrderManage(){

    }
    public void ProcessOrder(){

    }
    public void OrderHistory(){

    }

}