public class PdfInvoiceService implements InvoiceService {
    @Override
    public void generateInvoice(String fileName) {
        System.out.println("Invoice generated: " + fileName);
    }
}
