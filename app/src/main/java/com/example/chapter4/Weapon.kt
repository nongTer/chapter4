package com.example.chapter4

class Weapon(val name:String,var damageInflicted:Int) {

    override fun toString(): String {
        return "$name inflicts $damageInflicted points of damage"
    }
}