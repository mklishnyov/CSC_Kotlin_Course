Выражение `if` может иметь более двух ветвей `if..else`: могут быть также промежуточные ветви:
```kotlin
if (x > 0) {
    TODO("Not implemented yet")
} else if (x == 0) {
    TODO("Not implemented yet")
}
```
Еще один пример:
```kotlin
if (x > 0) {
    TODO("Not implemented yet")
} else if (x == 0) {
    TODO("Not implemented yet")
} else if (x < 0 && x != 5) {
    TODO("Not implemented yet")
} else {
    TODO("Not implemented yet")
}
```