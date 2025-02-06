package homework.abstraction.abstraction_and_hashmaps.rentalCars;

import java.util.HashMap;

public class CarRentalService {

    private HashMap<String, Car> rentalService;

    public CarRentalService() {
        this.rentalService = new HashMap<>();
    }

    public void displayAvailableCars() {
        System.out.println("The following cars are listed on lot: ");
        for (Car car : rentalService.values()) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }
    }

    public void addCar(String carId, Car car) {
        rentalService.put(carId, car);
    }

    public void removeCarFromLot(String carId, Car car) {
        // TODO: check if the car is rented before removing it
        rentalService.remove(carId, car);
    }

    public void rentCar(String carId, int days) {
        if (!rentalService.containsKey(carId)) {
          // TODO: throw an Exception instead
        } else {
            Car car = rentalService.get(carId);
            //instantiating a Car object while using hte get index, can we review this? I tired to retrieve the object myself but had to cheat and use CHATGPT to figure it out :P
            System.out.println(car.getBrand() + " " + car.getModel() + " was rented for " + days + " days");

            double rentalCost = (car.getRentalRate() * days) + car.getDepositAmount();
            System.out.println("Total rental cost of : " + rentalCost);
            rentalService.remove(car);
            car.setAvailable(false);
            System.out.println("Car has been removed from lot");
        }
    }


}


