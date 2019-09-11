package org.bonitasoft.kata.fizzbuzz

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

/**
 * @author Collective
 */
class FizzBuzzTest {

    @Test
    fun `should return "1" for input 1`() {
        assertThat(FizzBuzz().getValue(1)).isEqualTo("1")
    }

    @Test
    fun `should return "2" for input 2`() {
        assertThat(FizzBuzz().getValue(2)).isEqualTo("2")
    }

    @Test
    fun `should return "Fizz" for input 3`() {
        assertThat(FizzBuzz().getValue(3)).isEqualTo("Fizz")
    }

    @Test
    fun `should return "Fizz" for input 6`() {
        assertThat(FizzBuzz().getValue(6)).isEqualTo("Fizz")
    }

    @Test
    fun `should return "Buzz" for input 5`() {
        assertThat(FizzBuzz().getValue(5)).isEqualTo("Buzz")
    }

    @Test
    fun `should return "FizzBuzz" for input 15`() {
        assertThat(FizzBuzz().getValue(15)).isEqualTo("FizzBuzz")
    }

}