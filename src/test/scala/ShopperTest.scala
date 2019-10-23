import org.scalatest._


class ShopperTest extends FunSuite {

  test("Items should come to 1.00"){
  val sum =  shopper.checkout(List("Cola","Cola"))
    assert(sum === 1.00)
  }

  test("Steak Sandwich should come to £4.50"){
    val sum = shopper.checkout(List("Steak_Sandwich"))
    assert(sum === 4.50)
  }

  test("Coffee should come to £1.00"){
    val sum = shopper.checkout(List("Coffee"))
    assert(sum === 1.00)
  }

  test("Cheese Sandwich should come to £2.00"){
    val sum = shopper.checkout(List("Cheese_Sandwich"))
    assert(sum === 2.00)
  }



}
