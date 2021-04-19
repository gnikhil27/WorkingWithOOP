package nik.iant.workingwithoop

class Student {
    var StudentName = ""
    var StudentAge = 0
    private var StudentID = 0

    fun getData(stuName: String, stuAge: Int, stuId:Int){
        StudentName = stuName
        StudentAge = stuAge
        StudentID = stuId
    }
}
class Maths{
    public fun factorial(n:Double): Double
    {
        return if (n<2.0) 1.0
        else n*factorial(n-1)
//        val r= 32
//        var i = if(r%2 == 0)"Even"
//        else "Odd"
    }
}