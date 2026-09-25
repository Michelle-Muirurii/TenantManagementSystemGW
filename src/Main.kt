//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Group 3-[Michelle Muiruri-174904,
//          Angel Muthoni-189733,
//          Fareed Kamau-193339,
//          Nicole Indimuli-191322,
//          Muli Junior-184070,
//          Tichina Naitore-188142]
//Github: https://github.com/Michelle-Muirurii/TenantManagementSystemGW.git

// Tenant class
// Task 1 and Task 2
class Tenant(
    val name: String,
    val apartmentNumber: Int,
    rentAmount: Double
) {
    var isPaid: Boolean = false

    private var _rentAmount: Double = rentAmount

    var rentAmount: Double
        // Task 4: Custom Getter
        get() {
            println("Rent Amount Accessed.")
            return _rentAmount
        }
    set(value) {
        if (value >=0){
            _rentAmount = value
        } else {
            println("Rent amount cannot be negative")
        }
    }

    // Marks the tenant's rent as paid
    fun payRent() {
        isPaid = true
        println("Rent paid successfully by $name")
    }
}
// Apartment Class
//Task 5: Composition - Apartment has tenant objects
//Task 6: addTenant() Lets us add tenants to this apartment's list
class Apartment(
    val apartmentNumber: Int
) {
    val tenants: MutableList<Tenant> = mutableListOf()

    fun addTenant(tenant: Tenant) {
        tenants.add(tenant)
    }
    //Task 6 - Think About it:
    //An Apartment "has" Tenant objects because it stores them inside itself
    // as a property (the tenants list) rather than being a type of tenant.
    //This is composition - a "has-a" relationship
    //as opposed to inheritance which is an "is-a" relationship.

    // Task 7 display every tenant's name, rents amount and payment status

    fun showTenants(){
        println("Apartment: $apartmentNumber")
        for (tenant in tenants){
            println("Tenant: ${tenant.name}")
            println("Rent: ${tenant.rentAmount}")
            println("Rent paid : ${tenant.isPaid}")
        }
    }

}
fun main() {
    welcome()
    variables()
    datatypes()
    strings()
    Operators()
    decisions()
    rangesAndLoops()
    listsAndArrays()
    nullSafety()
    // OOP Lab - Part 1 and Part 2 [Muli]
    // The primary constructor allows us to provide tenant information when creating the object.
    val tenant1 = Tenant("Jane Wanjiku", 101, 15000.0)
    val tenant2 = Tenant("Brian Otieno", 102, 18000.0)

    // Pay rent for only the first tenant
    tenant1.payRent()

    println("Tenant 1 rent paid: ${tenant1.isPaid}")
    println("Tenant 2 rent paid: ${tenant2.isPaid}")  // Each Tenant object has its own properties, so different objects can have different information and payment statuses.
    println(tenant1.rentAmount)

    println("Rent before: ${tenant1.rentAmount}")
    tenant1.rentAmount = -5000.0
    println("Rent after: ${tenant1.rentAmount}")
    //OOP Lab - Task 5 and Task 6 [Nicole]
    //Create an Apartment object
    val apartment = Apartment(101)

    apartment.addTenant(tenant1)
    apartment.addTenant(tenant2)

    apartment.showTenants()


}



fun welcome() {
    println("Welcome to Tenant Management System")
}


// Variables[Michelle]
// Task 1.1
fun variables(){
    println("\n=== Variables ===")
    val tenantId = 1001
    val name = "Jane Wanjiku"
    val phone = "0712345678"
    val houseNumber = "A-204"
    val monthlyRent = 25000
    var amountPaid = 15000

    //Task 1.2
    println("Amount paid before: $amountPaid")
    amountPaid = 5000
    println("Amount paid after: $amountPaid")

    //Task 1.3
}
//Datatypes[Muli]
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
    println("Rent as double: $rentAsDouble")

    // Task 2.4 - Long with underscores
    val registrationNumber: Long = 999_999_999L
    println("Registration number: $registrationNumber")

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
fun strings() {
    println("\n=== Strings ===")
    val name = "Jane Wanjiku"
    val houseNumber = "A-204"
    val monthlyRent = 25000
    val amountPaid = 20000

    // Task 3.1 - String Concatenation using (+) operator only
     println(name + " lives in house " + houseNumber)

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
    println(greeting)
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
// Part 5: Decisions [Angel]
fun decisions() {
    println("\n=== Decisions ===")
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
// Ranges and Loops [Nicole]
fun rangesAndLoops() {
    println("\n=== Ranges and Loops ===")

    // Task 6.1
    for (month in 1..12) println(month)

    // Task 6.2
    for (month in 1..11 step 2) println("Checking payment history for month $month")

    // Task 6.3
    for (month in 5 downTo 1) println(month)

    // Task 6.4
    val tenants = listOf("Jane", "Brian", "Mary", "David")
    for ((index, tenant) in tenants.withIndex()) println("${index + 1}. $tenant")

    // Task 6.5
    val vacantHouses = 0
    while (vacantHouses > 0) {           // checks condition first -> never runs, 0 lines
        println("Checking vacant houses...")
    }
    do {                                   // runs the body once before checking -> 1 line
        println("Checking vacant houses...")
    } while (vacantHouses > 0)

    // Task 6.6
    repeat(3) { println("Please pay your rent.") }
}
//List and arrays[Tichina]
fun listsAndArrays() {
    println("\n=== Lists and Arrays ===")


    val tenants = listOf("Jane Wanjiku", "Brian Otieno", "Mary Achieng", "John Kamau")
    println(tenants.first())
    println(tenants[tenants.size - 1])


    val mutableTenants = tenants.toMutableList()
    mutableTenants.add("David Mwangi")
    mutableTenants.remove("Brian Otieno")
    println(mutableTenants)
    println(mutableTenants.size)


    val houseNumbers = arrayOf("A-101", "A-102", "A-103", "A-104")
    println(houseNumbers[1])
    houseNumbers[0] = "A-201"
    println(houseNumbers.joinToString())


    val demoNumbers = arrayOf("A-101", "A-102")
    println(demoNumbers)
    println(demoNumbers.joinToString())
    println(demoNumbers.contentToString())

    // Task 7.5
    val blockA = intArrayOf(1, 2, 3)
    val blockB = intArrayOf(4, 5, 6)
    println((blockA + blockB).joinToString())
    println((blockB + blockA).joinToString())
}
//Null safety
fun nullSafety() {
    println("\n=== Null Safety ===")


    var tenantEmail: String? = null
    println(tenantEmail)


    println("Email: ${tenantEmail ?: "Not provided"}")
    tenantEmail = "jane@example.com"
    println("Email: ${tenantEmail ?: "Not provided"}")


    tenantEmail = null
    println(tenantEmail?.length)
    println(tenantEmail?.length ?: 0)



    val nextOfKin: String? = null
    println(nextOfKin?.uppercase() ?: "No next of kin on record")

    val nextOfKinPresent: String? = "Peter Wanjiku"
    println(nextOfKinPresent?.uppercase() ?: "No next of kin on record")
}
