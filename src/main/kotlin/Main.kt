fun main() {
val person = Human("Faith",20, 56,)


    person.eat(1, "Kgs")
   // println(person.eat(1, "Kgs"))
    person.weight
    println(person.weight)
    person.speak("My young sister is called Angel")
//    println(person.speak("My young sister is called Angel"))
    person.birthday(1)
    person.age
    println(person.age)
val user= User("Glory", "Mwamkinga", "glorymwamkinga.gmail@com", +255788266616, "h9808y3")
user.email
    println(user.email)
    user.firstName
    println(user.firstName)
}
class Human(var name:String, var age:Int, var weight:Int){
    fun eat(foodWeight:Int, unit:String) {
        weight += foodWeight

        println("I am eating $foodWeight $unit")
    }

fun speak(speech:String){
println(speech)
}
    fun birthday (age1:Int){

        age += age1
    }
}

data class User(var firstName:String, var lastName:String, var email:String,
                var phoneNumber:Long, var password:String)