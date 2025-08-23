package jetbrains.kotlin.course.almost.done

fun trimPicture(picture: String): String = picture.trimIndent()

fun applyBordersFilter(picture: String): String {
    val ap = StringBuilder()
    val at = picture.lines()
    ap.append("${borderSymbol.toString().repeat(getPictureWidth(picture) + 4)}$newLineSymbol")
    for (line in at) {
        val padded = line.padEnd(getPictureWidth(picture), separator)
        ap.append("$borderSymbol$separator$padded$separator$borderSymbol$newLineSymbol")
    }

    ap.append(borderSymbol.toString().repeat(getPictureWidth(picture) + 4))
    return ap.toString()
}

fun applySquaredFilter(picture: String): String {
    val up = StringBuilder()
    val ut = applyBordersFilter(picture).lines()
    for (i in ut) {
        up.append("${i.repeat(2)}$newLineSymbol")
    }
    for (i in 1 until ut.size) {
        up.append("${ut[i].repeat(2)}$newLineSymbol")
    }
    return up.toString()
}

fun applyFilter(picture: String, filter: String): String {
    return when (filter) {
        "borders" -> applyBordersFilter(trimPicture(picture))
        "squared" -> applySquaredFilter(trimPicture(picture))
        else -> error("Wrong filter name")
    }
}

fun safeReadLine(): String = readlnOrNull() ?: error("null detected")

fun chooseFilter(): String {
    var input: String
    do {
        println("Please choose the filter: 'borders' or 'squared'.")
        input = safeReadLine()
    } while (input != "borders" && input != "squared")
    return input
}

fun choosePicture(): String {

}

fun main() {
    // Uncomment this code on the last step of the game

    // photoshop()
}
