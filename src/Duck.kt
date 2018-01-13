abstract class Duck {
    abstract var flyBehavior: FlyBehavior
    abstract var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.Quack()
    }

    fun swim() {
        println("All ducks can swim")
    }
}