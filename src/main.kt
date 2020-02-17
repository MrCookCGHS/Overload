
fun info(name: String, phone:String) {
    println("Answer recorded as: \nName: $name \nPhone: $phone")
}

fun info(name: String, phone:String, contact:String) {
    println("Answer recorded as: \nName: $name \nPhone: $phone  \nContact: $contact")
}

fun main() {
    var userChoice = 0
    var name = " "
    var phone = " "
    var contact = " "

    println("Are you a RESIDENTIAL or BUSINESS location?")
    println("1. Residential")
    println("2. Business")

    userChoice = readLine()!!.toInt()

        if (userChoice == 1) {
            println("Enter your name")
            name = readLine()!!.toString()
            println("Enter your phone")
            phone = readLine()!!.toString()
            info(name, phone)
        } else if (userChoice == 2) {
            println("Enter your name")
            name = readLine()!!.toString()
            println("Enter your phone")
            phone = readLine()!!.toString()
            println("Enter your contact")
            contact = readLine()!!.toString()
            info(name, phone, contact)
        }  else {
            println("Please re-enter (1) Residential or (2) Business")
        }
    }

