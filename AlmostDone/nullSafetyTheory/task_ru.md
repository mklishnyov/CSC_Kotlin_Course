Чтобы правильно работать с такими _nullable_ значениями, Kotlin предоставляет механизм [безопасности null](https://kotlinlang.org/docs/null-safety.html). Проще говоря, в Kotlin необходимо обрабатывать `null` значения отдельно, чтобы программа работала корректно. Самые простые механизмы обработки — это операторы [`!!`](https://kotlinlang.org/docs/null-safety.html#the-operator) и [`?:`](https://kotlinlang.org/docs/null-safety.html#elvis-operator) (оператор Elvis).

### 1. Оператор `!!`

Оператор `!!` просто игнорирует значение `null` и работает с типом так, как будто значения `null` не может быть. Однако если программа сталкивается со значением `null`, она завершится с ошибкой ([`Null pointer exception`](https://kotlinlang.org/docs/null-safety.html#nullable-types-and-non-null-types), или `NPE`).
```kotlin
var a: String? = null
a!!.length // КОРРЕКТНО, но вызовет NPE
```

### 2. Оператор `Elvis` и механизм умных преобразований

Оператор `Elvis` проверяет, является ли значение `null`, и обрабатывает значение `null` отдельно.
```kotlin
var a: String? = null
a?.length ?: error("Обнаружено значение null") // КОРРЕКТНО, случай с null будет обработан отдельно
```

Последний пример с оператором Elvis эквивалентен следующему коду:
```kotlin
var a: String? = null
if (a != null) {
    a.length // Мы можем использовать просто length здесь (без ?), благодаря механизму умных преобразований
} else {
    error("Обнаружено значение null")
}
```

В этом примере мы отметили [механизм умных преобразований](https://kotlinlang.org/docs/typecasts.html#smart-casts). Это специальный механизм в Kotlin, который может определить определённые случаи, когда nullable значение всегда является не-null.