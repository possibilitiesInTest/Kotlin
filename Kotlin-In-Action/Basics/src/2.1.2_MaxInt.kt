
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
    println(max(1,2))
}
// block body


fun max2(a: Int, b: Int): Int = if (a > b) a else b
// expression body

fun max3(a: Int, b: Int) = if (a > b) a else b
// expression body w.
// omitted return type