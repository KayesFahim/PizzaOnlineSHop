package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DeliveryMan extends AppCompatActivity {
    public class DeliveryManClass {
        int Id;
        public String Name;
        public String Phone;
        public String DeliveryVehicle;

        public DeliveryManClass() {
        }

        public DeliveryManClass(int id, String name, String phone, String deliveryVehicle) {
            Id = id;
            Name = name;
            Phone = phone;
            DeliveryVehicle = deliveryVehicle;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getPhone() {
            return Phone;
        }

        public void setPhone(String phone) {
            Phone = phone;
        }

        public String getDeliveryVehicle() {
            return DeliveryVehicle;
        }

        public void setDeliveryVehicle(String deliveryVehicle) {
            DeliveryVehicle = deliveryVehicle;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_man);
    }

    public void Add(){

    }

    public void Edit(){

    }

    public void Delete(){

    }
}