
object Script {
    import Math.sqrt
    def main(args: Array[String]): Unit = {
        val set = {for i <- 1 to 100 if (i%2 ==0) yield i}
        println(set)
    }
}