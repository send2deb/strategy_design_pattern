class MallerDuck : Duck() {
    override var flyBehavior: FlyBehavior = FlyWithWings()
//        get() { return FlyNoWay()}
    override var quackBehavior: QuackBehavior = Quack()
//        get() { return Quack()}

    override fun display() {
        println("I'm a Maller duck!")
    }
}