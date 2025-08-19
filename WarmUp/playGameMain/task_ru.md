В этой задаче мы будем вызывать уже реализованные функции внутри основной функции.

### Задача

Вызовите функцию `playGame` в функции `main`.
Не забудьте использовать функцию `generateSecret` для получения секрета и передайте его в качестве аргумента функции `playGame`.

Если у вас возникнут трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="Hint" title="Нажмите здесь, чтобы узнать, как передать сгенерированный секрет в функцию playGame">

Вы можете вызвать `generateSecret` и записать вывод в переменную, или вы можете передать результат
без создания дополнительной переменной:
```kotlin
fun main() {
    val wordLength = 4
    val maxAttemptsCount = 3
    val secretExample = "ACEB"
    println(getGameRules(wordLength, maxAttemptsCount, secretExample))
    
    val secret = generateSecret()
    playGame(secret, wordLength, maxAttemptsCount)
}
```
или
```kotlin
fun main() {
    val wordLength = 4
    val maxAttemptsCount = 3
    val secretExample = "ACEB"
    println(getGameRules(wordLength, maxAttemptsCount, secretExample))
    
    playGame(generateSecret(), wordLength, maxAttemptsCount)
}
```
</div>