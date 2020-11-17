package simpletest

class Person(var name: String)

object  Hello extends App {
    val p = new Person("Rohith Madamshetty")
    println(s"Hello, ${p.name}")
}