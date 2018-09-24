package com.example.SpringBootDemo

import com.example.SpringBootDemo.Models.Fortunes
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @RequestMapping(value = "/")
    fun index(): String {
        return Fortunes().getRandom()
    }
}