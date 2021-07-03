fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    //for com index
    for (index in values.indices) {
        println(values[index])
    }
    println("====================")

    values.sort()
    for (value in values) {
        println(value)
    }
}