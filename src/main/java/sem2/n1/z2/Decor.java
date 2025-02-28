package sem2.n1.z2;

class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // Добавляем цену молока
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 50; // Добавляем калорийность молока
    }
}

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75; // Добавляем цену карамели
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", карамель";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 60; // Добавляем калорийность карамели
    }
}

class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0; // Добавляем цену шоколада
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", шоколад";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 80; // Добавляем калорийность шоколада
    }
}

class SizeDecorator extends CoffeeDecorator {
    private String size;

    public SizeDecorator(Coffee coffee, String size) {
        super(coffee);
        this.size = size.toUpperCase();
    }

    @Override
    public double getCost() {
        double cost = super.getCost();
        switch (size) {
            case "SMALL":
                return cost;
            case "MEDIUM":
                return cost + 0.5;
            case "LARGE":
                return cost + 1.0;
            default:
                return cost;
        }
    }

    @Override
    public String getDescription() {
        return size + " " + super.getDescription();
    }

    @Override
    public int getCalories() {
        int calories = super.getCalories();
        switch (size) {
            case "SMALL":
                return calories;
            case "MEDIUM":
                return calories + 20;
            case "LARGE":
                return calories + 40;
            default:
                return calories;
        }
    }
}