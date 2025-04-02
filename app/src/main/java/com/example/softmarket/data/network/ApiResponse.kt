package com.example.softmarket.data.network

data class ApiResponse(
    val id: Int,
    val title: String,
    val provider: String,
    val category: Usage,
    val platforms: Platforms,
    val billing: Billing,
    val price: Double,
    val logoUrl: String,
    val size: Double,
    val about: String
)

enum class Usage (val usage: String){
    MODELLING("3D Modelling"),
    ENGINEERING("Engineering"),
    GRAPHICS("Graphics")
}

enum class Platforms (val platforms: String){
    WINDOWS("Windows"),
    MacOS("macOS")
}

enum class Billing (val billing: String){
    WEEKLY("weekly"),
    MONTHLY("monthly"),
    ANNUALLY("annually"),
}