package order.Demo;

import order.Do.Order;

import java.util.ArrayList;

public class DemoClass {

    public static void main(String[] args) {
        ArrayList<Order> orderList  =  new ArrayList<>();
        for(int i = 0;i<10;i++){
            Order order = new Order();
            order.setId(i+"083784738489398");
            orderList.add(order);
        }
        Order newOrder = new Order();
        newOrder.setId("888888888888");
        System.out.println(orderList.get(3));
        orderList.set(3,newOrder);
        System.out.println(orderList.get(3));
        orderList.remove(3);
        System.out.println(orderList.get(3));
        System.out.println(orderList.size());
    }

}
