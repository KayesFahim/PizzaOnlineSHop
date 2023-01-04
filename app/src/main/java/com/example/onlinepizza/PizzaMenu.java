package com.example.onlinepizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PizzaMenu extends AppCompatActivity {

    public static class PizzaMenuClass {
        int Id;
        public String Name;
        public String Category;
        public String SubCategory;
        public int Price;

        public PizzaMenuClass() {
        }

        public PizzaMenuClass(int id, String name, String category, String subCategory, int price) {
            Id = id;
            Name = name;
            Category = category;
            SubCategory = subCategory;
            Price = price;
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

        public String getCategory() {
            return Category;
        }

        public void setCategory(String category) {
            Category = category;
        }

        public String getSubCategory() {
            return SubCategory;
        }

        public void setSubCategory(String subCategory) {
            SubCategory = subCategory;
        }

        public int getPrice() {
            return Price;
        }

        public void setPrice(int price) {
            Price = price;
        }


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);
    }

    public void Add(){

    }
    public void Edit(){

    }

    public void View(){

    }
    public void SelectForOrder(){

    }
}