fun Xpermier(valeur: Int, pairs: Boolean){
    var i : Int = 0
    while(i < valeur){
        if(i%2 == 0 && pairs) {
            println(i)
        } else if (i%2 == 1 && !pairs){
            println(i)
        }
        i++
    }
}

fun Xfibo(valeur: Int): List<Int>{
    val numbers = mutableListOf<Int>(0,1)
    for( i in 2 until valeur){
        numbers.add(numbers[i-1]+numbers[i-2])
    }
    return numbers
}

fun Factoriel(valeur: Int = 10){
    var result = 1
    for(i in 1 .. valeur){
        result *= i
    }
    println(result)
}

fun estPremier(x: Int): Boolean {
    if (x <= 1) {
        return false
    }
    for (i in 2 until x) {
        if (x % i == 0) {
            return false
        }
    }
    return true
}

fun XnombrePremier(valeur: Int): List<Int> {
    val numbers = mutableListOf<Int>()
    for (i in 1 .. valeur){
        if(estPremier(i)){
            numbers.add(i)
        }
    }
    return numbers
}

Xpermier(10,true)
Xpermier(20,false)
val result = Xfibo(10)
println(result)
Factoriel(5)
Factoriel()
XnombrePremier(10)