Если вам нужно выполнить несколько действий при работе с `nullable` значением, вы можете использовать оператор безопасного вызова (`?.`) вместе с функцией области видимости [`let`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/let.html) из стандартной библиотеки:
```kotlin
fun foo(x: String?): String {
    x?.let {
        println("x не является null!")
        return x
    }
    return ""
}
```
или
```kotlin
fun foo(x: String?): String {
    x?.let {
        println("x не является null!")
        return it
    }
    return ""
}
```

Этот код эквивалентен следующему:
```kotlin
fun foo(x: String?): String {
    if (x != null) {
        println("x не является null!")
        return x
    }
    return ""
}
```