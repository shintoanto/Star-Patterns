//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pattern = Patterns()
    pattern.rightHalfPyramid()
pattern.leftHalfPyramid()
    pattern.mirroredStarPattern()
}


class Patterns{
    fun rightHalfPyramid(){
        println("1 Right Half Pattern")
        for (i in 0..5){
            for (x in 0..i){
                print("*")
            }
            println()
        }
        println("Right Half Pattern END")
        println()
    }

    fun leftHalfPyramid(){
        println("Left Pyramid")
        val row =5
        for (i in 0..5){
            for (x in 0..row-i){
                print("*")
            }
            println()
        }
        println("Left Pyramid END")
        println()
    }

    fun mirroredStarPattern(){
        val row = 5;
        println("Mirrored Star Pattern")
        for (i in 0..5){
            for (z in 0..row-i){
                print(" ")
            }
            for (x in 0..i){
                print("*")
            }

            println()

        }
        println("Mirrored Star Pattern END")
        println()

    }
}