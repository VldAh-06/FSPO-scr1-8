import java.util.Scanner
import kotlin.math.sqrt
import kotlin.random.Random

class Project_5 {

    // 1. Вывод чисел от 1 до 10
    fun printNumbers() {
        for (i in 1..10) {
            println(i)
        }
    }

    // 2. Вывод четных чисел от 1 до 20
    fun printEvenNumbers() {
        for (i in 1..20) {
            if (i % 2 == 0) println(i)
        }
    }

    // 3. Сумма чисел от 1 до N
    fun sumNumbersToN() {
        val scanner = Scanner(System.`in`)
        println("Введите число N:")
        val n = scanner.nextInt()
        val sum = (1..n).sum()
        println("Сумма от 1 до $n: $sum")
    }

    // 4. Факториал числа
    fun factorial() {
        val scanner = Scanner(System.`in`)
        println("Введите число:")
        val n = scanner.nextInt()
        var result = 1L
        for (i in 1..n) {
            result *= i
        }
        println("Факториал $n: $result")
    }

    // 5. Проверка числа на простоту
    fun isPrime() {
        val scanner = Scanner(System.`in`)
        println("Введите число:")
        val n = scanner.nextInt()
        val isPrime = (2..sqrt(n.toDouble()).toInt()).none { n % it == 0 }
        if (isPrime && n > 1) {
            println("$n - простое число")
        } else {
            println("$n - не простое число")
        }
    }

    // 6. Вывод таблицы умножения
    fun multiplicationTable() {
        for (i in 1..10) {
            for (j in 1..10) {
                print("${i * j}\t")
            }
            println()
        }
    }

    // 7. Фибоначчи
    fun fibonacci() {
        val scanner = Scanner(System.`in`)
        println("Введите число N:")
        val n = scanner.nextInt()
        var a = 0
        var b = 1
        for (i in 1..n) {
            println(a)
            val sum = a + b
            a = b
            b = sum
        }
    }

    // 8. НОД двух чисел (алгоритм Евклида)
    fun gcd() {
        val scanner = Scanner(System.`in`)
        println("Введите первое число:")
        var a = scanner.nextInt()
        println("Введите второе число:")
        var b = scanner.nextInt()
        while (b != 0) {
            val temp = b
            b = a % b
            a = temp
        }
        println("НОД: $a")
    }

    // 9. Обратный порядок строки
    fun reverseString() {
        val scanner = Scanner(System.`in`)
        println("Введите строку:")
        val input = scanner.nextLine()
        println("Реверс: ${input.reversed()}")
    }

    // 10. Сумма цифр числа
    fun sumDigits() {
        val scanner = Scanner(System.`in`)
        println("Введите число:")
        val input = scanner.nextInt()
        val sum = input.toString().map { it.toString().toInt() }.sum()
        println("Сумма цифр: $sum")
    }

    // 11. Проверка анаграммы
    fun isAnagram() {
        val scanner = Scanner(System.`in`)
        println("Введите первую строку:")
        val str1 = scanner.nextLine()
        println("Введите вторую строку:")
        val str2 = scanner.nextLine()
        val isAnagram = str1.toCharArray().sorted() == str2.toCharArray().sorted()
        println(if (isAnagram) "Анаграммы" else "Не анаграммы")
    }

    // 12. Числовая последовательность с шагом
    fun numberSequence() {
        val scanner = Scanner(System.`in`)
        println("Введите начальное число:")
        val start = scanner.nextInt()
        println("Введите шаг:")
        val step = scanner.nextInt()
        println("Введите количество элементов:")
        val n = scanner.nextInt()
        for (i in 0 until n) {
            println(start + i * step)
        }
    }

    // 13. Таблица квадратов
    fun squareTable() {
        for (i in 1..20) {
            println("$i^2 = ${i * i}")
        }
    }

    // 14. Генерация случайных чисел
    fun randomNumbers() {
        val randomNumbers = List(10) { Random.nextInt(1, 101) }
        println("Случайные числа: ${randomNumbers.joinToString()}")
    }

    // 15. Проверка палиндрома
    fun isPalindrome() {
        val scanner = Scanner(System.`in`)
        println("Введите строку:")
        val input = scanner.nextLine()
        val isPalindrome = input == input.reversed()
        println(if (isPalindrome) "Палиндром" else "Не палиндром")
    }

    // 16. Сумма квадратов от 1 до N
    fun sumOfSquares() {
        val scanner = Scanner(System.`in`)
        println("Введите число N:")
        val n = scanner.nextInt()
        val sum = (1..n).sumOf { it * it }
        println("Сумма квадратов: $sum")
    }

    // 17. Вывод символов строки
    fun printCharacters() {
        val scanner = Scanner(System.`in`)
        println("Введите строку:")
        val input = scanner.nextLine()
        input.forEach { println(it) }
    }

