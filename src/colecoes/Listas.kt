package colecoes

val systemUsers: MutableList<Int> = mutableListOf(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSystemUser(): List<Int> {
    return systemUsers
}

fun main(){
    addSystemUser(1)
    println("Tot sudoers: ${getSystemUser().size}")

    getSystemUser().forEach {
        i -> println("Some useful info on user $i")
    }
}