package com.dicoding.asclepius.datariwayat

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.room.migration.Migration

@Database(entities = [PredictionHistory::class], version = 2, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun predictionHistoryDao(): PredictionHistoryDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                )
//                    .addMigrations(MIGRATION_1_2)
                    .build()
                INSTANCE = instance
                return instance
            }
        }

//        private val MIGRATION_1_2 = object : Migration(1, 2) {
//            override fun migrate(database: SupportSQLiteDatabase) {
//                database.execSQL("CREATE TABLE IF NOT EXISTS prediction_history_new (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, imagePath TEXT NOT NULL, result TEXT NOT NULL)")
//                database.execSQL("INSERT INTO prediction_history_new (imagePath, result) SELECT imagePath, result FROM prediction_history")
//                database.execSQL("DROP TABLE IF EXISTS prediction_history")
//                database.execSQL("ALTER TABLE prediction_history_new RENAME TO prediction_history")
//            }
//        }

    }

}
