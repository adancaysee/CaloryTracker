package com.learning.onboarding.presentation.welcome

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learning.core.ui.theme.CalorieTrackerTheme
import com.learning.onboarding.presentation.components.ActionButton
import com.learning.ui.R
import com.learning.core.ui.theme.LocalSpacing

@Composable
fun WelcomeScreen(
    onNextClick: () -> Unit
) {
    val spacing = LocalSpacing.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(spacing.spaceMedium),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = stringResource(id = R.string.welcome_text),
            textAlign = TextAlign.Center,
            letterSpacing = 0.3.sp,
            lineHeight = 50.sp,
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(spacing.spaceMedium))
        ActionButton(text = stringResource(id = R.string.next))
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_NO
)
@Composable
fun WelcomeScreenPreview() {
    CalorieTrackerTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            WelcomeScreen {}
        }
    }

}