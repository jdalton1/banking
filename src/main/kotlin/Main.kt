import java.util.Scanner

// Main, calls startScreen()
fun main() {

    startScreen()
}

// The start screen, gets desired action from the user.
fun startScreen(){
    println("Welcome to Bank of Money!\n")
    println("Are you an existing account holder? (y/n): ")
    val input = readLine()
    if (input == "y"){
        accountHolder()
    }
    else {
        newAccountHolder()
    }
}

// What to output if the user is an account holder
fun accountHolder() {
    val input = Scanner(System.`in`)
    var balance: Int = 0

    println("Welcome back!\n")

    var choice: Int = 0

    while (choice != 4) {
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Check Balance")
        println("4. Quit")

        print("What can we do for you today? (1-4) \n")
        choice = input.nextInt()

        if (choice == 1) {
            print("Enter desired amount to deposit: ")
            val amountToDeposit: Int = input.nextInt()

            balance = balance.plus(amountToDeposit)
            println("Your new balance is: $balance\n")
        }

        if (choice == 2) {
            print("Enter desired amount to withdraw: ")
            val amountToWithdraw: Int = input.nextInt()

            balance = balance.minus(amountToWithdraw)

            println("Your new balance is: $balance\n")
        }

        if (choice == 3) {
            println("Your balance is \$$balance.\n")
        }

        if (choice == 4){
            println("Goodbye!")
            return
        }

        if (choice > 4 || choice < 1) {
            print("Sorry, invalid option! Try again.")
            choice = 0
        }
    }
}

// Get user information and create an Object of that person using a class
fun newAccountHolder(){

    println("Thank you for choosing Bank of Money!")
    println("Let's get some basic information about you.\n")

    val newUser = Person()

    newUser.getAge()
    val firstName = newUser.getFirstName()
    newUser.getLastName()

    print("Welcome to the Bank of Money, $firstName!")

    accountHolder()

}


// Person class, gets and stores information about a person.
open class Person {

    // Get the users age
    fun getAge(): Int {
    val input = Scanner(System.`in`)

    print("How old are you? ")
    val age: Int = input.nextInt()

    if (age < 18) {
        println("Sorry, you are not old enough to open a bank account!")
        startScreen()
        return 0
    }

    else {
        return age
        }
    }

    // Get the users first name
    fun getFirstName(): String? {
        print("What is your first name? ")
        return readLine()
    }

    // Get the users last name
    fun getLastName(): String? {
        print("What is your last name? ")
        return readLine()
    }

}
