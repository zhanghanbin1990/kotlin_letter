open class Person(var name:String,var age:Int) {
    init {
        println("创建了${this.javaClass.simpleName}，名字$name，年龄$age")
    }
}

class Man(name:String,age: Int) : Person(name,age)
class Women(name:String,age :Int) : Person(name,age)

fun main(args: Array<String>) {
    val xMan: Man = Man("zhanghanbin", 23)
    val xWomen: Women = Women("maomao", 21)
    println("man:${xMan.name} ${xMan.age}，women:$xWomen")
}