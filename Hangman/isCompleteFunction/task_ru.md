Пришло время попрактиковаться! Давайте начнем с простой функции.

### Задание

Реализуйте функцию `isComplete`, которая принимает два строковых аргумента - `secret` и `currentGuess`, 
и проверяет, завершена ли игра. Игра считается завершенной только тогда, когда `secret` и `currentGuess` равны.

<div class="hint" title="Нажмите здесь, чтобы увидеть новую сигнатуру функции isComplete">

Сигнатура функции:
```kotlin
fun isComplete(secret: String, currentGuess: String): Boolean
```
</div>

**Обратите внимание**, что `currentGuess` содержит пробелы между буквами. 
Таким образом, просто сравнить `secret` и `currentGuess` недостаточно.
Сначала вам нужно удалить все пробелы из `currentGuess`.

Вы также можете использовать уже определенную переменную `separator`, которая хранит пробел:
```kotlin
println("Это значение из переменной separator: $separator.") // Это значение из переменной separator:  .
```

Если у вас возникнут трудности, **подсказки помогут вам решить это задание**.

----

### Подсказки

<div class="Hint" title="Нажмите здесь, чтобы увидеть примеры работы функции isComplete">

Вот несколько примеров работы функции _isComplete_:

- secret = "ABC", currentGuess = "A B C", result = true;
- secret = "ABC", currentGuess = "A B B", result = false;
- secret = "ABC", currentGuess = "A A A", result = false;
</div>

<div class="Hint" title="Нажмите здесь, чтобы узнать, как убрать пробелы в текущем предположении пользователя">

Самый простой способ удалить `separator` из `currentGuess` — использовать встроенную функцию [`replace`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/replace.html):
```kotlin
println("aabbccdd".replace("a", "e")) // eebbccdd
```
В этом задании вы можете просто заменить `separator` на пустую строку `"""`.
</div>