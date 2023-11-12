package Utils.exercise2

class CtaList {
    // Inisialisasi list untuk menampung bilangan genap
    private val evenNumbers = mutableListOf<Int>()

    init {
        // Mengisi list dengan bilangan genap dari 1 hingga 100 menggunakan for loop dan if statement
        for (i in 1..100) {
            if (i % 2 == 0) {
                evenNumbers.add(i)
            }
        }
    }

    fun printNumbers() {
        // Menampilkan list bilangan genap
        println("List bilangan genap dari 1 hingga 100:")
        for (i in evenNumbers.indices) {
            print("${evenNumbers[i]} ")
            if ((i + 1) % 5 == 0) {
                println()
            }
        }
    }
}