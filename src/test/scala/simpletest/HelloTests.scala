package simpletest

import org.scalatest.FunSuite

class HelloTests extends FunSuite {

    //test1
    test("the name is set correctly in constructor") {
        val p = new Person("Pooja Adhyapak")
        assert(p.name == "Pooja Adhyapak")
        }

    //test2
    test("a Person's name can be changed") {
        val p = new Person("Prachi Chavan")
        p.name = "Bittu"
        assert(p.name == "Bittu")
    }
}