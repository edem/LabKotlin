package pkg001

fun main(){
    println("Kotlin 我來了")
    var intVar = 3  // 推斷賦型
    intVar = intVar.inc()
    println("intVar=$intVar")

    var intVarA : Int = 9
    intVarA += intVar
    println("intVarA=$intVarA")

    var vF : Float = 9.0f
    vF += 1
    println("vF=$vF")

    var vB: Byte = 18
    vB += 2.toByte()
    println("vB=$vB")


    val vL : Long
    vL = 100
    //vL += 1
    println("vL=$vL")
}