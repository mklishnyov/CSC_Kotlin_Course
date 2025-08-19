В этом задании мы реализуем функцию `countExactMatches`.

### Задание

Реализуйте функцию _countExactMatches_. 
Даны `guess` и `secret`, функция должна выводить количество 
букв, которые точно совпадают по позиции.

Вы можете реализовать эту функцию любым возможным способом, но мы _рекомендуем_ ознакомиться с встроенной функцией `filterIndexed`.

<div class="Hint" title="Кликните, чтобы узнать больше о встроенной функции filterIndexed">

Kotlin содержит множество встроенных функций: например, можно фильтровать и управлять не только элементами списка, но и их индексами.
Например, даны два слова, и нужно создать новое слово, которое состоит из символов, находящихся в обоих словах на тех же позициях.
Классический способ:
```kotlin
val secondWord = "AACAAA"
var result = ""
for ((index, symbol) in "ABCDDD".withIndex()) {
   if (secondWord[index] == symbol) {
      result += symbol
   }
}
// Результат будет: "AC"
```

Но мы также можем использовать функцию [`filterIndexed`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html) для сокращения кода:
```kotlin
val secondWord = "AACAAA"
// Результат будет: "AC"
"ABCDDD".filterIndexed { index, symbol -> secondWord[index] == symbol }
```

Кстати, в этом случае лямбда-выражение принимает два аргумента, поэтому мы используем собственные имена для аргументов (`index` и `symbol`), а не `it`.
</div>

Если у вас возникнут трудности, **подсказки помогут вам решить это задание**.

----

### Подсказки

<div class="Hint" title="Кликните, чтобы увидеть примеры работы функции `countExactMatches`">

Вот несколько примеров работы функции _countExactMatches_:

- guess = "ACEB", secret = "BCDF", результат = 1;
- guess = "ABCD", secret = "DCBA", результат = 0;
- guess = "AAAA", secret = "ABBB", результат = 1;
- guess = "BBBB", secret = "BBDH", результат = 2.
</div>

<div class="Hint" title="Кликните, чтобы узнать основную идею алгоритма">

Основная идея алгоритма заключается в том, чтобы сохранить только те буквы, которые равны и имеют одинаковый индекс. 
Затем можно просто вернуть количество этих букв.
Чтобы найти количество точных совпадений, вы можете использовать функцию <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/filter-indexed.html"><code>filterIndexed</code></a>.
</div>

<div class="Hint" title="Кликните, чтобы узнать, как получить количество элементов в списке">

Чтобы получить количество символов в слове, вы можете использовать <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/length.html#length"><code>length</code></a>:
`"ABCDDD".length` вернет `6`, так как строка содержит `6` букв.  
</div>