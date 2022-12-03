package day03

import util.FileUtil

fun main() {
    val lines = FileUtil.readInput(3)

    var result1 = 0
    var result2 = 0

    for (line in lines) {
        val f = line.substring(0, line.length / 2).toSet()
        val s = line.substring(line.length / 2).toSet()
        val commonItems = f.intersect(s)

        commonItems.forEach { result1 += charToPrio(it) }
    }

    for(i in lines.indices step 3) {
        val commonItem = lines[i].toSet().intersect(lines[i+1].toSet()).intersect(lines[i+2].toSet()).first()
        result2 += charToPrio(commonItem)
    }

    println("Result 1: $result1")
    println("Result 2: $result2")

}

fun charToPrio(char: Char): Int {
    return (if(char.isUpperCase()) char.code - 'A'.code + 26 else char.code - 'a'.code) + 1
}
