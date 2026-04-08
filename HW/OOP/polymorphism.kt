open class Animal {
    open fun makeSound() {
        println("Hayvan ses çıkarıyor")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Hav Hav")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Miyav")
    }
}