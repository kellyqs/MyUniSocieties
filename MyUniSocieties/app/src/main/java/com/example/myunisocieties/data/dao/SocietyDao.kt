/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface SocietyDao {

    // Insert a new society
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSociety(society: Society)

    // Update an existing society
    @Update
    suspend fun updateSociety(society: Society)

    // Delete a society
    @Delete
    suspend fun deleteSociety(society: Society)

    // Retrieve a specific society by its ID
    @Query("SELECT * FROM society_table WHERE societyId = :id")
    suspend fun getSocietyById(id: Int): Society?

    // Retrieve all societies ordered by name
    @Query("SELECT * FROM society_table ORDER BY name ASC")
    suspend fun getAllSocieties(): List<Society>

    // Retrieve societies by category (e.g., "Engineering", "Film")
    @Query("SELECT * FROM society_table WHERE category = :category ORDER BY name ASC")
    suspend fun getSocietiesByCategory(category: String): List<Society>

    // Retrieve only active societies
    @Query("SELECT * FROM society_table WHERE isActive = 1 ORDER BY name ASC")
    suspend fun getActiveSocieties(): List<Society>
}
