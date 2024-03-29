package com.application.smartapotek.data.database

package com.application.smartapotek.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "medicine_stock")
data class MedicineStock(
    @ColumnInfo(name = "medicineName")
    var medicineName: String,
    @ColumnInfo(name = "quantity")
    var quantity: Int,
    @ColumnInfo(name = "expiryDate")
    var expiryDate: String,
    @ColumnInfo(name = "price")
    var price: Double,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)