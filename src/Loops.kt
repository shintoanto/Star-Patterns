class Loops {


    fun loops( z:Int, n:Int,action:(Int)->Unit){
        for (i in z..n){
            action(i)
        }

    }
}