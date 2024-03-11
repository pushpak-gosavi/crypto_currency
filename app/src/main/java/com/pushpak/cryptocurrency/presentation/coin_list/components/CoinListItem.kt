package com.pushpak.cryptocurrency.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pushpak.cryptocurrency.domain.model.Coin

@Composable
fun CoinListItem(
    coin: Coin,
    //onItemClick: (Coin) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable {
                //onItemClick(coin)
            },
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "${coin.rank} ${coin.name} (${coin.symbol}",
            style = MaterialTheme.typography.bodyMedium,
            overflow = TextOverflow.Ellipsis
        )
        Text(
            text = if(coin.isActive) "active" else "inactive",
            textAlign = TextAlign.End,
            fontStyle = FontStyle.Italic,
            style = MaterialTheme.typography.bodySmall,
            color = if (coin.isActive) Color.Green else Color.Red,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CoinListItemPreview() {
    val demoCoin = Coin("1", true, "Bit Coin", 1, "BTC")
    CoinListItem(coin = demoCoin)
}