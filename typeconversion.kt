// Type Converstion in Kotlin


fun main(){
    // Int -> Long
    val x1: Int = 5
    val y1: Long = x1.toLong()
    println(y1)


    var x2: Int = 5
    var y2: Byte = x2.toByte()
    println(y2)


    var x3: Int = 5
    var y3: Short = x3.toShort()
    println(y3)


    var x4: Int = 5
    var y4: Float = x4.toFloat()
    println(y4)


    var x5: Int = 5
    var y5: Double = x5.toDouble()
    println(y5)


    var x6: Long = 5
    var y6: Int = x6.toInt()
    println(y6)


    val x7: Int = 5
    val y7: Char = x7.toChar()
    println(y7)
}