package org.bonitasoft.kata.fizzbuzz

import java.util.*

/**
 * @author Collective ownership
 */
class FizzBuzz {

    private val solutions = mapOf(Pair(3, "Fizz"), Pair(5, "Buzz"))

    fun getValue(number: Int): String {
        return Optional.of(
                solutions.filter { (key, _) -> number%key == 0 }.values.joinToString(separator = "")).filter { it.isNotEmpty() }
                .orElse(number.toString())
    }
}