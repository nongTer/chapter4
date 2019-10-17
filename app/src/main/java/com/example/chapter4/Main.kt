fun  main(args:Array<String>) {
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
    println("How old are you")
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
    println(message)
}