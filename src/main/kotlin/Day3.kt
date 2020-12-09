fun main(){
    val input = GetInput.getInputAsString("C:/Files/Code/AdventOfCode2020/src/main/kotlin/day3_input.txt")
    part1(input)
}

fun part1(input: List<String>){

    val maximumX = input[0].length
    val maximumY = input.size - 1
    val verticalChange: Int = 1
    val horizontalChange: Int = 3

    var x: Int = 0
    var y: Int = 0

    var treeCount = 0

    while(y < maximumY){
        x += horizontalChange
        y += verticalChange
        if (x >= maximumX){
            x %= maximumX
        }
        if (input[y].get(x) == '#'){
            treeCount++
        }
    }

    println(treeCount)
}