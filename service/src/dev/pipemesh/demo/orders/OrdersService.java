package dev.pipemesh.demo.orders;

import dev.pipemesh.demo.orders.client.Order;
import dev.pipemesh.demo.orders.client.OrdersClient;

/** The orders service. It shares its model with the client library it publishes. */
public final class OrdersService {

    public static void main(String[] args) {
        var orders = new OrdersClient("local").ordersOf("acme");
        long total = orders.stream().mapToLong(Order::totalCents).sum();
        if (args.length > 0 && args[0].equals("--self-test")) {
            if (orders.size() != 2 || total != 2100) throw new AssertionError("unexpected orders: " + orders);
            System.out.println("orders: self-test passed (client " + OrdersClient.VERSION + ")");
            return;
        }
        System.out.println("orders: serving " + orders.size() + " orders worth " + total + " cents");
    }
}
