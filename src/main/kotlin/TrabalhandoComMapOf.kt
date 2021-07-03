fun main() {
    val pair: Pair<String, Double> = Pair("João", 2000.0)
    val map1 = mapOf(pair)

    map1.forEach { (key, value) -> println("Chave: $key\nValor: %.2f\n".format(value)) }

    val map2 = mapOf(
        "Dênis" to 2500.0,
        "Patricia" to 3500.0
    )
    map2.forEach {(key, value) -> println("Key: $key\nValue: %.2f\n".format(value))}
}