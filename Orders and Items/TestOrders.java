import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        Order orders = new Order();
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();


        orders.name = "Abebe";
        orders.total = 6;
        orders.ready = true;

        order1.name = "Cindhuri";
        order1.total = 6;
        order1.ready = true;

        System.out.println(order1);

        order2.name = "Jimmy";
        order2.total = 6;
        order2.ready = true;

        order3.name = "Noah";
        order3.total = 6;
        order3.ready = true;

        order4.name = "Sam";
        order4.total = 6;
        order4.ready = true;

        orders.displayStatus();


         Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 4;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 5;

        Item item3 = new Item();
        item3.name = "dipCoffee";
        item3.price = 3;

        Item item4 = new Item();
        item4.name = "capuccino";
        item4.price = 6;


        //  orders.addItem(item1);
        //  orders.addItem(item2);
        //  orders.addItem(item3);
        //  orders.addItem(item4);
        
        orders.displayStatus();


         System.out.println("############################");
        Order order0 = new Order("John",  5.50, true);
        order0.addItem(item1);

        /* order2.addItem(item2);
        order3.addItem(item3);
        order4.addItem(item4); */

        // order0.displayStatus();

       /*  order2.displayStatus();
        order3.displayStatus();
        order4.displayStatus(); */
    
        // Menu items
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates

        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
