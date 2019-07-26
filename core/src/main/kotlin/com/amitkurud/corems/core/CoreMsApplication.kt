/*
 * Copyright (C) 2019-2020 Amit Kurud
 * This file is part of Base Microservice.
 * Corems can not be copied and/or distributed without the express
 * permission of Amit Kurud
 */

package com.amitkurud.corems.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class CoreMsApplication

fun main(args: Array<String>) {
    runApplication<CoreMsApplication>(*args)
}
