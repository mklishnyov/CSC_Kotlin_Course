При работе с многострочными строками, вы можете разбить их на строки и обработать каждую отдельно. Это можно сделать с помощью функции [`lines`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/lines.html): 
```kotlin
"""First line
Second line
""".lines()
```
Строка будет преобразована в список из двух строк: `First line` и `Second line`.

Эта функция лучше, чем `split`, так как она учитывает символы новой строки разных операционных систем:

```kotlin
"""First line
Second line
""".lines() // работает на всех ОС
```
В сравнении с
```kotlin
"""First line
Second line
""".split("\n") // не работает на Windows
```