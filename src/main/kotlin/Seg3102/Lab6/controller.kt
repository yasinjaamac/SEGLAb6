package Seg3102.Lab6

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("Calculator")

class controller {
    @GetMapping("/add/{number1}/{number2}")
    fun getAdd(@PathVariable x: Double, y: Double) = (x + y)


    @GetMapping("/subtract/{number1}/{number2}")
    fun getSubtract(@PathVariable x: Double, y: Double) = (x- y)


    @GetMapping("/multiply/{number1}/{number2}")
    fun getMultiply(@PathVariable x: Double, y: Double) = (x * y)

    @GetMapping("/divide/{number1}/{number2}")
    fun getDivide(@PathVariable x: Double, y: Double) = (x/y)



}