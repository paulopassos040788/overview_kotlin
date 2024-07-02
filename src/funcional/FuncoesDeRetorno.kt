package funcional

fun operation (): (Int) -> Int {
    return ::square
}

fun square(n: Int) = n * n

fun main(){
    val func = operation()
    println(func(2))
}