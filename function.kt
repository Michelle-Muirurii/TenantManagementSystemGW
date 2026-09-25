data class Tenant(
    val id: Int,
    val name: String,
    val houseNumber: String,
    val monthlyRent: Int
)

// Task: find a tenant by house number
fun findTenantByHouseNumber(tenants: List<Tenant>, houseNumber: String): Tenant? {
    return tenants.find { it.houseNumber.equals(houseNumber, ignoreCase = true) }
}