package homework.abstraction.abstraction_and_hashmaps.ECommerce;

public class StandardOrder extends Order {
    private double flatShippingCost = 5.00;

    public StandardOrder(String orderId, String customerName, double orderAmount, double shippingCost){
        super(orderId, customerName, orderAmount, shippingCost);
    }

    @Override
    public double calculateShippingCost(){
        return flatShippingCost;

    }
    @Override
    public double applyDiscount(){
        double discount = 0.0;
        if (this.getOrderAmount() > 200.00)
        {
            discount = 0.5;
        }
        return discount;
    }
}
