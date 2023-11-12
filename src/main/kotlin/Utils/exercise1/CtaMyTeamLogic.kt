package Utils.exercise1

import Utils.exercise1.Tools.GroupData
class CtaMyTeamLogic {
    fun checkTeamMember(myName: String): List<Any> {
        // Menggunakan objek GroupData untuk mendapatkan daftar anggota group
        val groupMembers = GroupData.groups
            .flatMap { group ->
                val groupName = group.firstOrNull() ?: ""
                val members = group.getOrNull(1) as? List<String> ?: emptyList()
                members.map { it.toLowerCase() to groupName }
            }

        // Mengonversi nama yang diberikan menjadi huruf kecil
        val lowercaseName = myName.lowercase()

        // Cek apakah nama Anda ada di dalam daftar anggota group
        return if (groupMembers.any { (member, _) -> member == lowercaseName }) {
            listOf("Anggota group ada")
        } else {
            listOf("Anggota group tidak ada")
        }
    }
}