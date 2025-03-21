package sem2.n1.z3;

class TransportFactory {
    public static Transport createTransport(String tripType) throws IllegalArgumentException {
        switch (tripType.toLowerCase()) {
            case "business":
                return new BusinessCar();
            case "family":
                return new FamilyVan();
            case "delivery":
                return new Motorbike();
            default:
                throw new IllegalArgumentException("Неизвестный тип транспорта: " + tripType);
        }
    }
}