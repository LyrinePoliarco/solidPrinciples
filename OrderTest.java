public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderProcessor();
        double total = order.calculateTotal(10.0, 2);
        System.out.println("Order total: $" + total);
        
        order.placeOrder("John Doe", "123 Main St");

        // Using invoice service separately
        InvoiceService invoiceService = new PdfInvoiceService();
        invoiceService.generateInvoice("order_123.pdf");

        // Using notification service separately
        NotificationService emailService = new EmailNotificationService();
        emailService.sendNotification("johndoe@example.com");
    }
}
