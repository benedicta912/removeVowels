import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(removeVowels2("Hello World!"))
    println(removeVowels1("Hello World!"))
    println(removeVowels3("Hello World!"))
}
//method1
fun removeVowels1(string: String): String{
    return string.filter{char->
        !"aeiou".contains(char.toLowerCase())
    }
}
//method2
fun removeVowels2(string: String): String{
    return string.replace("[aeiou]".toRegex(), "")
}
//method3

fun removeVowels3(string: String): String{
    var result = StringBuilder()
    for (char in string){
        if (char != 'a' && char != 'A'
            && char != 'e' && char != 'E'
            &&char != 'i' && char != 'I'
            &&char != 'o' && char != 'O'
            &&char != 'u' && char != 'U'){
            result.append(char)
        }
    }
    return result.toString()
}