fun main() {
    val likes: Int = 142
    val result = if (likes.toString().last()=='1') "человеку" else "людям"
    println("Понравилось $likes $result")
}