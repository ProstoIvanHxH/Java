package sem2.n1.z3;

class BusinessCar implements Transport {
    @Override
    public String getSpecifications() {
        return "Комфортный салон, кожаные сиденья";
    }
}

class FamilyVan implements Transport {
    @Override
    public String getSpecifications() {
        return "Перевозка 6+ пассажиров";
    }
}

class Motorbike implements Transport {
    @Override
    public String getSpecifications() {
        return "Быстрая доставка";
    }
}