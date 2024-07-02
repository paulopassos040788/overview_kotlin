package classes_objetos

class Person(val name: String, val age: Int) {

    constructor(name: String) : this(name, 0) {
        println("Creating a person with name only")
    }

}

fun main(){
    val person1 = Person("John", 30)
    val person2 = Person("Jane")

    val people: List<Person> = listOf(person1, person2)

    for (person in people) {
        println("Name: ${person.name}, Age: ${person.age}")
    }
}