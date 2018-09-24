package com.example.SpringBootDemo.Models

import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
class FortunesTests {

    private lateinit var fortunes: Fortunes

    @Before
    fun setUp() {
        this.fortunes = Fortunes()
    }

    @Test
    fun getRandom() {
        assertTrue(this.fortunes.getRandom().isNotEmpty())
    }
}