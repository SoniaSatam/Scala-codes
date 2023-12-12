object q1{
  def main(args: Array[String]): Unit={
    val a=Array("zero","one","two","three","four","five","six","seven","eight","nine")
    println("Enter a number:")
    var n=scala.io.StdIn.readInt()
    var result=""
    while(n>0)
    {
      var digit=n%10
      result=a(digit)+" "+result
      n=n/10
    }
    print(s"$result")
  }
}