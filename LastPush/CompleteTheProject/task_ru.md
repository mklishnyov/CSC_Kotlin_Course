На этом этапе вам нужно завершить приложение.

### Задание

Реализуйте функцию `applyGenerator`, которая принимает параметры `pattern`, `generatorName`, `width` и `height`,
затем обрезает `pattern`, и, наконец, применяет функции `canvasGenerator` или `canvasWithGapsGenerator`.

<div class="hint" title="Кликните, чтобы увидеть новую сигнатуру функции applyGenerator">

Сигнатура функции:
```kotlin
fun applyGenerator(pattern: String, generatorName: String, width: Int, height: Int): String
```
</div>

Возможные значения для аргумента `generatorName`:

- `canvas` – вызывает функцию `canvasGenerator`
- `canvasGaps` - вызывает функцию `canvasWithGapsGenerator`

Функция `applyGenerator` должна выбрасывать ошибку для уведомления пользователя о неожиданном имени фильтра.

<div class="hint" title="Кликните, чтобы увидеть пример проекта генератора шаблонов">

  ![Пример генератора шаблонов](../../utils/src/main/resources/images/part1/last.push/app.gif "Пример генератора шаблонов")

</div>

Также будет проверена функция `main` - просто раскомментируйте код в функции `main`.

Удачи!