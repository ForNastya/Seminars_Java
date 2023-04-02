package Seminar_6;

import java.util.Objects;

public class Laptop {
    private String model;
    private String display;
    private Integer RAM;
    private String OS;
    private String color;
    private Double price;

    public Laptop(String model, String display, Integer RAM, String OS, String color, Double price) {
        this.model = model;
        this.display = display;
        this.RAM = RAM;
        this.OS = OS;
        this.color = color;
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(model, laptop.model) && Objects.equals(display, laptop.display) && Objects.equals(RAM, laptop.RAM) && Objects.equals(OS, laptop.OS) && Objects.equals(color, laptop.color) && Objects.equals(price, laptop.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, display, RAM, OS, color, price);

    }

    @Override
    public String toString() {
        return "Laptop-" +
                "model='" + model + '\'' +
                ", display='" + display + '\'' +
                ", RAM=" + RAM +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '.';
    }

    public boolean printInfo() {
        System.out.println(this);
        return true;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}