object Script {

    def faixa(x: Int, y: Int, z: Int): List[Int] = {
        if (x >= y) {
            List.empty[Int]
        } else {
            x :: faixa(x + z, y, z)
        }
}

    def main(args: Array[String]): Unit = {
        faixa(0,30,2).foreach(println)
    }
}