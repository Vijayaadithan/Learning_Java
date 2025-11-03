package Projects.OrderTrackingSystem;
import Projects.OrderTrackingSystem.Order;
public class Main
{
    public static void main(String[] args)
    {
        Order order1=new Order("1","Nayanthara","Toy_Car");
        Order order2=new Order("2","Samantha","Pillow");

        System.out.println(order1.getOrderId());
        System.out.println(order1.getCustomerName());
        System.out.println(order1.getProduct());
        System.out.println();
        System.out.println(order2.getOrderId());
        System.out.println(order2.getCustomerName());
        System.out.println(order2.getProduct());
        System.out.println("Total no of Orders: "+Order.getTotalOrders());
    }
}
