package jetbrains.kotlin.course.hangman

// You will use this function later
fun getGameRules(wordLength: Int, maxAttemptsCount: Int): String = "Welcome to the game!$newLineSymbol$newLineSymbol" +
        "In this game, you need to guess the word made by the computer.$newLineSymbol" +
        "The hidden word will appear as a sequence of underscores, one underscore means one letter.$newLineSymbol" +
        "You have $maxAttemptsCount attempts to guess the word.$newLineSymbol" +
        "All words are English words, consisting of $wordLength letters.$newLineSymbol" +
        "Each attempt you should enter any one letter,$newLineSymbol" +
        "if it is in the hidden word, all matches will be guessed.$newLineSymbol$newLineSymbol" +
        "" +
        "For example, if the word \"CAT\" was guessed, \"_ _ _\" will be displayed first, " +
        "since the word has 3 letters.$newLineSymbol" +
        "If you enter the letter A, you will see \"_ A _\" and so on.$newLineSymbol$newLineSymbol" +
        "" +
        "Good luck in the game!"

// You will use this function later
fun isWon(complete: Boolean, attempts: Int, maxAttemptsCount: Int) = complete && attempts <= maxAttemptsCount

// You will use this function later
fun isLost(complete: Boolean, attempts: Int, maxAttemptsCount: Int) = !complete && attempts > maxAttemptsCount

fun isComplete(secret: String, currentGuess: String): Boolean = secret == currentGuess.replace(separator, "")

fun generateNewUserWord(secret: String, guess: Char, currentUserWord: String): String {
    var newUserWord = ""
    for ((index, i) in secret.withIndex()) {
        newUserWord += if (guess == i) {
            "$i$separator"
        } else {
            "${currentUserWord[index * 2]}$separator"
        }
    }
    return newUserWord.removeSuffix(separator)
}

fun generateSecret(): String = words.random()

fun getHiddenSecret(wordLength: Int): String = List(wordLength) { underscore }.joinToString(separator)

fun isCorrectInput(userInput: String): Boolean {
    var b = true
    if (userInput.length != 1) {
        println("The length of your guess should be 1! Try again!")
        b = false
    }
    for (i in userInput) if (!i.isLetter()) {
        println("You should input only English letters! Try again!")
        b = false
        break
    }
    return b
}

fun safeUserInput(): Char {
    println("Please input your guess.")
    var guess = safeReadLine()
    while (!isCorrectInput(guess)) guess = safeReadLine()
    return guess.uppercase().single()
}

fun getRoundResults(secret: String, guess: Char, currentUserWord: String): String {
    val result = if (guess !in secret) {
        println("Sorry, the secret does not contain the symbol: $guess. The current word is $currentUserWord")
        currentUserWord
    } else {
        val newWord = generateNewUserWord(secret, guess, currentUserWord)
        println("Great! This letter is in the word! The current word is $newWord")
        newWord
    }
    return result
}

fun playGame(secret: String, maxAttemptsCount: Int): Unit {
    var complete: Boolean
    var attempts = 0
    do {
        val guess = safeUserInput()
        getRoundResults(secret, guess, getHiddenSecret(wordLength))
        complete = isComplete(secret, guess.toString())
        attempts++
        if (isLost(complete, attempts, maxAttemptsCount)) {
            println("Sorry, you lost! My word is $secret")
            break
        } else if (isWon(complete, attempts, maxAttemptsCount)) {
            println("Congratulations! You guessed it!")
        }
    } while (!complete)
}
fun main() {
    println(getGameRules(wordLength, maxAttemptsCount))
    playGame(generateSecret(), maxAttemptsCount)
}
