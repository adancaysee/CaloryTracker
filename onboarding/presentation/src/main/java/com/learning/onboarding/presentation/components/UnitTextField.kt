package com.learning.onboarding.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.FirstBaseline
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learning.core.ui.theme.CalorieTrackerTheme
import com.learning.core.ui.theme.LocalSpacing
import com.learning.ui.R

@Composable
fun UnitTextField(
    value: String,
    onValueChange: (String) -> Unit,
    unitText: String,
    modifier: Modifier = Modifier,
    textStyle: TextStyle = TextStyle(
        color = MaterialTheme.colorScheme.primaryContainer,
        fontSize = 70.sp
    ),
) {
    val spacing = LocalSpacing.current
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            textStyle = textStyle,
            singleLine = true,
            modifier = Modifier
                .width(IntrinsicSize.Min)
                .alignBy(LastBaseline)
        )
        Spacer(modifier = Modifier.width(spacing.spaceSmall))
        Text(
            text = unitText,
            modifier = Modifier.alignBy(LastBaseline)
        )

    }
}

@Preview
@Composable
fun UnitTextFieldPreview() {
    CalorieTrackerTheme {
        UnitTextField(
            value = "28",
            onValueChange = {},
            unitText = stringResource(id = R.string.years)
        )
    }
}

@Preview
@Composable
fun TextStyle() {
    CalorieTrackerTheme {
        Row(
            modifier = Modifier.width(300.dp)
        ) {
            Text("Bu bir örnektir", modifier = Modifier.alignBy(FirstBaseline).padding(8.dp))
            Text("Bu da bir örnektir", fontSize = 30.sp, modifier = Modifier.alignBy(LastBaseline).padding(8.dp))
        }
    }

}