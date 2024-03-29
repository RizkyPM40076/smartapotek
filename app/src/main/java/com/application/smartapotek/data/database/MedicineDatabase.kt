package com.application.smartapotek.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [MedicineStock::class],
    version = 1
)
abstract class MedicineDatabase : RoomDatabase() {

    abstract fun medicineStockDao(): MedicineStockDao

    companion object {
        @Volatile
        private var INSTANCE: MedicineDatabase? = null

        fun getInstance(context: Context): MedicineDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MedicineDatabase::class.java,
                    "medicine_db"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
