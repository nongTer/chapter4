package com.example.chapter4

open class Enamy(val name:String,var hitPoints:Int,var lives:Int) {

 fun  takeDamage(damage:Int){
     val remainingHitPoints=hitPoints -damage
     if (remainingHitPoints>0){
         hitPoints =remainingHitPoints
         println("$name took $damage points of damage,and has $hitPoints left")
     }else{
         lives-=1
         println("$name lost a lift")
     }
 }
}