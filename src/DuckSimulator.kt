fun main(args: Array<String>) {
    val mallerDuck: Duck = MallerDuck()

    mallerDuck.display()
    mallerDuck.performFly()
    mallerDuck.performQuack()
    mallerDuck.swim()

    val modelDuck: Duck = ModelDuck()
    println("\n")
    modelDuck.display()
    modelDuck.performFly()
    modelDuck.performQuack()
    modelDuck.swim()

    modelDuck.flyBehavior = FlyRocketPowered()
    modelDuck.performFly()
}