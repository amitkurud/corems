package com.amitkurud.corems

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoremsApplication

fun main(args: Array<String>) {
    runApplication<CoremsApplication>(*args)
}
