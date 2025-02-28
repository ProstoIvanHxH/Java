package sem2.n1.z3;

public class Main {
    public static void main(String[] args) {
        try {
            // Создаем транспорт для деловой поездки
            Transport businessCar = TransportFactory.createTransport("business");
            System.out.println("Деловая поездка: " + businessCar.getSpecifications());

            // Создаем транспорт для семейного отдыха
            Transport familyVan = TransportFactory.createTransport("family");
            System.out.println("Семейный отдых: " + familyVan.getSpecifications());

            // Создаем транспорт для экспресс-доставки
            Transport motorbike = TransportFactory.createTransport("delivery");
            System.out.println("Экспресс-доставка: " + motorbike.getSpecifications());

            // Попытка создать транспорт с неизвестным типом
            Transport unknown = TransportFactory.createTransport("unknown");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
