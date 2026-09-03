//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    welcome()
    variables()
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