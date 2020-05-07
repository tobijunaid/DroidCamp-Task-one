import java.time.OffsetDateTime

class Task (val length: Int = 50, val width: Int = 20) {


    fun additionOfParamters(){
        val addition:Int = length + width
        val stringAddition: String = addition.toString()
        println("Addition value is ${stringAddition}")
    }

    fun subtractionOfParameters(){
        val subtraction:Int = length - width
        val stringSubtraction: String = subtraction.toString()
        println("Subtraction value is ${stringSubtraction}")
    }

    fun multiplicationOfParameters(){
        val multiplication: Int = length * width
        val stringMultiplication: String = multiplication.toString()
        println("Multiplication value is ${stringMultiplication}")

    }

}

fun main(args:Array<String>){
    val obj = Task()
    obj.additionOfParamters()
    obj.subtractionOfParameters()
    obj.multiplicationOfParameters()
}
