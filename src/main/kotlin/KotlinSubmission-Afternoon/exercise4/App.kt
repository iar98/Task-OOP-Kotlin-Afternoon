package id.infinitelearning.KotlinSubmission.exercise4

// import
import Utils.exercise4.Tools.ListGroupData
fun main() {
    tryAndCatch(2)
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
fun tryAndCatch(number: Int) {
        val list = ListGroupData().groups

        try {
            println(list[number])
        } catch (e: IndexOutOfBoundsException) {
            println("Data tidak di temukan")
        }
}