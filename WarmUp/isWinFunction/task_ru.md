Пора реализовать функции, которые указывают, победил пользователь или проиграл. Давайте начнем с первой.

### Задание

Добавьте функцию `isWon`, которая принимает три аргумента: `complete`, `attempts` и `maxAttemptsCount` и возвращает `true` только в том случае, если пользователь угадал слово (переменная `complete` содержит `true`) **и** потратил _не более_ `maxAttemptsCount` попыток.

<div class="hint" title="Нажмите, чтобы увидеть сигнатуру функции isWon">

Сигнатура функции:
```kotlin
fun isWon(complete: Boolean, attempts: Int, maxAttemptsCount: Int): Boolean
```
</div>