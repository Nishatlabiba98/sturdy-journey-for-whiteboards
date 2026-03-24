public class Price {
    
    public int calculateTotalPrice(int quantity, int unitPrice) {
     return quantity * unitPrice;
    }

    public static void main (String[] args) {
       Price p  = new Price();
       int quantity = 25;
       int unitPrice = 10;
    int totalPrice = p.calculateTotalPrice(quantity, unitPrice);
    System.out.println(totalPrice);
    }
}
