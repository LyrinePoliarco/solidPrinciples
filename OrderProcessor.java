public class OrderProcessor implements Order {
    @Override
    public double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
}