object Main{
def main(args:Array[String]):Unit={
// var a:Int=scala.io.StdIn.readInt();
// var n:Int=scala.io.StdIn.readInt();
func(2,3,func2);
}
def func(a:Int,n:Int,f:(Int,Int)=>Unit):Unit={
f(a,n);
}
def func2(a:Int,n:Int):Unit={
var sum:Double=0.0;
var prod:Double=1;
var fac:Int=1;
var i:Int=1;
for(i<- 1 to n){
prod = prod*a;
fac= fac*i;
sum=sum+prod/fac;
println(sum)
}
print(sum);
}
}