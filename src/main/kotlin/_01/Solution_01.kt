package _01

import util.FileUtil

fun main() {
    val lines = FileUtil.readInput(1)
    val result = ArrayList<Int>()
    var buf = 0;

    for (line in lines) {
        if (line.isNotBlank()) {
            buf += line.toInt()
        } else {
            result.add(buf)
            buf = 0
        }
    }

    println("Step 1: ${result.max()}")
    println("Step 2: ${result.sorted().takeLast(3).sum()}")
}