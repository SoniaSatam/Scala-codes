import scala.io.StdIn
object speed{
  def main(args: Array[String]): Unit={
    println("Enter speed of racer 1:")
    val r1=StdIn.readInt()
    println("Enter speed of racer 2:")
    val r2=StdIn.readInt()
    println("Enter speed of racer 3:")
    val r3=StdIn.readInt()
    println("Enter speed of racer 4:")
    val r4=StdIn.readInt()
    println("Enter speed of racer 5:")
    val r5=StdIn.readInt()
    var avg=(r1+r2+r3+r4+r5)/5.0
    if(r1>avg)
    println("R1 qualified")
    if(r2>avg)
    println("R2 qualified")
    if(r3>avg)
    println("R3 qualified")
    if(r4>avg)
    println("R4 qualified")
    if(r5>avg)
    println("R5 qualified")
  }
}