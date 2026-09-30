package dev.pipemesh.demo.orders.client;

import java.util.List;

/**
 * The orders service's client library. Other services build against the jar
 * the pipeline produces from this directory; they never read these sources.
 */
public final class OrdersClient {

    /** Bumped when the client's contract changes. */
    public static final String VERSION = "1.0.0";

    private final String baseUrl;

    public OrdersClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String baseUrl() {
        return baseUrl;
    }

    /** The orders of a customer. A demo: answered from fixed data, not over the network. */
    public List<Order> ordersOf(String customer) {
        return List.of(
                new Order(customer + "-1", "tea", 2, 450),
                new Order(customer + "-2", "mug", 1, 1200));
    }
}
