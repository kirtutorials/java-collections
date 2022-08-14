package collection;

import java.util.List;

public class Room {
    private int number;
    private String type;
    private double price;
    private int capacity;

    public Room(int number, String type, double price, int capacity) {
        this.number = number;
        this.type = type;
        this.price = price;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
