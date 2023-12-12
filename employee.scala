import scala.io.StdIn

class Employee{
  private var empid: Int =_
  private var empname: String = _
  private var designation: String=_
  private var salary: Double=_
  
  def getEmployee(): Unit={
    print("Enter Employee ID:")
    empid=StdIn.readInt()
    print("Enter employee name")
    empname=StdIn.readLine()
    print("Enter designation: ")
    designation=StdIn.readLine()
    print("Enter salary: ")
    salary=StdIn.readDouble()
  }
  def showGrade(): Unit={
    val grade=
    if (salary>=50000) "A"
    else if(salary>=25000 && salary<=49999) "B"
    else if(salary>=10000 && salary<=24999) "C"
    else "D"
    
    print(s"Garde of the employee: $grade")
  }
  def showEmployee(): Unit={
    println(s"Employee ID:$empid")
    println(s"Employee designation:$designation")
  }
}
object EmployeeApp{
  def main(args: Array[String]): Unit={
    var employee=new Employee
    employee.getEmployee()
    employee.showEmployee()
    employee.showGrade()
  }
}