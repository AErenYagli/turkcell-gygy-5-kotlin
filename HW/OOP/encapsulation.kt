class BankAccount(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        }
    }

    fun getBalance(): Double {
        return balance
    }
}