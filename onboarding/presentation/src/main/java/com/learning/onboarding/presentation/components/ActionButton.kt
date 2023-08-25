package com.learning.onboarding.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.learning.core.ui.theme.LocalSpacing

@Composable
fun ActionButton(
    text: String,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    onClick: () -> Unit = {},
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        enabled = isEnabled,
    ) {
        ProvideTextStyle(value = MaterialTheme.typography.labelSmall) {
            Text(
                text = text,
                modifier = Modifier.padding(LocalSpacing.current.spaceSmall)
            )
        }

    }
}