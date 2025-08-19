Пора применить реализованные функции и завершить игру!

### Задача

Замените функцию `safeReadLine` внутри функции `playGame` на функцию `safeUserInput`, реализованную на предыдущем шаге. Поскольку функция `safeUserInput` требует аргумент `alphabet: String`, не забудьте обновить сигнатуру функции `playGame`.

<div class="hint" title="Нажмите, чтобы увидеть новую сигнатуру функции playGame">

Сигнатура функции выглядит следующим образом:
```kotlin
fun playGame(secret: String, wordLength: Int, maxAttemptsCount: Int, alphabet: String): Unit
```
</div>

Наконец, не забудьте использовать аргумент `alphabet` в главной функции при вызове функции `playGame`.

Удачи!

<div class="hint" title="Нажмите, чтобы увидеть финальную версию игры">

![Пример игры](../../utils/src/main/resources/images/part1/warmup/game.gif "Пример игры")

</div>