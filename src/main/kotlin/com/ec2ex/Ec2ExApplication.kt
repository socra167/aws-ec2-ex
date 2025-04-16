package com.ec2ex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Ec2ExApplication

fun main(args: Array<String>) {
    runApplication<Ec2ExApplication>(*args)
}
