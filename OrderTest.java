public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderProcessor();
        InvoiceGenerator invoiceGenerator = new InvoiceService();
        EmailNotifier emailNotifier = new EmailService();

        OrderHandler orderHandler = new OrderHandler(order, invoiceGenerator, emailNotifier);
        orderHandler.processOrder(10.0, 2, "John Doe", "123 Main St", "order_123.pdf", "johndoe@example.com");
    }
}