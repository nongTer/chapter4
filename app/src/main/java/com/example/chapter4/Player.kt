package com.example.chapter4

class Player (val name:String,var level:Int=1,var lives:Int=3,var score:Int=0){

    var  weapon:Weapon= Weapon("Fist",1)
    val inventory =ArrayList<Loot>()

    fun show(){
        println("""
            name:$name
            lives:$lives
            level:$level
            score:$score
            weapon:${weapon.name}
            damag:${weapon.damageInflicted}
            """)
    }
}