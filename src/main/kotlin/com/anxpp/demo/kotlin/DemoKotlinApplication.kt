package com.anxpp.demo.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoKotlinApplication::class.java, *args)
}
