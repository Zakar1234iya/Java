public class TestOrders {
    public static void main(String[] args) {
    
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 3.0);
    
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
    
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);
        order1.setReady(true);
        order4.addItem(item2);
        order4.addItem(item2);
        order2.setReady(true);

        order1.display();
        System.out.println(order1.getStatusMessage());
        
        order2.display();
        System.out.println(order2.getStatusMessage());

        order3.display();
        System.out.println(order3.getStatusMessage());

        order4.display();
        System.out.println(order4.getStatusMessage());
    }
}
