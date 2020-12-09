import java.io.File

class GetInput {
    companion object getInput {
        fun getInputAsInt(uri: String): List<Int> {

            val numbers = mutableListOf<Int>()
            File(uri).forEachLine { it: String ->
                numbers.add(it.toInt())
            }

            return numbers
        }

        fun getInputAsString(uri: String): List<String> {

            val s = mutableListOf<String>()
            File(uri).forEachLine { it: String ->
                s.add(it)
            }

            return s
        }
    }
}