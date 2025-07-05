package com.example.greetingcard.unocard

object UnoCard{
    val colors  = arrayOf(0xFF000000, 0xFFE74C3C, 0xFF2ECC71, 0xFFF1C40F, 0xFF3498DB)
    val numbers = arrayOf("0","1","2","3","4","5","6","7","8","9","+2")
    val wild = arrayOf("+4", "Wild")

    fun getRandomCard(): Pair<Long, String> {
        val aRandomColor = colors.random()
        val cardSymbol = when(aRandomColor) {
            0xFF000000 -> wild.random()
            else -> numbers.random()
        }

        return Pair(aRandomColor, cardSymbol)
    }
}