class Project_6 {
    //1. Создание и вывод элементов:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        array.forEach { println(it) }
    }

    //2. Сумма элементов массива:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val sum = array.sum()
        println("Сумма элементов массива: $sum")
    }

    //3. Максимальное и минимальное значение:
    fun main() {
        val array = arrayOf(10, 5, 12, 3, 7, 1, 15, 2, 20, 8)
        val max = array.maxOrNull()
        val min = array.minOrNull()
        println("Максимум: $max, Минимум: $min")
    }

    //4. Сортировка массива
    fun main() {
        val array = arrayOf(10, 5, 12, 3, 7, 1, 15, 2, 20, 8)
        val sortedArray = array.sortedArray()
        println("Отсортированный массив: ${sortedArray.joinToString()}")
    }

    //5. Уникальные элементы:
    fun main() {
        val array = arrayOf(1, 2, 2, 3, 4, 4, 5)
        val uniqueElements = array.distinct()
        println("Уникальные элементы: ${uniqueElements.joinToString()}")
    }

    //6. Четные и нечетные числа:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val even = array.filter { it % 2 == 0 }
        val odd = array.filter { it % 2 != 0 }
        println("Четные числа: ${even.joinToString()}")
        println("Нечетные числа: ${odd.joinToString()}")
    }

    //7. Реверс массива:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val reversedArray = array.reversedArray()
        println("Реверс массива: ${reversedArray.joinToString()}")
    }

    //8. Поиск элемента:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val element = 3
        val index = array.indexOf(element)
        if (index != -1) {
            println("Элемент $element найден на индексе $index")
        } else {
            println("Элемент $element не найден")
        }
    }

    //9. Копирование массива:
    fun main() {
        val originalArray = arrayOf(1, 2, 3, 4, 5)
        val copiedArray = originalArray.copyOf()
        println("Копия массива: ${copiedArray.joinToString()}")
    }

    //10. Сумма четных чисел:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val sumEven = array.filter { it % 2 == 0 }.sum()
        println("Сумма четных чисел: $sumEven")
    }

    //11. Пересечение массивов:
    fun main() {
        val array1 = arrayOf(1, 2, 3, 4, 5)
        val array2 = arrayOf(3, 4, 5, 6, 7)
        val intersection = array1.intersect(array2.toSet())
        println("Пересечение массивов: ${intersection.joinToString()}")
    }

    //12. Перестановка элементов:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val i = 1
        val j = 3
        array[i] = array[j].also { array[j] = array[i] }
        println("Массив после перестановки: ${array.joinToString()}")
    }

    //13. Заполнение случайными числами:
    import kotlin.random.Random

    fun main() {
        val randomArray = Array(20) { Random.nextInt(1, 100) }
        println("Массив случайных чисел: ${randomArray.joinToString()}")
    }

    //14. Числа, делящиеся на 3:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 9, 12)
        val divisibleBy3 = array.filter { it % 3 == 0 }
        println("Числа, делящиеся на 3: ${divisibleBy3.joinToString()}")
    }

    //15. Проверка на палиндром:
    fun main() {
        val array = arrayOf(1, 2, 3, 2, 1)
        val isPalindrome = array.contentEquals(array.reversedArray())
        println(if (isPalindrome) "Массив является палиндромом" else "Массив не является палиндромом")
    }

    //16. Конкатенация двух массивов:
    fun main() {
        val array1 = arrayOf(1, 2, 3)
        val array2 = arrayOf(4, 5, 6)
        val concatenatedArray = array1 + array2
        println("Конкатенированный массив: ${concatenatedArray.joinToString()}")
    }

    //17. Сумма и произведение:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val sum = array.sum()
        val product = array.reduce { acc, i -> acc * i }
        println("Сумма: $sum, Произведение: $product")
    }

    //18. Группировка чисел:
    fun main() {
        val array = Array(25) { it + 1 }
        array.toList().chunked(5).forEachIndexed { index, group ->
            println("Группа ${index + 1}: ${group.joinToString()}")
        }
    }

    //19. Слияние двух отсортированных массивов:
    fun main() {
        val array1 = arrayOf(1, 3, 5, 7)
        val array2 = arrayOf(2, 4, 6, 8)
        val mergedArray = (array1 + array2).sortedArray()
        println("Слитый массив: ${mergedArray.joinToString()}")
    }

    //20. Числовая последовательность (арифметическая прогрессия):
    fun main() {
        val start = 1
        val diff = 3
        val length = 10
        val progressionArray = Array(length) { i -> start + i * diff }
        println("Арифметическая прогрессия: ${progressionArray.joinToString()}")
    }

    //21. Удаление элемента:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val elementToRemove = 3
        val newArray = array.filter { it != elementToRemove }.toTypedArray()
        println("Массив после удаления элемента $elementToRemove: ${newArray.joinToString()}")
    }

    //22. Поиск второго максимального:
    fun main() {
        val array = arrayOf(10, 5, 12, 3, 7, 1, 15, 2, 20, 8)
        val secondMax = array.sortedDescending().distinct()[1]
        println("Второй по величине элемент: $secondMax")
    }

    //23. Объединение нескольких массивов:
    fun main() {
        val array1 = arrayOf(1, 2, 3)
        val array2 = arrayOf(4, 5, 6)
        val array3 = arrayOf(7, 8, 9)
        val mergedArray = array1 + array2 + array3
        println("Объединенный массив: ${mergedArray.joinToString()}")
    }

    //24. Транспонирование матрицы:
    fun main() {
        val matrix = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
        )

        val transposed = Array(matrix[0].size) { row ->
            Array(matrix.size) { col -> matrix[col][row] }
        }

        transposed.forEach { println(it.joinToString()) }
    }

    //25. Линейный поиск:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val element = 3
        val found = array.contains(element)
        println(if (found) "Элемент найден" else "Элемент не найден")
    }

    //26. Среднее арифметическое:
    fun main() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val average = array.average()
        println("Среднее арифметическое: $average")
    }

    //27. Максимальная последовательность одинаковых элементов:
    fun main() {
        val array = arrayOf(1, 1, 2, 2, 2, 3, 3, 4)
        var maxCount = 0
        var currentCount = 1

        for (i in 1 until array.size) {
            if (array[i] == array[i - 1]) {
                currentCount++
            } else {
                maxCount = maxOf(maxCount, currentCount)
                currentCount = 1
            }
        }
        maxCount = maxOf(maxCount, currentCount)
        println("Максимальная последовательность одинаковых элементов: $maxCount")
    }

    //28. Ввод и вывод массива:
    import java.util.Scanner

    fun main() {
        val scanner = Scanner(System.`in`)
        println("Введите количество элементов массива:")
        val size = scanner.nextInt()
        val array = IntArray(size)

        println("Введите элементы массива:")
        for (i in 0 until size) {
            array[i] = scanner.nextInt()
        }

        println("Введенный массив: ${array.joinToString()}")
    }

    //29. Нахождение медианы:
    fun main() {
        val array = arrayOf(10, 5, 3, 7, 2, 8, 9)
        val sortedArray = array.sorted()
        val median = if (sortedArray.size % 2 == 1) {
            sortedArray[sortedArray.size / 2]
        } else {
            (sortedArray[sortedArray.size / 2 - 1] + sortedArray[sortedArray.size / 2]) / 2.0
        }
        println("Медиана: $median")
    }

    //30. Распределение по группам:
    fun main() {
        val array = Array(100) { it + 1 }
        array.toList().chunked(10).forEachIndexed { index, group ->
            println("Группа ${index + 1}: ${group.joinToString()}")
        }
    }
}