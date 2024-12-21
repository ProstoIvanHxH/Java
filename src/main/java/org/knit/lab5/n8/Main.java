package org.knit.lab5.n8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] names = {"книга", "ручка", "линейка", "пинал"};
        String[] categories = {"Канцелярия", "Книги", "Школьные принадлежности"};
        Random random = new Random();

        ShopItem[] items = new ShopItem[100];
        for (int i = 0; i < items.length; i++) {
            String name = names[random.nextInt(names.length)];

            int price = 10 + random.nextInt(10) * 10;
            String category = categories[random.nextInt(categories.length)];
            items[i] = new ShopItem(name, price, category);
        }

        Arrays.sort(items, Comparator.comparingInt(ShopItem::getPrice));

        System.out.println("Отсортированные товарные позиции:");
        for (ShopItem item : items) {
            System.out.println(item);
        }

        Map<ShopItem, Integer> countMap = new HashMap<>();
        for (ShopItem item : items) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }


        System.out.println("\nКоличество одинаковых товарных позиций:");
        int totalDuplicates = 0;
        for (Map.Entry<ShopItem, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " шт.");
                totalDuplicates += entry.getValue();
            }
        }
        System.out.println("Всего одинаковых товарных позиций: " + totalDuplicates);
    }
}