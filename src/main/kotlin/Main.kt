fun main() {
    characters("anna", "mellie")
    statistics(arrayOf(23,24,21,20,25,23))
    newstring("AkiraChix")
    var newCalculator = Calculator( 52, 39.0)
    newCalculator.addition()
    newCalculator.subtraction()
    newCalculator.division()
    newCalculator.multiplication()

}
// takes in 2 parameters and returns first char
fun characters(first:String, second:String){
    if(first >= second){
        println(first[0])
    }
    else{
        println(second[0])
    }

}
fun statistics(numbers:Array<Int>):Array<Unit>{
    var all = arrayOf("${numbers.min()}, ${numbers.max()}, ${numbers.average()}")
    var output1 = println(all[0])
    var output2= println(all[1])
    var output3 = println(all[2])
    var output = arrayOf(output1,output2,output3)
    return output


}
fun newstring(word:String){
    var output = word.split("")
    println(output)

}
fun joins(diffWords:Array<String>):String{
    println(diffWords.contentToString())
}
class Calculator(var x:Int,var y:Double){
    fun addition(){
       println(x + y)
    }
    fun subtraction(){
        println(x - y)
    }
    fun division():Double{
        return (x / y)
    }
    fun multiplication(){
        println(x * y)
    }

}
