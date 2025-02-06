package homework.abstraction.abstraction_and_hashmaps.rentalCars;

import java.util.HashMap;

public class CarRentalService {
    HashMap<String, Car> RentalService = new HashMap<String, Car>();

    public void displayAvailableCars(){
        System.out.println(RentalService.values());

        }



    public void addCar(String carId, Car car){
        RentalService.put(carId, car);
    }

    public void removeCarfromLot(String carId, Car car){
        RentalService.remove(carId, car);
    }

    public void rentCar(String carId, int days){
        if (!RentalService.containsKey(carId)) {
            System.out.println("Car is not available for rent");
        }
          else {

            Car car = RentalService.get(carId);
            System.out.println(car.getBrand() + " " + car.getModel() + " was rented for " + days + "days");


            double rentalCost = (car.getRentalRate() * days) + car.getDepositAmount();
            System.out.println("Total rental cost of : " + rentalCost);
            RentalService.remove(car);
            car.setAvailable(false);
            System.out.println("Car has been removed from lot");


        }
}



    }


