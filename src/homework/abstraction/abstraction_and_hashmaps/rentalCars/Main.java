package homework.abstraction.abstraction_and_hashmaps.rentalCars;

public class Main {
    public static void main(String[] args) {
        Car Honda = new EconomyCar("E001", "Honda", "Accord", 10, true);
        Car lexus = new LuxuryCar("L001", "Lexus", "LS400", 50, true);
        CarRentalService RentalService = new CarRentalService();

        RentalService.addCar("1", Honda);
        RentalService.addCar("2", lexus);

        RentalService.displayAvailableCars();

        RentalService.rentCar("1", 5);

    }
}
