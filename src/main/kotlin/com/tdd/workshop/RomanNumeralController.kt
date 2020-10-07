package com.tdd.workshop

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class RomanNumeralController {
    @GetMapping("{number}")
    fun getRomanFromNumber(@PathVariable number: Int): String {
        // todo: check Roman value for number
        return "Welcome to WWCode TDD Workshop"
    }
}