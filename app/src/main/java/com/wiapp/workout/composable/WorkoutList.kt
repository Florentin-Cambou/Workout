package com.wiapp.workout.composable

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.wiapp.workout.model.ModelExercices

@Composable
fun WorkoutList(modelExercices: List<ModelExercices>) {
    LazyRow{
        items(modelExercices){ modelExercices ->
            WorkoutCard(modelExercices)
        }
    }
}