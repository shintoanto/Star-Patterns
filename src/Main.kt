

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pattern = Patterns()
    pattern.rightHalfPyramid()
pattern.leftHalfPyramid()
    pattern.mirroredStarPattern()
    pattern.pyramidStarPattern()
    pattern.invertedFullPyramid()
    pattern.rhombusPattern()
    pattern.diamondPattern()
    pattern.hourGlassPattern()

}



class Patterns{

    private val msg=Printings()
    private val row=5
    private val loops=Loops()




    fun rightHalfPyramid(){
        msg.msg("1 Right Half Pattern")


        loops.loops( z = 0, n = 5){
           loops.loops(z=0, n = row){
               msg.prints(" ")
           }
            loops.loops(z=0, n = 5){
                msg.prints("  ")
            }
            msg.println()
        }

//        for (q in 0..5){
//            for (x in 0..i){
//                msg.print("*")
//            }
//            msg.println()
//        }
        msg.msg("Right Half Pattern END")
        msg.println()
    }

    fun leftHalfPyramid(){
        msg.msg("Left Pyramid")

        for (i in 0..5){
            for (x in 0..row-i){
                print("*")
            }
            println()
        }
        msg.msg("Left Pyramid END")
        msg.println()
    }

    fun mirroredStarPattern(){

              println("Mirrored Star Pattern")
        for (i in 0..5){
            for (z in 0..row-i){
                print(" ")
            }
            for (x in 0..i){
                msg.prints("*")
            }

            msg.println()

        }
        msg.msg("Mirrored Star Pattern END")
        msg.println()

    }

    fun pyramidStarPattern(){

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
        msg.msg("Inverted full pyramid")

        for(i in 0..5){
            for (n in 0..i){
                print(" ")
            }
            for (v in 0.. row-i){
                print("*")
            }
            for (c in 1.. row-i){
                print("*")
            }
            println()
        }
        msg.msg("Inverted full pyramid END")
    }

    fun rhombusPattern(){
        msg.msg("Rhombus pattern")

        for(i in 0..5){
            for (n in 0..row-i){
                print(" ")
            }
            for (v in 0.. row){
                print("*")
            }
            println()
        }
        msg.msg("Rhombus pattern END")
        println()
    }

    fun diamondPattern(){
        msg.msg("Diamond Pattern")

        for (i in 0..5){
            for (n in 0..row-i){
                print("   ")
            }
            for (n in 0..i){
                print(" * ")
            }
            for (n in 1..i){
                print(" * ")
            }
            println()
        }

        for (i in 1..5){
            for (n in 0..i){
                print("   ")
            }
            for (n in 0..row-i){
                print(" * ")
            }


            for (n in 1..row-i){
                print(" * ")
            }
            println()
        }
        msg.msg("Diamond Pattern END")

    }

    fun hourGlassPattern(){
        msg.msg("Hourglass Pattern")
        for (i in 0..5){
            for(x in 0..i){
                print("   ")
            }
            for (n in 0..row-i){
                print(" * ")
            }
            for (n in 1..row-i){
                print(" * ")
            }
            println()

        }

        for (i in 0..5){
            for(x in 0..row-i){
                print("   ")
            }
            for (n in 0..i){
                print(" * ")
            }
            for (n in 1..i){
                print(" * ")
            }
            println()

        }
        msg.msg("Hourglass pattern END")
    }
}