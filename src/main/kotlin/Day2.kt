fun main(){
    part2()
}

fun part2(){
    val input = GetInput.getInputAsString("C:/Files/Code/AdventOfCode2020/src/main/kotlin/day2_input.txt")

    var count = 0
    input.forEach { line: String ->
        println(line)
        val password = line.split(": ")[1]
        val requirements = line.split(": ")[0]
        val letter = requirements.last()
        val index1 = requirements.split("-")[0].toInt()
        val index2 = requirements.split("-")[1].substring(0, requirements.split("-")[1].indexOf(" ")).toInt()

        println("line $line ${password} ${letter} ${index1} ${index2}")
        val s = (password[index1 - 1].toString() + password[index2 - 1].toString()).filter { it == letter }
        if (s.length == 1)
            count++
    }

    println(count)
}

fun part1(){
    val input = GetInput.getInputAsString("C:/Files/Code/AdventOfCode2020/src/main/kotlin/day2_input.txt")

    var count = 0
    input.forEach { line: String ->
        println(line)
        val password = line.split(": ")[1]
        val requirements = line.split(": ")[0]
        val letter = requirements.last()
        val minimumCount = requirements.split("-")[0].toInt()
        val maximumCount = requirements.split("-")[1].subSequence(0, requirements.split("-")[1].indexOf(" ")).toString().toInt()

        println("line $line ${password} ${letter} ${minimumCount} ${maximumCount}")

        val filtered: String = password.filter { it == letter }
        if (filtered.length >= minimumCount && filtered.length <= maximumCount)
            count++
    }

    println(count)
}