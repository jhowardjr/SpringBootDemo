package com.example.SpringBootDemo

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @RequestMapping(value = "/")
    fun index(): String {
        return "Hello Kotlin World!!"
    }
}