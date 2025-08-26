package jetbrains.kotlin.course.last.push

// You will use this function later
fun getPattern(): String {
    println(
        "Do you want to use a pre-defined pattern or a custom one? " +
                "Please input 'yes' for a pre-defined pattern or 'no' for a custom one"
    )
    do {
        when (safeReadLine()) {
            "yes" -> {
                return choosePattern()
            }
            "no" -> {
                println("Please, input a custom picture")
                return safeReadLine()
            }
            else -> println("Please input 'yes' or 'no'")
        }
    } while (true)
}

// You will use this function later
fun choosePattern(): String {
    do {
        println("Please choose a pattern. The possible options: ${allPatterns().joinToString(", ")}")
        val name = safeReadLine()
        val pattern = getPatternByName(name)
        pattern?.let {
            return@choosePattern pattern
        }
    } while (true)
}

// You will use this function later
fun chooseGenerator(): String {
    var toContinue = true
    var generator = ""
    println("Please choose the generator: 'canvas' or 'canvasGaps'.")
    do {
        when (val input = safeReadLine()) {
            "canvas", "canvasGaps" -> {
                toContinue = false
                generator = input
            }
            else -> println("Please, input 'canvas' or 'canvasGaps'")
        }
    } while (toContinue)
    return generator
}

fun getPatternHeight(pattern: String): Int = pattern.lines().size

fun fillPatternRow(patternRow: String, patternWidth: Int): String {
    if (patternRow.length > patternWidth) {
        throw IllegalStateException("Pattern row is longer than width")
    }
    return patternRow + separator.toString().repeat(patternWidth - patternRow.length)
}

fun repeatHorizontally(pattern: String, n: Int, patternWidth: Int): String {
    val builder = StringBuilder()
    for (row in pattern.lines()) {
        val filled = fillPatternRow(row, patternWidth)
        builder.append("${filled.repeat(n)}$newLineSymbol")
    }
    return builder.toString()
}

fun repeatHorizontallyWithGaps(pattern: String, n: Int, patternWidth: Int): String {
    val builder = StringBuilder()
    val rows = pattern.lines()
    for (row in rows) {
        val filled = fillPatternRow(row, patternWidth)
        repeat(n) { i ->
            builder.append(filled)
            if (i < n - 1) {
                // вставляем разделитель между блоками
                builder.append(separator)
            }
        }
        builder.append(newLineSymbol)
    }
    return builder.toString()
}


fun dropTopLine(image: String, width: Int, patternHeight: Int, patternWidth: Int): String {
    val lines = image.lines()
    val a = StringBuilder()
    return if (patternHeight > 1) {
        for (i in 1 until lines.size - 1) {
            a.append(lines[i] + newLineSymbol)
        }
        a.append(lines[lines.size - 1])
        a.toString()
    } else {
        image
    }
}

fun canvasGenerator(pattern: String, width: Int, height: Int): String {
    val canvas = StringBuilder()
    val horizontal = repeatHorizontally(pattern, width, getPatternWidth(pattern))
    for (i in 1..height) {
        if (i > 1) {
            canvas.append(dropTopLine(horizontal, width, getPatternHeight(pattern), getPatternWidth(pattern)))
        } else {
            canvas.append(horizontal)
        }
    }
    return canvas.toString()
}

fun canvasWithGapsGenerator(pattern: String, width: Int, height: Int): String {
    val canvasWithGaps = StringBuilder()
    for (i in 0 until height) {
        if (i % 2 == 0) {
            canvasWithGaps.append(repeatHorizontallyWithGaps(pattern, width, getPatternWidth(pattern)))
        } else {
            canvasWithGaps.append("${separator.toString().repeat(getPatternWidth(pattern))}${repeatHorizontallyWithGaps(pattern, (width - 1), getPatternWidth(pattern))}")
        }
    }
    return canvasWithGaps.toString()
}

// You will use this function later
fun safeReadLine(): String = readlnOrNull() ?: error("Your input is incorrect, sorry")

fun main() {
    // Uncomment this code on the last step of the game

    // val pattern = getPattern()
    // val generatorName = chooseGenerator()
    // println("Please input the width of the resulting picture:")
    // val width = safeReadLine().toInt()
    // println("Please input the height of the resulting picture:")
    // val height = safeReadLine().toInt()

    // println("The pattern:$newLineSymbol${pattern.trimIndent()}")

    // println("The generated image:")
    // println(applyGenerator(pattern, generatorName, width, height))
}
