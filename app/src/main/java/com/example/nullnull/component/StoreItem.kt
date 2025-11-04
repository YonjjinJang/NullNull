package com.example.nullnull.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.nullnull.presentation.Store
import com.example.nullnull.presentation.stores

@Composable
fun StoreItem(store: Store) {
    // TODO 아이템 만들어보기
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun StoreItemPreview() {
    StoreItem(
        store = stores[0]
    )
}
