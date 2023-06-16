package com.wiapp.workout.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.wiapp.workout.R
import com.wiapp.workout.model.ModelExercices

@Composable
fun WorkoutCard(modelExercices: ModelExercices) {
    Row(
        modifier = Modifier
            .width(400.dp)
            .fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.padding(15.dp),
            elevation = CardDefaults.elevatedCardElevation(25.dp)
        ) {
            Column() {
                Text(
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    text = stringResource(id = modelExercices.exerciceName)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Image(painter = painterResource(id = modelExercices.exerciceImage), contentDescription = "img test" )
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = stringResource(id = modelExercices.excerciceDescription)
                )

            }
        }
    }
}