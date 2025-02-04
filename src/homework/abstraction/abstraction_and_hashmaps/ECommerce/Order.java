package homework.abstraction.abstraction_and_hashmaps.ECommerce;

public abstract class Order {

    private String orderId;
    private String customerName;
    private double orderAmount;
    private double shippingCost;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    Order(String orderId, String customerName, double orderAmount, double shippingCost){
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.shippingCost = shippingCost;
    }

    abstract double calculateShippingCost();
    abstract double applyDiscount();

    public double getFinalTotal(){
        double finalTotal =  this.orderAmount + this.shippingCost;
        return finalTotal;
    }

    public void displayOrderSummer(){
        System.out.println("Here is your order summary: Order ID: " + this.orderId + " for: " + this.customerName + "Total Amount: " + this.getFinalTotal() );
    }

}
