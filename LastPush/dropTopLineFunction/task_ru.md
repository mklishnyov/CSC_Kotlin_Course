Когда мы повторяем шаблон вертикально, нижняя граница оказывается дублированной. 
В таких случаях необходимо удалить верхнюю строку.

### Задача

Реализуйте функцию `dropTopLine`, которая принимает параметр `image` (любой строковый объект; может содержать несколько строк),
`width` нового изображения, которое должно быть создано (в строке `image` уже должно быть повторено `width` раз),
`patternHeight` и `patternWidth`. Эта функция удаляет первую строку,
например, (для `width` = 1):
```text
   .+------+                 
 .' |    .'|                .' |    .'|
+---+--+'  |    ----->     +---+--+'  |
|   |  |   |               |   |  |   |
|  ,+--+---+               |  ,+--+---+
|.'    | .'                |.'    | .' 
+------+'                  +------+'
```

<div class="hint" title="Нажмите сюда, чтобы увидеть новый сигнатуру функции getPatternHeight">

Сигнатура функции:
```kotlin
fun dropTopLine(image: String, width: Int, patternHeight: Int, patternWidth: Int): String
```
</div>

**Примечание**, эта функция должна удалять первую строку только в случае, если `patternHeight > 1`. 

Вы можете реализовать эту функцию любым возможным способом, но мы _рекомендуем_ вам обратить внимание на встроенные функции [`removeSuffix`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/remove-suffix.html) и [`drop`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/drop.html).

<div class="Hint" title="Нажмите сюда, чтобы узнать больше о встроенной функции removeSuffix">

Встроенная функция [`removeSuffix`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/remove-suffix.html) помогает
удалить строку с конца текущей строки:
```kotlin
val str = "abcdefg"
println("abcdefg".removeSuffix("fg")) // abcde
println("abcdefg".removeSuffix("a")) // abcdefg, так как начальная строка не заканчивается на "a"
```
</div>

<div class="Hint" title="Нажмите сюда, чтобы узнать больше о встроенной функции `drop`">

Встроенная функция [`drop`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/drop.html) помогает
удалить `n` символов с начала текущей строки:
```kotlin
val str = "abcdefg"
println("abcdefg".drop(1)) // bcdefg
```
</div>

Если у вас возникнут трудности, **подсказки помогут вам решить эту задачу**.

----

### Подсказки

<div class="hint" title="Нажмите сюда, чтобы увидеть несколько примеров того, как должна работать функция dropTopLine">

Первый пример:
```text
○
```
Этот код:
```kotlin
println(ball)
println("___")
val patternWidth = getPatternWidth(ball)
val patternHeight = getPatternHeight(ball)
val repeatedPattern = repeatHorizontally(ball, 1, patternWidth)
val dropped = dropTopLine(repeatedPattern, 1, patternHeight, patternWidth)
println(dropped)
```
выведет:
```text
○
```

Второй пример. Шаблон:
```text
 X
/ \
\ /
 X
```
Этот код:
```kotlin
println(rhombus)
println("___")
val patternWidth = getPatternWidth(rhombus)
val patternHeight = getPatternHeight(rhombus)
val repeatedPattern = repeatHorizontally(rhombus, 1, patternWidth)
val dropped = dropTopLine(repeatedPattern, 1, patternHeight, patternWidth)
println(dropped)
```
выведет:
```text
/ \
\ /
 X 
```
Вы могли заметить, что в этом примере мы используем уже реализованные функции. 
Эти функции помогут нам реализовать фильтры, позволяющие повторять шаблон вертикально.

</div>

<div class="hint" title="Нажмите сюда, чтобы узнать, как вычислить количество символов для удаления">

Необходимо удалить `patternWidth * width + newLineSymbol.length` символов с начала строки, так как
у вас есть строка, в которой шаблон повторяется `width` раз, а символ `newLineSymbol` в различных ОС может быть больше чем `1`.
</div>