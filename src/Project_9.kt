import kotlin.random.Random
class Project_9 {
    fun main() {
        // 1. Генератор случайных чисел
        println("Случайные числа:")
        generateRandomNumbers()

        // 2. Строковый анализатор
        println("\nСтроковый анализатор:")
        analyzeString("Пример строки для анализа.")

        // 3. Конвертер валют
        println("\nКонвертер валют:")
        val usdToEurRate = 0.85
        convertCurrency(100.0, usdToEurRate)

        // 4. Проверка на анаграмму
        println("\nПроверка на анаграмму:")
        println(areAnagrams("listen", "silent"))

        // 5. Нахождение простых чисел
        println("\nПростые числа до 30:")
        findPrimesUpTo(30)

        // 6. Сортировка строк
        println("\nСортировка строк:")
        sortStrings(arrayOf("banana", "apple", "orange"))

        // 7. Изменение регистра
        println("\nИзменение регистра:")
        changeCase("Hello, World!")

        // 8. Игра "Угадай число"
        guessTheNumber()

        // 9. Генератор паролей
        println("\nСлучайный пароль:")
        println(generatePassword(12))

        // 10. Самое длинное слово в строке
        println("\nСамое длинное слово:")
        println(longestWord("Это пример строки с несколькими словами!"))
    }

    // 1. Генератор случайных чисел
    fun generateRandomNumbers() {
        repeat(10) {
            val randomNum = Random.nextInt(1, 101)
            print("$randomNum ")
        }
    }

    // 2. Строковый анализатор
    fun analyzeString(input: String) {
        val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ"
        val consonants = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ"

        var vowelCount = 0
        var consonantCount = 0

        for (char in input) {
            when (char) {
                in vowels -> vowelCount++
                in consonants -> consonantCount++
            }
        }

        println("Гласные: $vowelCount, Согласные: $consonantCount")
    }

    // 3. Конвертер валют
    fun convertCurrency(amount: Double, rate: Double) {
        val convertedAmount = amount * rate
        println("$amount USD = $convertedAmount EUR")
    }

    // 4. Проверка на анаграмму
    fun areAnagrams(str1: String, str2: String): Boolean {
        return str1.toCharArray().sorted() == str2.toCharArray().sorted()
    }

    // 5. Нахождение простых чисел
    fun findPrimesUpTo(n: Int) {
        for (i in 2..n) {
            if (isPrime(i)) {
                print("$i ")
            }
        }
    }

    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        for (i in 2 until num) {
            if (num % i == 0) return false
        }
        return true
    }

    // 6. Сортировка строк
    fun sortStrings(strings: Array<String>) {
        val sorted = strings.sortedArray()
        println(sorted.joinToString(", "))
    }

    // 7. Изменение регистра
    fun changeCase(input: String) {
        val changed = input.map { if (it.isUpperCase()) it.lowercaseChar() else it.uppercaseChar() }.joinToString("")
        println(changed)
    }

    // 8. Игра "Угадай число"
    fun guessTheNumber() {
        val randomNumber = Random.nextInt(1, 101)

        println("Угадайте число от 1 до 100:")

        while (true) {
            val userGuess = readLine()?.toIntOrNull()

            if (userGuess == null) {
                println("Введите корректное число.")
                continue
            }

            when {
                userGuess < randomNumber -> println("Больше!")
                userGuess > randomNumber -> println("Меньше!")
                else -> {
                    println("Поздравляем! Вы угадали число!")
                    break
                }
            }
        }
    }

    // 9. Генератор паролей
    fun generatePassword(length: Int): String {
        val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9') + "!@#$%^&*()-_+=<>?"

        return (1..length)
            .map { chars.random() }
            .joinToString("")
    }

    // 10. Самое длинное слово в строке
    fun longestWord(input: String): String {
        val words = input.split("\\s+".toRegex()).map { it.replace(Regex("[^\\w]"), "") }

        return words.maxByOrNull { it.length } ?: ""
    }

}