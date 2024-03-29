package com.application.smartapotek.data.database

package com.smartapotek.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MedicineStockDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMedicine(medicine: MedicineStock)

    @Query("SELECT * FROM medicine_stock WHERE id = :id")
    fun getMedicine(id: Int): MedicineStock

    @Query("SELECT * FROM medicine_stock")
    fun getAllMedicines(): List<MedicineStock>

    @Delete
    fun deleteMedicine(medicine: MedicineStock)

    @Query("UPDATE medicine_stock SET medicineName = :medicineName, quantity = :quantity, expiryDate = :expiryDate, price = :price WHERE id = :id")
    fun updateMedicine(id: Int, medicineName: String, quantity: Int, expiryDate: String, price: Double)
}
