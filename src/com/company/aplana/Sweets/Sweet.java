package com.company.aplana.Sweets;

public abstract class Sweet {

    private String name;
    private float weight;
    private float price;
    private String type;

    public Sweet(String name, float weight, float price, String type) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
