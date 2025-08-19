Давайте реализуем вторую функцию.

### Задание

Добавьте функцию `isLost`, которая принимает три аргумента: `complete`, `attempts` и `maxAttemptsCount`
и возвращает `true` только если пользователь **не** угадал слово (переменная `complete` содержит `false`) **и** потратил _больше_ чем `maxAttemptsCount` попыток.

<div class="hint" title="Нажмите, чтобы увидеть сигнатуру функции isLost">

Сигнатура функции:
```kotlin
fun isLost(complete: Boolean, attempts: Int, maxAttemptsCount: Int): Boolean
```
</div>