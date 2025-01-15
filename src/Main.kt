//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pattern = Patterns();
    pattern.rightHalfPyramid()

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
    }
}