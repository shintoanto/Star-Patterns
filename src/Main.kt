//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pattern = Patterns()
    pattern.rightHalfPyramid()
pattern.leftHalfPyramid()
    pattern.mirroredStarPattern()
    pattern.pyramidStarPattern()
    pattern.invertedFullPyramid()

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
        val row = 5
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

    fun pyramidStarPattern(){
        val row =5
        for (i in 0..5){
            for (x in 0..row-i){
                print(" ")
            }
            for (n in 0..i){
                print("*")
            }
            for (n in 1..i){
                print("*")
            }

            println()
        }
    }

    fun invertedFullPyramid(){
        print("Inverted full pyramid")
        val x =5
        for(i in 0..5){
            for (n in 0..i){
                print(" ")
            }
            for (v in 0.. x-i){
                print("*")
            }
            for (c in 1.. x-i){
                print("*")
            }
            println()
        }
        println("Inverted full pyramid END")
    }
}