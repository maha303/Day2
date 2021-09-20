fun main(){

    fun cal() {
        print("Enter your first number : ")
        var num1 = readLine()!!.toInt()
        print("Enter your second number :  ")
        var num2 = readLine()!!.toInt()

        fun sum(n1: Int, n2: Int) {
            var result = n1 + n2
            println("$n1 + $n2 = $result")
        }
        sum(num1, num2)
    }
    cal()
    var count=0
    while (true){
        println(" Would you like to try again Y/N : ")
        var choos = readLine()
        return cal()
        count++
    }
        println("Good")
    }




