/**
 * Created by zhanghanbin on 2017/7/19.
 */

fun main(args: Array<String>) {
    val bBoolean:Boolean = true
    val anInt:Int = 5
    val aLong:Long = anInt.toLong()
    println(aLong)

    val aString: String = "zhang"
    val aChar: String = String(charArrayOf('z', 'h', 'a', 'n', 'g'))

    println(aString == aChar)
    println(aString === aChar)

    val aInt:Int = 0
    val bInt :Int = 1
    println("$aInt + $bInt = ${aInt +bInt}")

    val rowString:String = """
        /t /n
        $aInt
    """
    println(rowString.length)
    println(rowString)




}