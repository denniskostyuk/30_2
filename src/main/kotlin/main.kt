fun main() {
    val likes: Int = 142
    val result = if (likes.toString().last()=='1' && likes.toString().takeLast(2)!="11") "человеку" else "людям"
    println("Понравилось $likes $result")
}