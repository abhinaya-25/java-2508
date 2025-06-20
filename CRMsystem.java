public class CRMsystem {
    public static void main(String[] args) {

        System.out.println("Customer Relationship Management System");

        // Customer Data
        int customerId = 502;
        String customerName = "Anjana";
        double totalPurchases = 1500.75;
        int interactionCount = 5;
        int numberOfPurchases = 3;
        double averagePurchase = totalPurchases / numberOfPurchases;

        // Sales Lead Data
        int leadId = 503;
        double leadBudget = 2000.00;
        boolean isContacted = false;

        // Sales Opportunity Data
        double opportunityValue = 3000.00;
        boolean isClosed = false;

        // Relational Check if opportunity is high value
        boolean isHighValue = opportunityValue > 5000;

        // Logical
        boolean shouldPrioritize = (leadBudget > 3000) && (!isContacted);

        // Increment
        interactionCount++;


        System.out.println("\n--- Customer Info ---");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Purchases: $" + totalPurchases);
        System.out.println("Average Purchase: $" + averagePurchase);
        System.out.println("Updated Interaction Count: " + interactionCount);

        System.out.println("\n--- Sales Lead Info ---");
        System.out.println("Lead ID: " + leadId);
        System.out.println("Lead Budget: $" + leadBudget);
        System.out.println("Is Contacted: " + isContacted);
        System.out.println("Should Prioritize Lead: " + shouldPrioritize);

        System.out.println("\n--- Sales Opportunity Info ---");
        System.out.println("Opportunity Value: $" + opportunityValue);
        System.out.println("Is Opportunity Closed: " + isClosed);
        System.out.println("Is High Value Opportunity: " + isHighValue);
    }
}


