package homework.abstraction.abstraction_and_hashmaps.rentalCars;

public class LuxuryCar extends Car {

    @Override
    public int getDepositAmount(){
        int deposit = 1000;
        return deposit;
    }
    @Override
    public int calculateRentalCost(int days){
        System.out.println("I'll do this later");
        return 0;
    }
}
