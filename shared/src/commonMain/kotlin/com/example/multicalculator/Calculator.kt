package com.example.multicalculator

class Calculator {
    //function for addition
    fun add(left: Int, right: Int): Int {
        return left + right
    }

    //function for subtract
    fun subtract(left: Int, right: Int): Int {
        return left - right
    }

    //function for division
    fun divide(left: Int, right: Int): Double {
        if (right == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return left.toDouble() / right.toDouble()
    }

    //function for multiplication
    fun multiply(left: Int, right: Int): Int {
        return left * right
    }
}