public class InventorySystem {
    // Product name, product quantity, unit price, reorder threshold
    String productName = "Iphone";
    int productQuantity = 50;
    double unitPrice = 999.99;
    int reorderThreshold = 20;

    // Arithmetic: Calculate total value in stock.
    public double calculateTotalValue() {
        return productQuantity * unitPrice;
    }

    // Relational: Check if product quantity is below reorder threshold
    public boolean isBelowReorderThreshold() {
        return productQuantity < reorderThreshold;
    }

    // Logical: If quantity is sufficient AND product is marked for sale, display it as "Available".
    public String checkAvailability() {
        boolean isMarkedForSale = true;
        if (productQuantity > 0 && isMarkedForSale) {
            return "Available";
        } else {
            return "Not Available";
        }
    }

    // Decrement: Decrease product quantity after sale.
    public void productQuantityAfterSale(int quantitySold) {
        if (productQuantity >= quantitySold) {
            productQuantity -= quantitySold;
        } else {
            System.out.println("Insufficient stock to complete sale.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        InventorySystem inv = new InventorySystem();
        System.out.println("Total Value: " + inv.calculateTotalValue());
        System.out.println("Below Reorder Threshold: " + inv.isBelowReorderThreshold());
        System.out.println("Availability: " + inv.checkAvailability());
        inv.productQuantityAfterSale(10);
        System.out.println("Quantity after sale: " + inv.productQuantity);
    }
}


