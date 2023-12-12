data class Order(val id: Int?, val status: OrderStatus, val products: List<Product>, val address: String) {
    init {
        require(address.isNotBlank()) { "Address must not be empty" }
        require(products.isNotEmpty()) { "Order must contain at least one product" }
    }
}
enum class OrderStatus { RECEIVED, PROCESSING, SHIPPED, DELIVERED, COMPLETED }

class OrderRepository {
    private val orders: MutableMap<Int, Order> = mutableMapOf(
        0 to Order(0, OrderStatus.COMPLETED, listOf(
            Product(0, "protein", Price(29.99)),
            Product(1, "protein bar", Price(29.99)),
            Product(2, "protein cocktail", Price(29.99))),
            "example address 0"
        ),
        1 to Order(1, OrderStatus.COMPLETED, listOf(
            Product(0, "protein cake", Price(29.99)),
            Product(1, "protein milk", Price(29.99)),
            Product(2, "protein flour", Price(29.99))),
            "example address 1"
        ),
        2 to Order(2, OrderStatus.COMPLETED, listOf(
            Product(0, "protein", Price(29.99)),
            Product(1, "protein", Price(29.99)),
            Product(2, "protein", Price(29.99))),
            "example address 2"
        ),
    )

    fun getOrderById(id: Int): Order? {
        return orders[id]
    }
}

class OrderFactory {
    fun createOrder(id: Int?, status: OrderStatus, products: List<Product>, address: String): Order {
        return Order(id, status, products, address)
    }
}