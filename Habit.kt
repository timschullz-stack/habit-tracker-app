package com.example.summerhabits.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Entity(tableName = "habits")
data class Habit(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val description: String,
    val category: String, // HabitCategory
    val frequency: String, // HabitFrequency
    val targetDaysPerWeek: Int = 7,
    val reminderTime: String? = null, // HH:mm format
    val color: Long, // Material Color
    val isNotificationEnabled: Boolean = true,
    val createdAt: String = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME),
    val lastCompletedAt: String? = null,
    val streak: Int = 0,
    val totalCompletedDays: Int = 0,
    val isActive: Boolean = true
)
