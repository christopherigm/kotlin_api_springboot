package com

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinApiSpringbootApplication

fun main(args: Array<String>) {
	runApplication<KotlinApiSpringbootApplication>(*args)
}
