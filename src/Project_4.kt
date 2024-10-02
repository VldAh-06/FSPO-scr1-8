import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // 1. Определить день недели по номеру
    println("Введите номер дня недели (1-7):")
    when (scanner.nextInt()) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Некорректный номер дня недели")
    }

    // 2. Определить тип треугольника по длинам сторон
    println("\nВведите длины трех сторон треугольника:")
    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()

    if (a == b && b == c) {
        println("Треугольник равносторонний")
    } else if (a == b || b == c || a == c) {
        println("Треугольник равнобедренный")
    } else {
        println("Треугольник разносторонний")
    }

    // 3. Вывод оценок по числовым значениям
    println("\nВведите числовую оценку (1-5):")
    when (scanner.nextInt()) {
        5 -> println("Отлично")
        4 -> println("Хорошо")
        3 -> println("Удовлетворительно")
        2 -> println("Неудовлетворительно")
        1 -> println("Плохо")
        else -> println("Некорректная оценка")
    }

    // 4. Определение времени суток
    println("\nВведите час (0-23):")
    when (val hour = scanner.nextInt()) {
        in 0..5 -> println("Ночь")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..23 -> println("Вечер")
        else -> println("Некорректное время")
    }

    // 5. Определить знак числа
    println("\nВведите число:")
    val number = scanner.nextDouble()
    when {
        number > 0 -> println("Число положительное")
        number < 0 -> println("Число отрицательное")
        else -> println("Число равно нулю")
    }

    // 6. Угадай число
    val secretNumber = 7 // Задумано число 7
    println("\nУгадайте число от 1 до 10:")
    val guess = scanner.nextInt()
    if (guess == secretNumber) {
        println("Поздравляю, вы угадали!")
    } else {
        println("Неправильно! Задумано число: $secretNumber")
    }

    // 7. Определение длины строки
    println("\nВведите строку:")
    val inputString = scanner.next()
    println("Длина строки: ${inputString.length}")

    // 8. Определить время приготовления по типу пищи
    println("\nВведите тип пищи (1 - Рис, 2 - Мясо, 3 - Овощи):")
    when (scanner.nextInt()) {
        1 -> println("Время приготовления: 20 минут")
        2 -> println("Время приготовления: 45 минут")
        3 -> println("Время приготовления: 15 минут")
        else -> println("Неизвестный тип пищи")
    }

    // 9. Определение длины строки
    // (Уже была задача под номером 7, выполнена ранее)

    // 10. Способы оплаты
    println("\nВыберите способ оплаты (наличные, кредитная карта, PayPal):")
    when (scanner.next().lowercase()) {
        "наличные" -> println("Вы выбрали оплату наличными")
        "кредитная карта" -> println("Вы выбрали оплату кредитной картой")
        "paypal" -> println("Вы выбрали оплату через PayPal")
        else -> println("Неверный способ оплаты")
    }

    // 11. Группа крови
    println("\nВведите группу крови (A, B, AB, O):")
    when (scanner.next().uppercase()) {
        "A" -> println("Вам можно переливать кровь от групп A и O")
        "B" -> println("Вам можно переливать кровь от групп B и O")
        "AB" -> println("Вам можно переливать кровь от групп A, B, AB и O")
        "O" -> println("Вам можно переливать кровь только от группы O")
        else -> println("Некорректная группа крови")
    }

    // 12. Национальности
    println("\nВведите страну (США, Россия, Япония):")
    when (scanner.next().lowercase()) {
        "сша" -> println("Национальность: американец")
        "россия" -> println("Национальность: русский")
        "япония" -> println("Национальность: японец")
        else -> println("Неизвестная страна")
    }

    // 13. Коды ошибок
    println("\nВведите код ошибки (100, 200, 300):")
    when (scanner.nextInt()) {
        100 -> println("Ошибка сети")
        200 -> println("Ошибка сервера")
        300 -> println("Ошибка клиента")
        else -> println("Неизвестный код ошибки")
    }
}