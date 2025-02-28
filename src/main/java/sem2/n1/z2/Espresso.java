package sem2.n1.z2;

class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 2.5; // Цена базового кофе
    }

    @Override
    public String getDescription() {
        return "Эспрессо";
    }

    @Override
    public int getCalories() {
        return 5; // Калорийность базового кофе
    }
}
