package com.example.greetingcard.vegetables.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.serialization.Serializable




@Serializable
data class ProductOwner(
    val id: String,
    val username: String,
    val first_name: String,  // No @SerializedName needed!
    val last_name: String,
    val email: String,
    val people_info: PeopleInfo
)

@Serializable
data class PeopleInfo(
    // Add your fields here
    val phone: String? = null
)

@Serializable
data class ProductCategory(
    val id: Int,
    val category: String,
    val created_at: String,
    val updated_at: String
)

@Serializable
data class SingleProduct(
    val id: Int,
    val product_name: String,
    val image_url: String,
    val unit_price: Double,  // Parse as Double directly
    val unit_name: String,
    val description: String,
    val product_owner: ProductOwner,
    val category: ProductCategory,
    val created_at: String,
    val updated_at: String
)


class VegetableViewModel : ViewModel() {
    private val _uiState= MutableStateFlow(emptyList<SingleProduct>())
    val uiState: StateFlow<List<SingleProduct>> = _uiState.asStateFlow()
}