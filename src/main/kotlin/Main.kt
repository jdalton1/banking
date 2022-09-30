import java.util.Scanner

fun main() {

    startScreen()
}

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

fun accountHolder() {
    val input = Scanner(System.`in`)
    var balance: Int = 0

    //have database of pin numbers saved
    //put in loops, add quit option
    print("Please enter your pin: ")
    val pin: Int = input.nextInt()

    println("Welcome back!\n")

    var choice: Int = 0

    while (choice != 7) {
        println("1. Deposit")
        println("2. Withdraw")
        println("3. Transfer Money")
        println("4. Check Balance")
        println("5. Open New Account")
        println("6. Quit")

        print("What can we do for you today? (1-6) \n")
        choice = input.nextInt()

        // make these into functions
        // also add choice of which account to deposit/withdraw from
        if (choice == 1) {
            print("Enter desired amount to deposit: ")
            val amountToDeposit: Int = input.nextInt()

            balance = balance.plus(amountToDeposit)
            println("Your new balance is: $balance")
        }

        if (choice == 2) {
            print("Enter desired amount to withdraw: ")
            val amountToWithdraw: Int = input.nextInt()

            println("Your new balance is: $balance")
        }

        if (choice == 3) {
            print("Which account would you like to transfer money from? ")
            val transferFromAccount = readLine()

            print("Which account would you like to transfer money to? ")
            val transferToAccount = readLine()

            print("How much would you like to transfer? ")
            val amountToTransfer: Int = input.nextInt()

            println("Your new balance is: $balance")
        }

        if (choice == 4) {
            println("Your balance is \$$balance.")
        }

        if (choice == 5){
            return
        }

        if (choice == 6){
            println("Goodbye!")
            return
        }
    }
}
fun newAccountHolder(){
    val input = Scanner(System.`in`)

    println("Thank you for choosing Bank of Money!")
    println("Let's get some basic information about you.\n")

    print("How old are you? ")
    val age:Int = input.nextInt()

    if (age < 18){
        println("Sorry, you are not old enough to open a bank account!")
        main()
    }

    print("What is your first name? ")
    val firstName = readLine()

    print("What is your last name? ")
    val lastName = readLine()

    print("What type of account would you like to open? (Checking/Savings) ")
    val accountType = readLine()


}








class Person(val firstName: String, val lastName: String, val age: Int){

}

class AccountHolder(val accountNumber: Int, val pin: Int){

}

class Account(){

}