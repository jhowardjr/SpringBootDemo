package com.example.SpringBootDemo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@RunWith(SpringRunner::class)
// TODO: LOAD CUSTOM SECURITY CONFIGURATON INSTEAD OF BYPASSING SECURITY
@WebMvcTest(value = DemoController::class, secure = false)
@AutoConfigureRestDocs
class DemoControllerTest {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    @Throws(Exception::class)
    fun helloWorld() {
        this.mvc.perform(get("/")).andExpect(status().isOk())
    }
}