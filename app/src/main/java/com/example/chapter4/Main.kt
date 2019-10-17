fun  main(args:Array<String>){
    println("Hello World")
    println("My first Kotlin program")

    var jim:String
    var  tim :String
    tim="Tim Buchalka"
    println(tim)

    var  timsWeeklySalary:Int =32
    var  timMonthlySalary:Int=timsWeeklySalary*4
    println(timsWeeklySalary)
    println(timMonthlySalary)

    println()

    val  apples:Int=6
    val  orenges :Int=5
    var fruit :Int= apples-orenges
    println("$apples apples - $orenges oranges leaves $fruit piece(s) of fruit ")

    println("A quarter of the apples is ${apples/4}")

    println()

    val  weeks:Int=234
    val  years:Double=weeks/52.0
    println("$weeks weeks is $years years")

    tim="James T Kirk"

    println("My name is"+tim)
    println("I can print \$tim ")
}
