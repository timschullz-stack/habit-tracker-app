package com.example.summerhabits.utils

object Constants {
    const val HABIT_DATABASE_NAME = "summer_habits_db"
    const val NOTIFICATION_CHANNEL_ID = "habit_reminders"
    const val NOTIFICATION_CHANNEL_COMPLETE_ID = "habit_complete"
    const val WORKER_TAG = "habit_reminder_work"
    const val HABIT_ID_KEY = "habit_id"
    const val THEME_PREFERENCE = "theme_preference"
}

enum class HabitCategory {
    SPORTS, READING, HEALTH, LEARNING, PRODUCTIVITY, OTHER
}

enum class HabitFrequency {
    DAILY, WEEKLY, CUSTOM
}
