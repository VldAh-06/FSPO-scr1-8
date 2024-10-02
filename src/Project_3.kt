import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)

    // 1. Определить максимальное из трех введенных чисел
    println("Введите три числа:")
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()

    val maxNum = maxOf(num1, num2, num3)
    println("Максимальное число: $maxNum")

    // 2. Найти среднее число среди трех
    if (num1 == num2 || num2 == num3 || num1 == num3) {
        println("Ошибка: есть равные числа")
    } else {
        val middleNum = listOf(num1, num2, num3).sorted()[1]
        println("Среднее число: $middleNum")
    }

    // 3. Из двух чисел с разной четностью вывести нечетное
    println("\nВведите два числа с разной четностью:")
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    if (a % 2 != b % 2) {
        val oddNum = if (a % 2 != 0) a else b
        println("Нечетное число: $oddNum")
    } else {
        println("Ошибка: оба числа имеют одинаковую четность")
    }

    // 4. Проверить кратность первого числа второму
    println("\nВведите два числа (первое должно быть больше второго):")
    val bigger = scanner.nextInt()
    val smaller = scanner.nextInt()

    if (bigger % smaller == 0) {
        println("$bigger кратно $smaller")
    } else {
        val remainder = bigger % smaller
        println("$bigger не кратно $smaller, остаток: $remainder")
    }

    // 5. Проверить, может ли существовать треугольник с введенными сторонами
    println("\nВведите три стороны предполагаемого треугольника:")
    val side1 = scanner.nextInt()
    val side2 = scanner.nextInt()
    val side3 = scanner.nextInt()

    if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
        println("Треугольник может существовать")
    } else {
        println("Треугольник не может существовать")
    }

    // 6. Определить високосный год или нет
    println("\nВведите год:")
    val year = scanner.nextInt()

    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    val daysInYear = if (isLeapYear) 366 else 365
    println("Год $year ${if (isLeapYear) "високосный" else "не високосный"}, в нем $daysInYear дней")

    // 7. Сравнить два вещественных числа
    println("\nВведите два вещественных числа:")
    val numA = scanner.nextDouble()
    val numB = scanner.nextDouble()

    println("Большее число: ${maxOf(numA, numB)}")
    println("Меньшее число: ${minOf(numA, numB)}")

    // 8. Сравнить расстояния в километрах и футах
    println("\nВведите расстояние в километрах:")
    val distanceKm = scanner.nextDouble()
    println("Введите расстояние в футах (1 фут = 0.305 м):")
    val distanceFeet = scanner.nextDouble() * 0.305

    if (distanceKm * 1000 > distanceFeet) {
        println("Расстояние в километрах больше")
    } else {
        println("Расстояние в футах больше")
    }

    // 9. Проверить, делится ли m на n нацело
    println("\nВведите два целых числа m и n:")
    val m = scanner.nextInt()
    val n = scanner.nextInt()

    if (m % n == 0) {
        println("Частное от деления m на n: ${m / n}")
    } else {
        println("m на n нацело не делится")
    }

    // 10. Проверить, является ли число a делителем числа b
    println("\nВведите два числа a и b:")
    val aNum = scanner.nextInt()
    val bNum = scanner.nextInt()

    if (bNum % aNum == 0) {
        println("$aNum является делителем $bNum")
    } else {
        println("$aNum не является делителем $bNum")
    }

    // 11. Определить четность числа и оканчивается ли на 7
    println("\nВведите натуральное число:")
    val naturalNum = scanner.nextInt()

    println("Число ${if (naturalNum % 2 == 0) "четное" else "нечетное"}")
    println("Число ${if (naturalNum % 10 == 7) "оканчивается на 7" else "не оканчивается на 7"}")

    // 12. Операции с двузначным числом
    println("\nВведите двузначное число:")
    val twoDigitNum = scanner.nextInt()

    val firstDigit = twoDigitNum / 10
    val secondDigit = twoDigitNum % 10

    if (firstDigit > secondDigit) {
        println("Первая цифра больше второй")
    } else if (secondDigit > firstDigit) {
        println("Вторая цифра больше первой")
    } else {
        println("Цифры одинаковы")
    }

    // 13. Операции с четырехзначным числом
    println("\nВведите четырехзначное число:")
    val fourDigitNum = scanner.nextInt()

    val sumFirstTwo = (fourDigitNum / 1000) + (fourDigitNum / 100 % 10)
    val sumLastTwo = (fourDigitNum / 10 % 10) + (fourDigitNum % 10)

    val digitsProduct = (fourDigitNum / 1000) * (fourDigitNum / 100 % 10) * (fourDigitNum / 10 % 10) * (fourDigitNum % 10)

    println("Сумма первых двух цифр ${if (sumFirstTwo == sumLastTwo) "равна" else "не равна"} сумме двух последних цифр")
    println("Сумма цифр ${if ((sumFirstTwo + sumLastTwo) % 3 == 0) "кратна 3" else "не кратна 3"}")
    println("Произведение цифр ${if (digitsProduct % 4 == 0) "кратно 4" else "не кратно 4"}")

    println("Введите число a для проверки кратности произведения цифр числу a:")
    val aForCheck = scanner.nextInt()
    println("Произведение цифр ${if (digitsProduct % aForCheck == 0) "кратно числу a" else "не кратно числу a"}")
}