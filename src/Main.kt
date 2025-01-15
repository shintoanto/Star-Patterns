//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var pattern = Patterns();
    pattern.rightHalfPyramid()

}


class Patterns{
    fun rightHalfPyramid(){
        for (i in 0..5){
            for (x in 0..i){
                print("*")
            }
            println()
        }
    }
}