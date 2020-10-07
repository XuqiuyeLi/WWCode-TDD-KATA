package com.tdd.workshop

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RomanNumeralApplication

fun main(args: Array<String>) {
	runApplication<RomanNumeralApplication>(*args)
}
