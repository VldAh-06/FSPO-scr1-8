class Project_7 {
    import java.util.Scanner

    fun main() {
        val scanner = Scanner(System.`in`)

        while (true) {
            println("Выберите действие:")
            println("1. Консольный калькулятор")
            println("2. Найти палиндром слова")
            println("3. Подсчет очков команды")
            println("4. Найти самое маленькое число из списка")
            println("5. Проверить равенство двух чисел")
            println("6. Карточная игра 21")
            println("0. Выход")
            when (scanner.nextInt()) {
                1 -> calculator(scanner)
                2 -> palindromeCheck(scanner)
                3 -> calculateTeamPoints(scanner)
                4 -> findSmallestNumber(scanner)
                5 -> checkEquality(scanner)
                6 -> play21(scanner)
                0 -> {
                    println("Выход...")
                    break
                }
                else -> println("Неверный выбор. Попробуйте еще раз.")
            }
        }
    }

    // 1. Консольный калькулятор
    fun calculator(scanner: Scanner) {
        println("Введите первое число:")
        val num1 = scanner.nextDouble()
        println("Введите операцию (+, -, *, /):")
        val operation = scanner.next()
        println("Введите второе число:")
        val num2 = scanner.nextDouble()

        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else {
                println("Деление на ноль!")
                return
            }
            else -> {
                println("Неверная операция!")
                return
            }
        }
        println("Результат: $result")
    }

    // 2. Проверка палиндрома
    fun palindromeCheck(scanner: Scanner) {
        println("Введите слово:")
        val word = scanner.next()
        val isPalindrome = word == word.reversed()
        if (isPalindrome) {
            println("$word является палиндромом.")
        } else {
            println("$word не является палиндромом.")
        }
    }

    // 3. Подсчет очков команды
    fun calculateTeamPoints(scanner: Scanner) {
        println("Введите количество побед:")
        val wins = scanner.nextInt()
        println("Введите количество ничьих:")
        val draws = scanner.nextInt()
        println("Введите количество поражений:")
        val losses = scanner.nextInt()

        val totalPoints = wins * 3 + draws * 1 + losses * 0
        println("Команда набрала $totalPoints очков.")
    }

    // 4. Нахождение минимального числа в списке
    fun findSmallestNumber(scanner: Scanner) {
        println("Введите количество чисел:")
        val size = scanner.nextInt()
        if (size <= 0) {
            println("Неверный ввод!")
            return
        }

        val numbers = mutableListOf<Int>()
        println("Введите числа:")
        for (i in 1..size) {
            numbers.add(scanner.nextInt())
        }

        val smallestNumber = numbers.minOrNull()
        println("Самое маленькое число: $smallestNumber")
    }

    // 5. Проверка равенства двух чисел
    fun checkEquality(scanner: Scanner) {
        println("Введите первое число:")
        val num1 = scanner.nextDouble()
        println("Введите второе число:")
        val num2 = scanner.nextDouble()

        if (num1 == num2) {
            println("Числа равны.")
        } else {
            println("Числа не равны.")
        }
    }

    // 6. Карточная игра "21"
    fun play21(scanner: Scanner) {
        var total = 0
        val random = java.util.Random()

        while (total < 21) {
            val card = random.nextInt(10) + 1
            println("Вам выпала карта: $card")
            total += card
            println("Текущая сумма очков: $total")

            if (total >= 21) break

            println("Хотите взять еще карту? (y/n)")
            val answer = scanner.next()
            if (answer != "y") break
        }

        if (total == 21) {
            println("Поздравляю, вы набрали 21!")
        } else if (total > 21) {
            println("Вы проиграли, сумма больше 21!")
        } else {
            println("Игра окончена. Ваш результат: $total")
        }
    }
}