import com.example.chapter4.Loot
import com.example.chapter4.LootType
import com.example.chapter4.Player
import com.example.chapter4.Weapon

fun  main(args: Array<String>, one2watch: Any) {
    /*println("Hello World")
    println("My first Kotlin program")

    var jim:String ="James T Kirk"
    val  tim :String="Tim Buchalka"
    println(tim)

    val  timsWeeklySalary:Int =32
    val  timMonthlySalary:Int=timsWeeklySalary*4
    println(timsWeeklySalary)
    println(timMonthlySalary)

    println()

    val  apples:Int=6
    val  orenges :Int=5
    val fruit :Int= apples-orenges
    println("$apples apples - $orenges oranges leaves $fruit piece(s) of fruit ")

    println("A quarter of the apples is ${apples/4}")

    println()

    val  weeks:Int=234
    val  years:Double=weeks/52.0
    println("$weeks weeks is $years years")

    jim="James T Kirk"


    println("My name is"+tim)
    println("Jim is $jim ")
}*/
    /*val lives =0

    val isGameOver =(lives<1)
    println(isGameOver)

    if (isGameOver){
        println("Game over!")
    }else{
        println("You're still alive!")
    }*/
   /* println("How old are you")
    val age = readLine()!!.toInt()
    println("age is $age")

    val message :String
    message =when{
        age<18 -> "You're too young to vote"
        age==100 ->   "Congratulation"
        else -> "You can vote"
    }
  /* message = if (age<18){
         "You're too young to vote"
    }else if(age==100){
        "Congratulation"
    }else{
        "You can vote"
    }*/
    println(message)*/

    val tim =Player("Tim")
    tim.show()

   val  louise =Player("Louise",5)
    louise.show()

    val gr8 =Player("gr8",4,8)
    val one2watch=Player("Ace",2,5,1000)
    gr8.show()
    one2watch.show()
    println(one2watch.weapon.name)
    println(one2watch.weapon.damageInflicted)

    val axe =Weapon("Axe",12)
    gr8.weapon=axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted=24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    tim.weapon = Weapon("Sword",10)
   // println(tim.name)
    tim.show()

    louise.weapon=tim.weapon
    louise.show()

   tim.weapon= Weapon("Spear",14)
    //println(tim.weapon.name)
    tim.show()

    val redPotion=Loot("Red Potion",LootType.POTION,7.50)
    tim.inventory.add(redPotion)
    val chestArmor=Loot("+3 Chest Armor",LootType.ARMOR,80.00)
    tim.inventory.add(chestArmor)
    tim.showInventory()

    tim.inventory.add(Loot("Ring of Protection +2",LootType.RING,40.25))
    tim.inventory.add(Loot("Invisibility Potion",LootType.POTION,35.91))
    tim.showInventory()
    println(tim.toString())
    for (i in 1..10){
        println()
    }
}
