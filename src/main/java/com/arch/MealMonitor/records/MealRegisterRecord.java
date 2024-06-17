package com.arch.MealMonitor.records;

import com.arch.MealMonitor.entities.Meal;
import com.arch.MealMonitor.entities.ScheduledMeal;

import java.time.LocalDateTime;
import java.util.Date;

public record MealRegisterRecord(String mealName, Double mass, LocalDateTime registerDate) {
}