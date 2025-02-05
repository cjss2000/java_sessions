package homework.abstraction.abstraction_and_hashmaps.rentalCars;

public class EconomyCar extends Car {

    public EconomyCar(String carId, String brand, String model, double rentalRate, boolean isAvailable){
    super(carId, brand, model, rentalRate, isAvailable);
    }
    @Override
    public int getDepositAmount(){
        int deposit = 200;
        return deposit;
    }
    @Override
    public int calculateRentalCost(int days){
        return (int) this.getRentalRate() * days;
        // I feel like I cheated and used ChatGPT to help me convert this double to an int, can we go over this?
    }

}
