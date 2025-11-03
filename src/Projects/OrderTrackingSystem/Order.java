package Projects.OrderTrackingSystem;

public class Order
{

//    Context:
//    You are building an order tracking system:
//        - Order class has:
//        - Static counter for total orders placed.
//- Static method to display total orders.
//        - Instance fields for orderId, customerName, product.
//- Every new order should increment the total order counter.
//
//    Assignment Tasks:
//        1. Create multiple Order objects from Main class.
//        2. Verify that the counter value is shared among all objects.
//        3. Demonstrate that you can call the static method without creating an Order object.

     private static long totalOrders=0;

     String orderId,customerName,product;
     public Order(String orderId,String customerName,String product)
     {
         this.orderId=orderId;
         this.customerName=customerName;
         this.product=product;

         Order.totalOrders+=1;
     }
     public static long getTotalOrders()
     {
         return totalOrders;
     }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }
}
