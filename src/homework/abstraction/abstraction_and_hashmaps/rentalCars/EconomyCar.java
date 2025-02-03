package homework.abstraction.abstraction_and_hashmaps.rentalCars;

public class EconomyCar extends Car {

    public EconomyCar(){

    }
    @Override
    public int getDepositAmount(){
        int deposit = 200;
        return deposit;
    }
    @Override
    public int calculateRentalCost(int days){
        System.out.println("I'll do this later");
        return 0;
    }

}
