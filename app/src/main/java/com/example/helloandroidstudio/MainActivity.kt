package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        //Lesson 1
        //variablesAndConstants()

        //Lesson 2
        //dataTypes()

        //Lesson 3
        //ifSentence()

        //Lesson 4
        //whenSentence()

        //Lesson 5
        //arrays()

        //Lesson 6
        //maps()

        //Lesson 7
        //loops()

        //Lesson 8
        //functions()

        //Lesson 9
        //classes()

        //Lesson 10
        //enumClasses()

        //Lesson 11
        //nestedAndInnerClasses()

        //Lesson 12
        //classInheritance()

    }

    //acá hablaremos de variables y constantes

    private fun variablesAndConstants() {
        // This is a variable in Kotlin
        var myFirstVariable = "Hello jakerman!"
        println(myFirstVariable)
        myFirstVariable = "Welcome to my harbor"
        println(myFirstVariable)
        var mySecondVariable = "Hey"
        println(mySecondVariable)

        // Constants
        // A constant cant not change it content or valor
        val myFirstConstant = "The ask"
        println(myFirstConstant)
        val mySecondConstant = myFirstVariable
        println(mySecondConstant)
        myFirstVariable = "The ask 2"
        println(myFirstVariable)
    }

    //Data types
    private fun dataTypes() {
        val myString1 = "Hey bro, i'm a String,"
        val myString2 = "Really?"
        val myStringDefinitive = "$myString1 $myString2"
        println(myStringDefinitive)

        // integers (Byte, short, int, long) <- data length (used to improve performance)
        val num1 = 50
        val num2 = 50
        val numDefinitive = num1 + num2
        println(numDefinitive)

        // Decimals (float, double)
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDoubleDefinitive = myDouble + myDouble2 + myDouble3
        println(myDoubleDefinitive)


        // Boolean (bool)
        val myBool = true
        val myBool2 = false
        println(myBool && myBool2)

    }

    // If sentence
    private fun ifSentence() {


        val myNumber = 100
        if (myNumber <= 10 && myNumber < 20 || myNumber == 30) {
            println("$myNumber is less than or equal to 10")
        } else if (myNumber == 100) {
            println("Your number is 100")
        }

// You can do all ifs that you need :
        else {
            println("$myNumber My number is higher that 10")
        }
    }

    // About of When sentence
    fun whenSentence() {
        when ("Japan") {
            "Spain", "Ecuador", "Colombia", "Peru" -> println("The language is Spanish")

            "England", "United States", "Australia", "New Zealand" -> println("The language is English")

            "France" -> println("The language is Frances")

            "Japan" -> println("The language is Japanese")

            else -> println("Sorry, we don't know your language")

        }

// When sentence with numbers
        val age = 10

        when (age) {
            1, 2, 3 -> println("Is a baby")

            in 4..11 -> println("Is a child")

            in 12..18 -> println("Is a teenager")

            in 19..30 -> println("Is a adult")

            in 31..50 -> println("Is a old man")

        }
    }
}


     // About of arrays
    fun  arrays() {
         val age = "22"
         val name = "Juan Camilo"
         val surname = "Urbano"
         val company = "None"

         //Ways of working with arrays

         // array creation
         val myArray = arrayListOf<String>("Any")

         //Add data one by one

         myArray.add(name)
         myArray.add(surname)
         myArray.add(company)
         myArray.add(age)
         println(myArray)

         // Add all datas (my favorite way)

         myArray.addAll(listOf("All"))
         println(myArray)

         // Data of access
         val myCompany = myArray[2]
         println(myCompany)

         // Datas modification
         myArray[4] = "No all"
         println(myArray)

         // Delete data
         myArray.removeAt(4)
         println(myArray)

         // Scrolling data
         myArray.forEach{
             println(it)
         }

         // Counting data
         println(myArray.count())

         // Ex:
         var shelbyBrothers = arrayListOf<String>("Thomas Shelby","Arthur Shelby","Jhon Shelby")
         println("The array size is: "+shelbyBrothers.size)
         println("In the last position was: "+shelbyBrothers[2])
         println(shelbyBrothers)


         // Data modification
         shelbyBrothers[2] = "Luca Changretta"
         println(shelbyBrothers)

         // Counting data
         println(shelbyBrothers.count())

         // Delete data
         shelbyBrothers.removeAt(2)
         println(shelbyBrothers)

         //MutableListOf
         val list = mutableListOf("Camilo","Andres","Maribel")
         println(list)
         list.add("Carlos")
         println(list)
         // The difference between mutable and no mutable is that mutable can modify his dates

         //Practice
         val foodList = arrayListOf<String>("Rice","Meat","Eggs","Beans","Apples")
         println(foodList)
         foodList.removeAt(1)
         println("I become myself in vegetarian, so: $foodList")

         // Arrays with for sentence
         val array2 = arrayOf("Guts","Griffith","Casca")

         for(i in array2){
             println(i)
         }

     }

    // About the maps
    fun maps() {
        val mapNumbers = mutableMapOf("cod1" to 1, "cod2" to 2, "cod3" to 3, "cod4" to 4)
        println("Map: $mapNumbers")
        println("Keys: ${mapNumbers.keys}")
        println("Values: ${mapNumbers.values}")

        mapNumbers["cod5"] = 5
        println(mapNumbers)
        mapNumbers.remove("cod5")
        println("Now the map is: $mapNumbers")

        // Practice
        // delete, add new element,
        val privatePasswords = mutableMapOf("a" to 1,"b" to 2,"c" to 3)
        println(privatePasswords)

        privatePasswords.remove("a")
        println(privatePasswords)

        privatePasswords["a"] = 1
        println(privatePasswords)
}


  // About the loops
  private fun loops(){
      //Loops

      val myArray = arrayListOf<String>("Hi", "Welcome to my channel", "subscribe please")
      println(myArray)
      val myMap = mutableMapOf("Pepe" to 1, "Pedro" to 2, "Sara" to 5)

      //For
      for(myString in myArray) {
          println(myString)
      }

      for (myElement in myMap) {
          println("${myElement.key}-${myElement.value}")
      }

      //With numbers
      for (x in 0..10){
          println(x)
      }

      for (x in 9 until 30){
          println(x)
      }

      for (x in 0..10 step 2){
          println(x)
      }

      for(x in 10 downTo 0 step 3){
          println(x)
      }

      //While
      var x = 0
      while (x <= 10){
          println(x)
          x ++
      }

      // Practice
      val privatePasswords = mutableMapOf("a" to 1,"b" to 2,"c" to 3)
      for (mySecurity in privatePasswords){
          println("my keys are ${privatePasswords.keys} and my values are ${privatePasswords.values}")
      }

  }

 //About the functions
 fun functions(){

    sayHello()
    sayHello()
    sayHello()

    //We can call to others functions in a function
    sayMyName("Camilo", 22)
    sayMyName("Sara", 18)
    sayMyName("Carlos", 25)
    sayMyName("Felipe", 18)

    var sum = sumTwoNumbers(10,20)
    println(sum)

    //Practice
     pumpkins()
    car("S3x",2022,"Tesla")
    val sumExample=sumita(100,500,400)
    println(sumExample)
}

