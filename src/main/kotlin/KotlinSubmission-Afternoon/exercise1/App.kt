package id.infinitelearning.KotlinSubmission.exercise1

// import
import Utils.exercise1.ProfileLogic
import Utils.exercise1.GroupDetailLogic
import Utils.exercise1.CtaMyTeamLogic
import Utils.exercise1.Tools.ArrayGroupData
import Utils.exercise1.Tools.GroupData
import Utils.exercise1.Tools.ListCostumeData

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val profileLogic = ProfileLogic()
    profileLogic.inputProfile()
    profileLogic.displayProfile()
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val groupDetailLogic = GroupDetailLogic(groupId, groupMember)
    return groupDetailLogic.showGroupDetails(session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(myName: String): List<Any> {
    val ctaMyTeamLogic = CtaMyTeamLogic()
    return ctaMyTeamLogic.checkTeamMember(myName)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    return ArrayGroupData.mentor.size + ArrayGroupData.countOfGroup.size
}

fun main() {
    // Latihan 1
//    myProfile()

    // Latihan 2
//    val coba = GroupData.groups
//    groupDetail("123", coba, "Mobile_Afternoon_A")

    // Latihan 3
//    val myTeamResultUmar = myTeam("irvan al rasyid")
//    println("My team is: $myTeamResultUmar")
//
//    val myTeamResultBudi = myTeam("budi")
//    println("My team is: $myTeamResultBudi")
//
//    val myTeamResultUnknown = myTeam("julkarnain")
//    println("My team is: $myTeamResultUnknown")

    // Latihan 4
//    val totalMember = totalMember()
//    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val test = ListCostumeData.myTeam
    groupDetail(
        "123",
        test,
        "Mobile_Afternoon_A"
    )

}