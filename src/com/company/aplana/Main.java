package com.company.aplana;

import com.company.aplana.Sweets.Candy;
import com.company.aplana.Sweets.Cookie;
import com.company.aplana.Sweets.Sweet;
import com.company.aplana.Sweets.Waffle;

public class Main {

    public static void main(String[] args) {
        ActionOnTheBox boxSweets = new Box();

        Sweet candy1 = new Candy("Лапки-царапки", 1.2f, 255.5f, "Шоколадная");
        Candy candy2 = new Candy("Озерки", 4.2f, 544.0f, "Шоколадная со сливочной начинкой");
        Sweet cookie = new Cookie("Орео", 3.0f, 350.9f, "Клубничная");
        Sweet waffle = new Waffle("Дежавю", 2.5f, 121.4f, "С лесным орехом");

        boxSweets.add(candy1);
        boxSweets.add(candy2);
        boxSweets.add(cookie);
        boxSweets.add(waffle);

        boxSweets.infoPrice();
        boxSweets.infoWeightBox();
        boxSweets.infoSweets();
        System.out.println("--------------------------");

        boxSweets.delete(3);
        boxSweets.infoSweets();
        System.out.println("--------------------------");

        boxSweets.deleteLast();
        boxSweets.infoSweets();



    }
}
