package com.ubertob.extensions

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNull
import org.junit.jupiter.api.Test
import java.util.*

class ExtensionPropertiesTest {


    @Test
    fun `java beans`() {
        val p = JavaPerson()
        p.name = "Fred"
        p.age = 32

        assertThat(p.name).isEqualTo("Fred")
        assertThat(p.age).isEqualTo(32)
    }


    @Test
    fun `new property on Java`() {
        val d = Date()
        d.millis = 1001

        assertThat(d.millis ).isEqualTo(1001L)
        assertThat(d.millis ).isEqualTo(d.time)
    }

    @Test
    fun `concat strings and null`() {
        assertThat(null `++` null).isNull()
        assertThat("A" `++` null).isEqualTo("A")
        assertThat(null `++` "B").isEqualTo("B")
        assertThat("A" `++` "B").isEqualTo("AB")
    }

    @Test
    fun `fizzBuzz`() {

        val res = (1..15).map { it.fizzBuzz()}.joinToString()

        val expected ="1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz"

        assertThat ( res ).isEqualTo(expected)

    }
}