fun main() {
    name()


    var x = modulus(3.0, 2)
    println(x)
    var y = add(1, 2, 3, 4)
    println(y)
    interestingThingAboutMyself()


}
fun name(){
    var name = "hello ada"
    println(name)
}






fun modulus(num1: Double, num2: Int): Double {

    var result = num1 % num2
    return (result)


}


fun add(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var result = num1 + num2 + num3 + num4
    return result


}
fun interestingThingAboutMyself(){
    var sentence = "I am curious"
    println(sentence)
}


