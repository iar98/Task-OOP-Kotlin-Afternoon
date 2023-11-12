package Utils.exercise3

import java.util.Scanner

class CtaLatihan1If {

    var number: Int = 0
    var result: String? = null
    fun countValue() {
        val scanner = Scanner(System.`in`)

        print("Masukan angka : ")
        while (!scanner.hasNextInt()) {
            print("Kata yang di masukan salah, silahkan masukan kembali angka : ")
            scanner.next()
        }
        number = scanner.nextInt()

        if (number >= 90) {
            result = "Selamat! Anda mendapatkan nilai A."
        } else if (number in 80..89) {
            result = "Anda mendapatkan nilai B."
        } else if (number in 70..79) {
            result = "Anda mendapatkan nilai C."
        } else if (number in 60..69) {
            result = "Anda mendapatkan nilai D."
        } else if (number < 60) {
            result = "Anda mendapatkan nilai E."
        }

        println(result)
    }
}