package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Date;

public class User extends AppCompatActivity {
    public class UserClass {
        int Id;
        private String Email;
        private String Password;
        private String Name;
        private String Phone;
        private int Age;
        private String Address;
        private Date JoinAt;

        public UserClass() {
        }

        public UserClass(int id, String email, String password, String name, String phone, int age, String address, Date joinAt) {
            Id = id;
            Email = email;
            Password = password;
            Name = name;
            Phone = phone;
            Age = age;
            Address = address;
            JoinAt = joinAt;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword(String password) {
            Password = password;
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

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public Date getJoinAt() {
            return JoinAt;
        }

        public void setJoinAt(Date joinAt) {
            JoinAt = joinAt;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

    }

    public void SignUp(){

    }

    public void SignIn(){

    }

    public void ForgotPassword(){

    }
}