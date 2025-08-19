Выражение `when` полезно для обработки крайних случаев. Например, вы можете просто завершить выполнение программы и сообщить пользователю об ошибках. Вы можете достичь этого, используя функцию [`error`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/error.html):
```kotlin
fun checkNumber(x: Int): Int {
    return when (x) {
        0 -> { x + 5 }
        10 -> { x - 5 }
        else -> error("Unexpected number")
    }
}
```