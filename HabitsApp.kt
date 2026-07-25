package com.example.summerhabits

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HabitsApp : Application() {
    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationManager: NotificationManager =
                getSystemService(NotificationManager::class.java)

            // Habit Reminder Channel
            val habitChannel = NotificationChannel(
                "habit_reminders",
                "Habit Reminders",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Notifications for habit reminders"
                enableVibration(true)
                setShowBadge(true)
            }

            // Habit Complete Channel
            val completeChannel = NotificationChannel(
                "habit_complete",
                "Habit Completion",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "Notifications when habits are completed"
                enableVibration(false)
            }

            notificationManager.createNotificationChannel(habitChannel)
            notificationManager.createNotificationChannel(completeChannel)
        }
    }
}
