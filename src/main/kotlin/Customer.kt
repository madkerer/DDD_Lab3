data class Customer(val id: Int?, val name: String, val cardType: CardType, val paymentMethod: PaymentMethod)
enum class CardType { VISA, MASTER_CARD, MIR }
enum class PaymentMethod { SBP, ACQUIRING, INTERNET_PAYMENT }

class CustomerRepository {
    fun getCustomerById(id: Int): Customer {
        return Customer(1, "firstCustomer", CardType.MIR, PaymentMethod.SBP)
    }
}

class CustomerFactory {
    fun createCustomer(id: Int?, name: String, cardType: CardType, paymentMethod: PaymentMethod): Customer {
        return Customer(id, name, cardType, paymentMethod)
    }
}