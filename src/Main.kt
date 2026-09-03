//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    welcome()
    variables()
    datatypes()
}

fun welcome() {
    println("Welcome to Tenant Management System")
}


// Variables[Michelle]
fun variables(){
    println("\n=== Variables ===")
    val tenantId = 1001
    val name = "Jane wanjiku"
    val phone = "0712345678"
    val houseNumber = "A-204"
    val monthlyRent = 25000
    var amountPaid = 15000

    println("Amount paid before: $amountPaid")
    amountPaid = 5000
    println("Amount paid after: $amountPaid")
}
//Datatypes
fun datatypes() {
    println("\n=== Data Types and Casting ===")

    // Task 2.1 - Explicit type annotations
    val tenantId: Int = 1001
    val name: String = "Jane Wanjiku"
    val phone: String = "0712345678"
    val houseNumber: String = "A-204"
    val monthlyRent: Int = 25000
    var amountPaid: Int = 15000

    // Task 2.2 - Char and Boolean
    val block: Char = 'A'
    val isActive: Boolean = true

    // Task 2.3 - Int to Double conversion
    val rentAsDouble: Double = monthlyRent.toDouble()

    // Task 2.4 - Long with underscores
    val registrationNumber: Long = 999_999_999L

    println("Tenant ID: $tenantId")
    println("Name: $name")
    println("Phone Number: $phone")
    println("House Number: $houseNumber")
    println("Monthly Rent: KES $monthlyRent")
    println("Amount Paid: KES $amountPaid")
    println("Block: $block")
    println("Active Tenant: $isActive")
    println("Rent as Double: $rentAsDouble")
    println("Registration Number: $registrationNumber")
}