package org.knit.lab5.n8;

class ShopItem {
    private String name;
    private int price;
    private String category;

    public ShopItem(String name, int price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }


    @Override
    public String toString() {
        return "ShopItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopItem shopItem = (ShopItem) o;

        if (price != shopItem.price) return false;
        if (!name.equals(shopItem.name)) return false;
        return category.equals(shopItem.category);
    }

    // Переопределение метода hashCode
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price;
        result = 31 * result + category.hashCode();
        return result;
    }
}