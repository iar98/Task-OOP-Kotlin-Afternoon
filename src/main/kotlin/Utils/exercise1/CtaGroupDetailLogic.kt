package Utils.exercise1

class GroupDetailLogic(val groupId: String, val groups: List<Any>) {
    fun showGroupDetails(sessionName: String) {
        for (group in groups) {
            if (group is List<*>) {
                val currentSessionName = group[0] as? String
                if (currentSessionName == sessionName) {
                    val groupMembers = group[1] as? List<String>

                    if (currentSessionName != null && groupMembers != null) {
                        val result = StringBuilder()
                        result.append("Group ID: $groupId\n")
                        result.append("Group Members:\n")
                        for (member in groupMembers) {
                            result.append("- $member\n")
                        }
                        result.append("Session: $currentSessionName\n")

                        println(result.toString())
                        return
                    }
                }
            }
        }
        println("Session not found: $sessionName")
    }
}
