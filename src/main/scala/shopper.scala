object shopper{

  def checkout(listItems:List[String]): Double ={

    //Constants  
    var amountOfCola = 0
    var amountOfCoffee =0
    var amountOfCheeseSandwich = 0
    var amountOfSteakSandwich = 0
    var serviceCharge : Double = 0.00
    var overallCost : Double = 0.00
    val tenPercentService : Double = 0.10
    val twentyPercentService : Double = 0.20
    val serviceChargeCap : Double = 20.00

    for(i <-  0 until listItems.length) {
      listItems(i) match {
        case "Cola" => amountOfCola += 1
        case "Coffee" => amountOfCoffee += 1
        case "Cheese_Sandwich" => amountOfCheeseSandwich += 1
        case "Steak_Sandwich" => amountOfSteakSandwich += 1
      }
    }

    var TotalCost = cola(amountOfCola) + coffee(amountOfCoffee) + cheeseSandwich(amountOfCheeseSandwich) + steakSandwich(amountOfSteakSandwich)

    val with10percent = TotalCost * tenPercentService
    val with20percent = TotalCost * twentyPercentService

    if(listItems contains "Steak_Sandwich" ){
      TotalCost = TotalCost
    }else if(listItems contains "Cheese_Sandwich"){
      TotalCost = TotalCost
    }

    if(listItems contains "Steak_Sandwich"){
      serviceCharge = serviceCharge + with20percent
    }else if(listItems contains "Cheese_Sandwich"){
      serviceCharge = serviceCharge + with10percent
    }

    val newCost = TotalCost
    overallCost = newCost + serviceCharge

    if(serviceCharge == serviceChargeCap){
      serviceCharge = 20.00
    }

    println(f"Overall Cost with service charge is: £${overallCost}%1.2f")
    println(f"Service Charge is: £${serviceCharge}%1.2f")
    TotalCost
  }

  def cola(amount :Int):Double={
    val totalCost = amount*0.50
    totalCost
  }

  def coffee(amount:Int):Double={
    val totalCost = amount*1.00
    totalCost
  }

  def cheeseSandwich(amount:Int):Double={
    val costBeforeService = amount*2.00
    costBeforeService
  }

  def steakSandwich(amount:Int):Double={
    val costBeforeService = amount*4.50
    costBeforeService
  }

  def main(args: Array[String]): Unit = {
    println(f"Cost of Items without Service Charge £${checkout(List("Steak_Sandwich"))}%1.2f")
  }

}