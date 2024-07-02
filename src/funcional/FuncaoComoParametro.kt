package funcional

fun calculate (x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun sum (x: Int, y: Int) = x + y

fun main() {
    val sumResult = calculate(3, 4, ::sum)
    val mulResult = calculate(3, 4) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")
}