//Simple fuction
fun sayHello(){
    println("Hello")
}

//Function with parameters
fun sayMyName(name: String, age: Int){
    println("My name is $name, and i'm $age years old")
}

//Function with a return value
fun sumTwoNumbers(num1: Int, num2: Int): Int{
    return num1+num2
}

//It is useful to reuse code, a function with parameters and a function that returns values.

//Practise
fun pumpkins() {
    println("There are so many pumpkins here")
}
fun car(model:String, year: Int, brand: String){
println("My car is a model: $model, its brand is $brand of the year $year")

}
fun sumita(num1: Int,num2:Int,num3: Int): Int {
    return num1 + num2 + num3
}


//About the classes
fun classes() {
    val camilo = programmer("Camilo", 22, arrayOf(programmer.Language.FLUTTER,programmer.Language.KOTLIN))
    println(camilo.age)

    val andres = programmer("Andres", 25, arrayOf(programmer.Language.JAVA, programmer.Language.REACT_NATIVE), arrayOf(camilo))
    println(andres.name)

    println(camilo.code())
    println(andres.code())
    println("${andres.friends?.first()?.name} is a friend of ${andres.name}")
}


 //About enum class
 enum class Address{
    NORTH,SOUTH,EAST,WEST;

    fun description(): String {
        return when(this){
            NORTH -> "The Address is north"
            SOUTH -> "The Address is south"
            EAST -> "The Address is east"
            WEST -> "The Address is west"
        }
    }
}

fun enumClasses(){
    var userAddress: Address? = null
    println("The address is $userAddress")

    userAddress = Address.EAST
    println(userAddress)

    //There are two types of enum class: name and ordinal
    println("Property name: ${userAddress.name}")

    println("Property ordinal: ${userAddress.ordinal}")

    //Functions
    println(userAddress.description())
}

fun nestedAndInnerClasses(){

    //NestedClass
    val myNestedClass = MyNestedAndInnerClass.MyNestedClass()
    val sum = myNestedClass.sum(30,20)
    println("The result is $sum")

    //Internal class
    val myInnerClass: MyNestedAndInnerClass.MyInnerClass = MyNestedAndInnerClass().MyInnerClass()
    val sumTwo: Int = myInnerClass.sumTwo(10)
    println("The result is $sumTwo")
}

 //Inheritance of classes
 fun classInheritance(){

println("OBJECT INSTRUMENT")
    var myInstrument: MusicalIstrument = MusicalIstrument("Instrument", "Percussion")
     myInstrument.brand="XYZ"
     myInstrument.playing()
     myInstrument.clean()

    println("OBJECT GUITAR")
    var myGuitar:Guitar = Guitar("Brown","Guitar","Ropes")
     myGuitar.color="Red"
     myGuitar.tune()

    //Apply the inheritance
     myGuitar.playing()
     myGuitar.clean()


    println("OBJECT FLUTE")
    var miFlauta:Flute = Flute(8)
    miFlauta.shine()

    //Aplicando la herencia
    miFlauta.name="Little boy"
    miFlauta.brand="Taunic"
    miFlauta.type="Wind"
    miFlauta.clean()
    miFlauta.playing()
}






















