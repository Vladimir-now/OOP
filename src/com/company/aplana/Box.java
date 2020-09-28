package com.company.aplana;

import com.company.aplana.Sweets.Sweet;

import java.util.ArrayList;
import java.util.List;

public class Box implements ActionOnTheBox {

    private double weight;
    private double price;
    private List<Sweet> sweets = new ArrayList<>();


    @Override
    public void add(Sweet sweet) {
        sweets.add(sweet);
    }

    @Override
    public void delete(int index) {
        sweets.remove(index);
    }

    @Override
    public void deleteLast() {
        sweets.remove(sweets.size()-1);
    }

    @Override
    public void infoWeightBox() {
        weight = 0;
        for (Sweet s : sweets) {
            weight += s.getWeight();
        }
        System.out.println( weight + " кг.");
    }

    @Override
    public void infoPrice() {
        price = 0;
        for (Sweet s : sweets) {
            price += s.getPrice();
        }
        System.out.println(price + " рублей.");

    }

    @Override
    public void infoSweets() {
        for (Sweet s : sweets) {
            System.out.println(s.getName() + " вес: " + s.getWeight() + " кг, стоит: " + s.getPrice() + " рублей, вид: " + s.getType());
        }

    }
}
