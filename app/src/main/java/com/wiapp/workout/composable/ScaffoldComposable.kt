package com.wiapp.workout.composable

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffolrdComposable() {
    Scaffold(
        content = {paddingValues -> WorkoutHome(paddingValues) }
    )
}