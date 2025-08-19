### 1. Что такое многострочные строки?

При работе с длинными строками наиболее удобным подходом является использование так называемых [многострочных строк](https://kotlinlang.org/docs/coding-conventions.html#strings).
В отличие от обычных строк, они заключены в тройные кавычки:
```kotlin
// Обычная строка:
val regularString = "My text"

// Многострочная строка:
val multiRowString = """
    First line of the string\n
    Second line of the string
"""
```


### 2. Функции `trimIndent` и `trimMargin`

Для удобной работы с такими строками Kotlin предоставляет две функции: [`trimIndent`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/trim-indent.html) и [`trimMargin`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/trim-margin.html).
`trimIndent` определяет наименьший общий отступ всех входных строк,
удаляет его из каждой строки, а также отбрасывает первую и последнюю строки,
если они пустые.
`trimMargin` удаляет ведущие пробелы, за которыми следует `marginPrefix`, из каждой строки исходной строки, а также удаляет
первую и последнюю строки, если они пустые.

Например, рассмотрим следующий код:
```kotlin
fun main() {
    val multiRowString = """
    *First line of the string\n
    *Second line of the string
    """
    println("______REGULAR STRING_____")
    println(multiRowString)
    println("______TRIM INDENT_____")
    println(multiRowString.trimIndent())
    println("______TRIM MARGIN WITH *_____")
    println(multiRowString.trimMargin("*"))
}
```

Вывод будет следующим:

```text
______REGULAR STRING_____

    *First line of the string\n
    *Second line of the string
    
______TRIM INDENT_____
*First line of the string\n
*Second line of the string
______TRIM MARGIN WITH *_____
First line of the string\n
Second line of the string
```

В первом случае строка будет иметь дополнительные отступы и символы.
Также каждая строка содержит символ `*`.
Во втором случае строка выглядит лучше, но в каждой строке все еще есть лишний символ.
Последний случай считается наилучшим вариантом.

Таким образом, при работе с многострочными строками такие функции являются отличной помощью.