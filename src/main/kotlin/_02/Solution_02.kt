package _02

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

    var score = 0

    for (line in lines) {
        score += points[line.filter { !it.isWhitespace() }]!!
    }

    println("Result 1: $score")
}
