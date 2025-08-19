Теперь мы реализуем функцию, которая строит новую строку для отображения после попытки пользователя.

### Задача

Реализуйте функцию `generateNewUserWord`, которая генерирует новую последовательность из символов подчеркивания и уже отгаданных букв, используя строку для `secret`, символ для догадки пользователя `guess` и строку для `currentUserWord`.

<div class="hint" title="Нажмите, чтобы увидеть новую сигнатуру функции generateNewUserWord">

Сигнатура функции:
```kotlin
fun generateNewUserWord(secret: String, guess: Char, currentUserWord: String): String
```
</div>

**Заметьте**, `currentUserWord` должен храниться с `separator`ами, например, `B _ N _`.

Вы можете реализовать эту функцию любым способом, но мы _рекомендуем_ изучить свойство [`indices`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/indices.html) и функцию [`removeSuffix`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/remove-suffix.html).

Если у вас возникли трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="Hint" title="Нажмите, чтобы увидеть примеры работы функции currentUserWord">

Вот несколько примеров работы функции _currentUserWord_:

- secret = `"BOOK"`, guess = `'A'`, currentUserWord = `"_ _ _ _"`, результат = `"_ _ _ _"`;
- secret = `"BOOK"`, guess = `'A'`, currentUserWord = `"_ O O _"`, результат = `"_ O O _"`;
- secret = `"BOOK"`, guess = `'A'`, currentUserWord = `"_ _ _ K"`, результат = `"_ _ _ K"`;
- secret = `"BOOK"`, guess = `'B'`, currentUserWord = `"_ _ _ _"`, результат = `"B _ _ _"`;
- secret = `"BOOK"`, guess = `'B'`, currentUserWord = `"_ O O _"`, результат = `"B O O _"`;
- secret = `"BOOK"`, guess = `'K'`, currentUserWord = `"_ _ _ K"`, результат = `"_ _ _ K"`;
</div>

<div class="Hint" title="Нажмите, чтобы узнать больше о свойстве indices">

Чтобы пройтись по каждому символу в строке, вы можете использовать свойство <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/indices.html">`indices`</a>:
   ```
   for (i in "abcd".indices) { ... } // i будет 0, 1, 2, 3
   ```
То же самое, что и:
   ```
   for (i in 0 until "abcd".length) { ... } // i будет 0, 1, 2, 3
   ```

Это более удобный и краткий способ представления диапазона индексов.
</div>

<div class="Hint" title="Нажмите, чтобы узнать больше о функции removeSuffix">

Функция [`removeSuffix`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/remove-suffix.html) помогает удалить суффикс из строки:
```kotlin
println("abcdef".removeSuffix("f")) // abcde
```

Она может быть полезна, если вам нужно удалить лишние разделители с конца строки.
</div>

<div class="Hint" title="Нажмите, чтобы ознакомиться с основной идеей алгоритма">

Для реализации функции `generateNewUserWord` вам нужно просто проверить, соответствует ли каждая буква из `secret` символу `guess`. Если текущий символ `secret` совпадает с символом `guess` на той же позиции, добавьте соответствующий символ из `secret` в `newUserWord`; в противном случае добавьте символ из `currentUserWord` на позиции `i * 2`, где `i` — это позиция текущего символа.

**Также не забудьте добавлять разделитель на каждом шаге цикла, так как в результирующей строке должны быть пробелы:**
```kotlin
"${secret[i]}$separator" или "${currentUserWord[i * 2]}$separator" // ПРАВИЛЬНО

"${secret[i]}" или "${currentUserWord[i * 2]}" // НЕПРАВИЛЬНО
```

Следуя этому алгоритму, не забудьте удалить лишний пробел в конце новой строки.
</div>