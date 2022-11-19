fun main() {
    var myNum = 4;
    var result = when (myNum){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Invalid Day"
    }
    println(result)
}