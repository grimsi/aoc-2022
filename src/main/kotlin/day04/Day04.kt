package day04

import util.FileUtil

fun main() {
    val lines = FileUtil.readInput(4)

    var result1 = 0
    var result2 = 0

    for(line in lines) {
        val pairs = line.split(',')
        val pair1 = pairs[0].split('-').map { it.toInt() }
        val pair2 = pairs[1].split('-').map { it.toInt() }

        val range1 = pair1[0]..pair1[1]
        val range2 = pair2[0]..pair2[1]

        if(range1.contains(range2.first) && range1.contains(range2.last) || range2.contains(range1.first) && range2.contains(range1.last)) result1++
        if(range1.contains(range2.first) || range1.contains(range2.last) || range2.contains(range1.first) || range2.contains(range1.last)) result2++
    }

    println("Result 1: $result1")
    println("Result 2: $result2")
}
