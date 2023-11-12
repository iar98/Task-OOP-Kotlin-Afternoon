package Utils.exercise1

import java.util.Scanner

class ProfileLogic {
    var namaDepan: String? = null
    var namaBelakang: String? = null
    var jawaban: String? = null
    var umur: Int = 0
    var status: Boolean = true

    fun inputProfile() {
        val scanner = Scanner(System.`in`)

        var loop = true
        while (loop) {
            // Pertanyaan
            print("Masukan Nama Depan : ")
            namaDepan = scanner.nextLine()

            print("Masukan Nama Belakang : ")
            namaBelakang = scanner.nextLine()

            print("Masukan Umur : ")
            umur = scanner.nextInt()

            print("Masukan status (single/tidak): ")
            jawaban = scanner.next()

            // Logika untuk menentukan status
            status = when (jawaban.toString().lowercase()) {
                "single" -> true
                "tidak" -> false
                else -> {
                    println("Status tidak valid, silahkan isi kembali.")
                    continue
                }
            }

            if (!validateInput()) {
                println("Data tidak valid, apakah anda ingin keluar ? (Y/N)")
                val jawaban = scanner.next()
                loop = (jawaban.equals("N", ignoreCase = true))
            } else {
                loop = false
            }
        }
    }

    private fun validateInput(): Boolean {
        // Logika validasi input
        if (namaDepan.isNullOrEmpty() || namaBelakang.isNullOrEmpty() || umur <= 0 || umur == 40 || umur > 40) {
            return false
        }

        return true
    }

    fun displayProfile() {
        println("====================")

        var error: Int = 0

        if (namaDepan == "irvan") {
            println("Applikasi Error, Terjadi kesamaan pengisian default nilai !!")
            error++
        }

        if (namaBelakang == "al rasyid") {
            println("Applikasi Error, Terjadi kesamaan pengisian default nilai!!")
            error++
        }

        if (umur > 25) {
            println("Applikasi error !! Maksimal usia 25 ")
            error++
        }

        println("""
            Total error : $error
            
            ====================
            
            Nama : $namaDepan $namaBelakang
            Umur : $umur 
            Status : $jawaban
        """.trimIndent())
    }
}