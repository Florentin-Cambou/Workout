package com.wiapp.workout.data

import com.wiapp.workout.R
import com.wiapp.workout.model.ModelExercices

class DataSources {
    fun LoadDataSources(): List<ModelExercices>{
        return listOf<ModelExercices>(
            ModelExercices(R.string.name_exercice_1,R.drawable.girl_fitness_illustration,R.string.description),
            ModelExercices(R.string.name_exercice_2,R.drawable.girl_fitness_illustration,R.string.description),
            ModelExercices(R.string.name_exercice_3,R.drawable.girl_fitness_illustration,R.string.description),
            ModelExercices(R.string.name_exercice_4,R.drawable.girl_fitness_illustration,R.string.description),
            ModelExercices(R.string.name_exercice_5,R.drawable.girl_fitness_illustration,R.string.description),
        )
    }
}