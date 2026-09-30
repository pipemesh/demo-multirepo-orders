package dev.pipemesh.demo.orders.client;

/** An order as the orders service returns it. */
public record Order(String id, String sku, int quantity, long unitPriceCents) {

    public long totalCents() {
        return unitPriceCents * quantity;
    }
}