    // 18. Лестница из символов "#"
    fun printStaircase() {
        val scanner = Scanner(System.`in`)
        println("Введите высоту лестницы:")
        val n = scanner.nextInt()
        for (i in 1..n) {
            println("#".repeat(i))
        }
    }

    // 19. Сортировка массива двухзначных чисел
    fun sortArray() {
        val array = intArrayOf(34, 12, 78, 23, 56, 45, 67, 89)
        for (i in array.indices) {
            for (j in i + 1 until array.size) {
                if (array[i] > array[j]) {
                    val temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                }
            }
        }
        println("Отсортированный массив: ${array.joinToString()}")
    }

    // 20. Простые числа в диапазоне
    fun primeNumbersInRange() {
        val scanner = Scanner(System.`in`)
        println("Введите начало диапазона:")
        val start = scanner.nextInt()
        println("Введите конец диапазона:")
        val end = scanner.nextInt()
        for (i in start..end) {
            if ((2..sqrt(i.toDouble()).toInt()).none { i % it == 0 } && i > 1) {
                println(i)
            }
        }
    }

    // 21. Вывод всех дат месяца
    fun printDatesOfMonth() {
        val scanner = Scanner(System.`in`)
        println("Введите год:")
        val year = scanner.nextInt()
        println("Введите месяц:")
        val month = scanner.nextInt()
        val daysInMonth = when (month) {
            1, 3, 5, 7, 8, 10, 12 -> 31
            4, 6, 9, 11 -> 30
            2 -> if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 29 else 28
            else -> throw IllegalArgumentException("Некорректный месяц")
        }
        for (day in 1..daysInMonth) {
            println("$day.$month.$year")
        }
    }

    // 22. Угадай число
    fun guessTheNumber() {
        val randomNumber = Random.nextInt(1, 101)
        val scanner = Scanner(System.`in`)
        var guess: Int
        do {
            println("Угадайте число от 1 до 100:")
            guess = scanner.nextInt()
            when {
                guess < randomNumber -> println("Число больше")
                guess > randomNumber -> println("Число меньше")
                else -> println("Вы угадали!")
            }
        } while (guess != randomNumber)
    }

    // 23. Сложение и умножение с повтором
    fun repeatAdditionOrMultiplication() {
        val scanner = Scanner(System.`in`)
        var input: String
        do {
            println("Введите первое число:")
            val a = scanner.nextInt()
            println("Введите второе число:")
            val b = scanner.nextInt()
            println("Введите операцию (сложение/умножение):")
            val operation = scanner.next()
            when (operation) {
                "сложение" -> println("Результат: ${a + b}")
                "умножение" -> println("Результат: ${a * b}")
                else -> println("Некорректная операция")
            }
            println("Введите 'стоп' для завершения или продолжите:")
            input = scanner.next()
        } while (input != "стоп")
    }

    // 24. Транспонирование матрицы
    fun transposeMatrix() {
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

    // 25. Кубы чисел от 1 до 10
    fun printCubes() {
        for (i in 1..10) {
            println("$i^3 = ${i * i * i}")
        }
    }

    // 26. Сумма четных и нечетных чисел от 1 до N
    fun sumEvenOdd() {
        val scanner = Scanner(System.`in`)
        println("Введите число N:")
        val n = scanner.nextInt()
        val sumEven = (1..n).filter { it % 2 == 0 }.sum()
        val sumOdd = (1..n).filter { it % 2 != 0 }.sum()
        println("Сумма четных: $sumEven")
        println("Сумма нечетных: $sumOdd")
    }

    // 27. Пирамида из чисел
    fun printPyramid() {
        val scanner = Scanner(System.`in`)
        println("Введите число N:")
        val n = scanner.nextInt()
        for (i in 1..n) {
            for (j in 1..i) {
                print("$j ")
            }
            println()
        }
    }

    // 28. Порядок возрастания чисел
    fun sortNumbers() {
        val scanner = Scanner(System.`in`)
        println("Введите количество чисел:")
        val n = scanner.nextInt()
        val numbers = IntArray(n)
        println("Введите числа:")
        for (i in 0 until n) {
            numbers[i] = scanner.nextInt()
        }
        numbers.sort()
        println("Числа в порядке возрастания: ${numbers.joinToString()}")
    }

    // 29. Сумма ряда 1 + 1/2 + 1/3 + ... + 1/N
    fun sumOfSeries() {
        val scanner = Scanner(System.`in`)
        println("Введите число N:")
        val n = scanner.nextInt()
        val sum = (1..n).sumOf { 1.0 / it }
        println("Сумма ряда: $sum")
    }

    // 30. Конвертация числа в двоичную систему
    fun convertToBinary() {
        val scanner = Scanner(System.`in`)
        println("Введите число:")
        val number = scanner.nextInt()
        println("Двоичное представление: ${Integer.toBinaryString(number)}")
    }
}
