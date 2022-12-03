package util

import java.io.File

class FileUtil {

    companion object {

        fun readInput(day: Int): List<String> {
            val dayString = day.toString().padStart(2, '0')
            return readFile("src/main/kotlin/day$dayString/input.txt")
        }

        fun readTestInput(day: Int): List<String> {
            val dayString = day.toString().padStart(2, '0')
            return readFile("src/main/kotlin/day$dayString/testinput.txt")
        }

        fun readFile(path: String): List<String> {
            return File(path).absoluteFile.useLines { it.toList() }
        }

    }
}
