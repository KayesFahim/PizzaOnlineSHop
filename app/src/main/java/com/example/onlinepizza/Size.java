package com.example.onlinepizza;

public class Size {
    int Id;
    public int PizzaSize;

    public Size() {
    }

    public Size(int id, int pizzaSize) {
        Id = id;
        PizzaSize = pizzaSize;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPizzaSize() {
        return PizzaSize;
    }

    public void setPizzaSize(int pizzaSize) {
        PizzaSize = pizzaSize;
    }
}
