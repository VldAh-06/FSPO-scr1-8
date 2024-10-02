class Project_8 {
    fun main() {
        // Примеры использования функций
        println(sumOfList(listOf(1, 2, 3))) // 6
        println(differenceMaxMin(listOf(1, 5, 9))) // 8
        println(mergeLists(listOf(1, 2), listOf(3, 4))) // [1, 2, 3, 4]
        println(checkProbability(0.5, 100.0, 30.0)) // true
        println(isSumLessThan100(50, 30)) // true
        println(isDivisibleBy100(200)) // true
        println(calculateFrames(5, 30)) // 9000
        println(checkKPowerN(3, 27)) // false
        println(repetition("ab", 3)) // ababab
        println(equation("1+2+3")) // 6
        println(google(3)) // Goooogle
        greeting() // Привет, мир!
        println(sumTwoNumbers(5, 7)) // 12
        println(maxOfTwo(10, 20)) // 20
        println(isEven(10)) // true
        println(factorial(5)) // 120
        println(isPrime(7)) // true
        println(sumArray(arrayOf(1, 2, 3))) // 6
        println(maxInArray(arrayOf(10, 20, 30))) // 30
        println(sortArray(arrayOf(3, 1, 2)).contentToString()) // [1, 2, 3]
        println(isPalindrome("racecar")) // true
        println(countCharacters("hello")) // 5
        println(toUpperCase("hello")) // HELLO
        println(concatStrings("hello", " world")) // hello world
        println(lastElement(arrayOf(1, 2, 3))) // 3
        println(containsElement(arrayOf(1, 2, 3), 2)) // true
        println(createArray(5).contentToString()) // [1, 2, 3, 4, 5]
        println(minMax(arrayOf(1, 2, 3))) // (1, 3)
        println(sumFrom1ToN(5)) // 15
        println(celsiusToFahrenheit(30.0)) // 86.0
        println(reverseString("hello")) // olleh
        println(elementAtIndex(arrayOf(1, 2, 3), 1)) // 2
        println(removeSpaces("h e l l o")) // hello
        println(sumOfFirstNNumbers(5)) // 15
        println(containsSubstring("hello world", "world")) // true
        multiplicationTable(5) // выводит таблицу умножения для числа 5
        println(stringLength("hello")) // 5
        println(reverseArray(arrayOf(1, 2, 3)).contentToString()) // [3, 2, 1]
        println(copyArray(arrayOf(1, 2, 3)).contentToString()) // [1, 2, 3]
        println(countVowels("hello")) // 2
        println(indexOfElement(arrayOf(1, 2, 3), 2)) // 1
    }

    // 1. Сумма всех элементов списка
    fun sumOfList(numbers: List<Int>): Int = numbers.sum()

    // 2. Разность самого большого и самого маленького числа в списке
    fun differenceMaxMin(numbers: List<Int>): Int = numbers.maxOrNull()!! - numbers.minOrNull()!!

    // 3. Объединение двух списков целых чисел
    fun mergeLists(list1: List<Int>, list2: List<Int>): List<Int> = list1 + list2

    // 4. Проверка, что prob * prize > pay
    fun checkProbability(prob: Double, prize: Double, pay: Double): Boolean = prob * prize > pay

    // 5. Сумма двух чисел меньше 100
    fun isSumLessThan100(num1: Int, num2: Int): Boolean = (num1 + num2) < 100

    // 6. Проверка, делится ли число на 100
    fun isDivisibleBy100(number: Int): Boolean = number % 100 == 0

    // 7. Количество кадров за время при FPS
    fun calculateFrames(minutes: Int, fps: Int): Int = minutes * 60 * fps

    // 8. Проверка, что k^k == n
    fun checkKPowerN(k: Int, n: Int): Boolean = Math.pow(k.toDouble(), k.toDouble()).toInt() == n

    // 9. Рекурсивное повторение строки
    fun repetition(txt: String, n: Int): String = if (n <= 0) "" else txt + repetition(txt, n - 1)

    // 10. Решение уравнения
    fun equation(expr: String): Int = expr.split('+').sumOf { it.toInt() }

    // 11. Генерация строки Google с определенным числом 'o'
    fun google(number: Int): String = "G" + "o".repeat(number) + "gle"

    // 12. Приветствие "Привет, мир!"
    fun greeting() = println("Привет, мир!")

    // 13. Сумма двух чисел
    fun sumTwoNumbers(a: Int, b: Int): Int = a + b

    // 14. Возвращение большего из двух чисел
    fun maxOfTwo(a: Int, b: Int): Int = if (a > b) a else b

    // 15. Проверка четности числа
    fun isEven(num: Int): Boolean = num % 2 == 0

    // 16. Факториал числа
    fun factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

    // 17. Проверка на простое число
    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }

    // 18. Сумма чисел в массиве
    fun sumArray(arr: Array<Int>): Int = arr.sum()

    // 19. Нахождение наибольшего числа в массиве
    fun maxInArray(arr: Array<Int>): Int = arr.maxOrNull() ?: throw IllegalArgumentException("Array is empty")

    // 20. Сортировка массива
    fun sortArray(arr: Array<Int>): Array<Int> = arr.sortedArray()

    // 21. Проверка, является ли строка палиндромом
    fun isPalindrome(str: String): Boolean = str == str.reversed()

    // 22. Количество символов в строке
    fun countCharacters(str: String): Int = str.length

    // 23. Преобразование строки в верхний регистр
    fun toUpperCase(str: String): String = str.uppercase()

    // 24. Объединение двух строк
    fun concatStrings(str1: String, str2: String): String = str1 + str2

    // 25. Возвращение последнего элемента массива
    fun lastElement(arr: Array<Int>): Int = arr.last()

    // 26. Проверка наличия элемента в массиве
    fun containsElement(arr: Array<Int>, elem: Int): Boolean = arr.contains(elem)

    // 27. Создание массива от 1 до N
    fun createArray(n: Int): Array<Int> = Array(n) { it + 1 }

    // 28. Нахождение максимального и минимального значений массива
    fun minMax(arr: Array<Int>): Pair<Int, Int> = Pair(arr.minOrNull() ?: 0, arr.maxOrNull() ?: 0)

    // 29. Сумма чисел от 1 до N
    fun sumFrom1ToN(n: Int): Int = (1..n).sum()

    // 30. Преобразование температуры из Цельсия в Фаренгейт
    fun celsiusToFahrenheit(celsius: Double): Double = celsius * 9 / 5 + 32

    // 31. Обратный порядок строки
    fun reverseString(str: String): String = str.reversed()

    // 32. Поиск элемента по индексу в массиве
    fun elementAtIndex(arr: Array<Int>, index: Int): Int = arr.getOrElse(index) { throw IndexOutOfBoundsException() }

    // 33. Удаление пробелов из строки
    fun removeSpaces(str: String): String = str.replace(" ", "")

    // 34. Сумма первых N натуральных чисел
    fun sumOfFirstNNumbers(n: Int): Int = (1..n).sum()

    // 35. Проверка наличия подстроки
    fun containsSubstring(str: String, sub: String): Boolean = str.contains(sub)

    // 36. Таблица умножения
    fun multiplicationTable(num: Int) {
        for (i in 1..10) {
            println("$num * $i = ${num * i}")
        }
    }

    // 37. Длина строки
    fun stringLength(str: String): Int = str.length

    // 38. Переворот массива
    fun reverseArray(arr: Array<Int>): Array<Int> = arr.reversedArray()

    // 39. Копирование массива
    fun copyArray(arr: Array<Int>): Array<Int> = arr.copyOf()

    // 40. Подсчет гласных в строке
    fun countVowels(str: String): Int {
        val vowels = "aeiouAEIOU"
        return str.count { it in vowels }
    }

    // 41. Индекс первого вхождения элемента в массиве
    fun indexOfElement(arr: Array<Int>, elem: Int): Int = arr.indexOf(elem).takeIf { it >= 0 } ?: -1
}