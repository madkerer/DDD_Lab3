fun main() {

    val exampleCustomerRepository = CustomerRepository()
    val exampleOrderRepository = OrderRepository()

    val exampleCustomer = exampleCustomerRepository.getCustomerById(1)
    val exampleOrder = exampleOrderRepository.getOrderById(1)

    println("orderId:${exampleOrder?.id}\norderStatus:${exampleOrder?.status}\norderProducts:${exampleOrder?.products}\norderAddress:${exampleOrder?.address}\n" +
            "customerId:${exampleCustomer.id}\ncustomerName:${exampleCustomer.name}\ncustomerCardType:${exampleCustomer.cardType}\ncustomerPaymentMethod:${exampleCustomer.paymentMethod}")
}