object stringinterploation{
  def main(args: Array[String]): Unit={
    println("Enter a name:")
    val s=scala.io.StdIn.readLine()
    println("Enter age:")
    val age=scala.io.StdIn.readInt()
    println(s"My name is $s and I am $age years old")
  }
}