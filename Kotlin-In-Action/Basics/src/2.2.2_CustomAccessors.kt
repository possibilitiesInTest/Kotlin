class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
//    get() {
//        return height == width
//    }
    get() = height == width
}

val rectangle = Rectangle(41, 43)

fun main(args: Array<String>){
    println(rectangle.isSquare)
}
