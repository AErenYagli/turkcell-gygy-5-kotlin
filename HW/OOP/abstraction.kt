abstract class Payment {
    abstract fun pay(amount: Double)

    fun printReceipt() {
        println("Ödeme alındı")
    }
}

class CreditCard : Payment() {
    override fun pay(amount: Double) {
        println("$amount TL kredi kartı ile ödendi")
    }
}