package homework.abstraction.abstraction_and_hashmaps.rentalCars;

import java.util.HashMap;

public class CarRentalService {
    HashMap<String, Car> RentalService = new HashMap<String, Car>();



    public void addCar(String carId, Car car){
        RentalService.put(carId, car);
    }

    public void removeCarfromLot(String carId, Car car){
        RentalService.remove(carId, car);
    }

    public void rentCar(String carId, int days){
        if (RentalService.containsKey(carId)) {
          //  RentalSerivce.get()

        }
    }
}
