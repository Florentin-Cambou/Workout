package com.wiapp.workout.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ModelExercices(
    @StringRes val exerciceName: Int,
    @DrawableRes val exerciceImage: Int,
    @StringRes val excerciceDescription: Int
)