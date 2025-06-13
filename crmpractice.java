 public class crmpractice {
    public static void main(String[] args) {
        System.out.println("Customer Relationship Management System");

//stomer contactdetails;
    String name="Lakshmi";
    String email="lakshmi@gmail.com";
    String phoneNumber = "+91-9876543210";
    

  //Sales salesdetails;
    String Name="Janu";
    String emailId="janu@mai.com";
    String phone="2356335235";
    String leadsource="web";
    String leadstatus="new";
    String productname="Iphone";
    double cost=100000;
    

//Interaction interactiondetails;
    String interactiontype="call";
    String interactiondate="12-06-2025";
    String interactiontime="11.00 AM";
    String interactionsummary="Discussed about product features and pricing";

    //Support Ticket details;
    String ticketid="TKS2254";
    String ticketstatus="open";
    String ticketpriority="high";
    String ticketdescription="Customer reported on issue with product functionality";
    
        System.out.println("\n Contact Details:");
        System.out.println("Customer Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("phoneNumber:" +phoneNumber);
        

        System.out.println("\n Sales Details:");
        System.out.println("Name: " + Name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Leadsourse:"+leadsource);
        System.out.println("Lead Status: " + leadstatus);
        System.out.println("Product: " + productname);
        System.out.println("cost:"+ cost);

     System.out.println("\n Intreraction Details:");
        System.out.println("type:" + interactiontype);
        System.out.println("date:" + interactiondate);
        System.out.println("summary:" + interactionsummary);

        System.out.println("\n support ticket details:");
        System.out.println("id:" + ticketid);
        System.out.println("status:" + ticketid);
        System.out.println("priority:" + ticketpriority);
        System.out.println("Description:" + ticketdescription);
}
}
