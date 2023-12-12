object prime{
  def main(args: Array[String]): Unit={
    val a=scala.io.StdIn.readInt()
    var c=0
    var n=1
    do
    {
     if(a%n==0)
     c=c+1
     n=n+1
    }
    while(a<=n)
    
    if(c==2)
    print("Prime")
    else
    print("Not Prime")
  }
}