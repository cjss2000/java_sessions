package homework.abstraction.abstraction_and_hashmaps.rentalCars;

public abstract class Car {

    private String carId;
    private String brand;
    private String model;
    private double rentalRate;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double rentalRate, boolean isAvailable) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.rentalRate = rentalRate;
        this.isAvailable = isAvailable;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    abstract int getDepositAmount();

    abstract int calculateRentalCost(int days);

    public void toggleAvailability() {
        if (isAvailable) {
            System.out.println("Car is available");
            //also store care in hashmap
        } else {
            System.out.println("Sorry, car is not available");
        }
    }

}
