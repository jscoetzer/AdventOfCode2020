import java.io.File
import java.net.URL


fun main(args : Array<String>) {
    val sum: Int = 2020
    val input: List<Int> = getInput()

    for (i in 0 until input.size - 1){
        for (j in i+1 until input.size - 1){
            for (k in j+1 until input.size - 1) {
                if (input[i] + input[j] + input[k] == sum) {
                    println(input[i] * input[j] * input[k])
                }
            }
        }
    }
}

fun getInput(): List<Int>{

    val numbers = mutableListOf<Int>()
    File("C:/Files/Code/AdventOfCode2020/src/main/kotlin/day1_input.txt").forEachLine { it: String ->
        numbers.add(it.toInt())
    }

    return numbers
}

