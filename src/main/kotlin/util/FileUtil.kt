package util

import java.io.File

class FileUtil {

    companion object {

        fun readInput(day: Int): List<String> {
            val dayString = day.toString().padStart(2, '0')
            return File("src/main/kotlin/_$dayString/input.txt").absoluteFile.useLines { it.toList() }
        }

    }
}