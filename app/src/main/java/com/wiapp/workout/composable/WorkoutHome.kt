package com.wiapp.workout.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.wiapp.workout.data.DataSources

@Composable
fun WorkoutHome(paddingValues: PaddingValues) {
    WorkoutList(modelExercices = DataSources().LoadDataSources())
}