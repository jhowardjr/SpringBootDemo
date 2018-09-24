package com.example.SpringBootDemo.Models

import java.util.*

open class Fortunes {

    private val fortune = arrayOf(
            // TODO: EXTRACT FROM PERSISTENT STORE
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )

    fun getRandom() : String {
        return fortune[Random().nextInt(fortune.size)]
    }
}