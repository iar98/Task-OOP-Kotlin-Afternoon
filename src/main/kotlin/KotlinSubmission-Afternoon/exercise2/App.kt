package id.infinitelearning.KotlinSubmission.exercise2

// Import
import Utils.exercise2.CtaList
import Utils.exercise2.Tools.MapOfData

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
//    val generator = CtaList()
//    generator.printNumbers()



//     Latihan 2 Map
//    Buatlah variabel bertipe Map dengan kriteria:
//    Daftar nama bulan dalam setahun,
//    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
//    - key "Jan", value January
//    - key "Feb", value February
//    - dst...
    // Buat di bawah sini
    val monthMap = MapOfData.monthMap


//    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
//    - Jan -> January
//    - Feb -> February
//    - Dst...
    // Buat di bawah sini

    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

//    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
//    - "It's {$monthNow} now, I was born in {$birthMonth}"
    // Buat di bawah sini
    println("It's ${monthMap["Nov"]} now, I was born in ${monthMap["Aug"]}")

}