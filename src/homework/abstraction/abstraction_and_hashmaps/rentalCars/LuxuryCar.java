package homework.abstraction.abstraction_and_hashmaps.rentalCars;

public class LuxuryCar extends Car {

    LuxuryCar(String carId, String brand, String model, double rentalRate, boolean isAvailable){
        super(carId, brand, model, rentalRate, isAvailable);
    }

    @Override
    public int getDepositAmount(){
        int deposit = 1000;
        return deposit;
    }
    @Override
    public int calculateRentalCost(int days){
        return (int) (this.getRentalRate() * days * (1.10));

        //I'm calculating a lot of doubles to an int method, The issue I think is bc of the int parameter for days. Is there a better way to do this?
    }
}
