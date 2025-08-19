Если функция может быть выражена в [одном выражении](https://kotlinlang.org/docs/idioms.html#single-expression-functions) (одно действие в коде), ключевое слово `return`, тип возвращаемого значения и фигурные скобки могут быть опущены. Например, рассмотрим следующий код:
```kotlin
fun myName(intVariable: Int): Int {
    return intVariable + 5
}
```
Он эквивалентен:
```kotlin
fun myName(intVariable: Int) = intVariable + 5
```

Такие функции обычно помогают сделать код короче и писать в более стиле принятом в Kotlin.