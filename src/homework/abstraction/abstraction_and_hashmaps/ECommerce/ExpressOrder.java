package homework.abstraction.abstraction_and_hashmaps.ECommerce;

public class ExpressOrder extends Order {
    private double flatShippingCost = 10.00;

    @Override
    public double calculateShippingCost(){
        return flatShippingCost;
    }

    @Override
    public double applyDiscount(){
        double discount = this.getOrderAmount() - .50;
        return discount;
    }

    ExpressOrder(String orderId, String customerName, double orderAmount, double shippingCost){
        super(orderId, customerName, orderAmount,shippingCost);
    }


}
