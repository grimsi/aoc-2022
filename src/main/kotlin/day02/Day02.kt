package day02

import util.FileUtil

fun main() {
    val lines = FileUtil.readInput(2)

    //A, X: Rock = 1
    //B, Y: Paper = 2
    //C, Z: Scissor = 3
    val points = mapOf(
        "AX" to 4, "AY" to 8, "AZ" to 3,
        "BX" to 1, "BY" to 5, "BZ" to 9,
        "CX" to 7, "CY" to 2, "CZ" to 6,
    )

    // X = loose
    // Y = draw
    // Z = win
    val conversion = mapOf(
        "AX" to "AZ", "AY" to "AX", "AZ" to "AY",
        "BX" to "BX", "BY" to "BY", "BZ" to "BZ",
        "CX" to "CY", "CY" to "CZ", "CZ" to "CX",
    )

    var result1 = 0
    var result2 = 0

    for (line in lines) {
        val key = line.filter { !it.isWhitespace() }
        result1 += points[key]!!
        result2 += points[conversion[key]!!]!!
    }

    println("Result 1: $result1")
    println("Result 2: $result2")
}
