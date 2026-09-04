//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    welcome()
    variables()
    datatypes()
    string()
}

fun welcome() {
    println("Welcome to Tenant Management System")
}


// Variables[Michelle]
fun variables(){
    println("\n=== Variables ===")
    val tenantId = 1001
    val name = "Jane Wanjiku"
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
// Strings [Fareed]
fun string() {
    println("\n=== Strings ===")
    val name = "Jane Wanjiku"
    val houseNumber = "A-204"
    val monthlyRent = 25000
    val amountPaid = 20000

    // Task 3.1 - String Concatenation using (+) operator only
    // println(name + " lives in house " + houseNumber)

    // Task 3.2 - String Template
    println("$name lives in house $houseNumber")

    // Task 3.3 - the Template Expression
    println("Total Rent for 6 months: KES ${monthlyRent * 6}")

    // Task 3.4 - Triple-Quoted String
    val receipt = """
        ===== RENT RECEIPT =====
        Tenant: $name
        House: $houseNumber
        Paid: $amountPaid
    """.trimIndent()
    println(receipt)

    // Task 3.5 - Predict First
    val greeting = "Dear Tenant"
    greeting.uppercase()
    // println(greeting)
    println(greeting.uppercase())

}
//Part 4: Operators [Angel]
fun Operators() {
    println("\n=== Part 4: Operators ===")
    val monthlyRent = 25000
    val amountPaid = 20000

    // Task 4.1
    println("Balance: KES ${monthlyRent - amountPaid}")

    // Task 4.2
    val percentPaidWrong = (amountPaid / monthlyRent) * 100
    println("Paid: $percentPaidWrong%")
    val percentPaidFixA = (amountPaid.toDouble() / monthlyRent) * 100
    val percentPaidFixB = (amountPaid * 100) / monthlyRent
    println("Paid (fix A): $percentPaidFixA%")
    println("Paid (fix B): $percentPaidFixB%")

    // Task 4.3
    val instalment = 6000
    println("Full instalments: ${monthlyRent / instalment}")
    println("Remaining amount: KES ${monthlyRent % instalment}")

    // Task 4.4
    val totalRent = monthlyRent.times(6)
    println("Total rent: $totalRent")

    // Task 4.5
    val isRentPaid = amountPaid >= monthlyRent
    println("Is rent paid: $isRentPaid")

    // Task 4.6
    var monthsInArrears = 2
    val needsReminder = (amountPaid < monthlyRent) && (monthsInArrears > 1)
    println("Needs reminder: $needsReminder")
}
// Part 5: Decisions
fun Decisions() {
    println("\n=== Part 5: Decisions ===")
    val monthlyRent = 25000
    val amountPaid = 20000
    val balance = monthlyRent - amountPaid

    // Task 5.1
    if (balance <= 0) println("Rent is fully paid") else println("Rent is outstanding")

    // Task 5.2
    if (balance <= 0) {
        println("Rent is fully paid")
    } else if (balance < 10000) {
        println("Small outstanding balance")
    } else {
        println("Large outstanding balance")
    }

    // Task 5.3
    when {
        balance <= 0 -> println("Rent is fully paid")
        balance < 10000 -> println("Small outstanding balance")
        else -> println("Large outstanding balance")
    }

    // Task 5.4
    val monthsInArrears = 4
    val classification = when (monthsInArrears) {
        0 -> "Rent is up to date"
        in 1..2 -> "Early arrears"
        in 3..5 -> "Serious arrears"
        in 6..12 -> "Critical arrears"
        else -> "Review tenant account"
    }
    println(classification)

    // Task 5.5
    val status = "ACTIVE"
    when (status) {
        "ACTIVE" -> println("Tenant is currently occupying the house")
        "VACATED" -> println("Tenant has vacated the house")
        "PENDING" -> println("Tenant status is pending")
        else -> println("Unknown status")
    }
}