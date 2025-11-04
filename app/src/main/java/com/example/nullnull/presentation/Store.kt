package com.example.nullnull.presentation

import androidx.annotation.DrawableRes
import com.example.nullnull.R

data class Store(
    val name: String,
    val address: String,
    val phone: String,
    val discountPrice: Int,
    @DrawableRes val imageRes: Int
)

val stores = listOf(
    Store(
        "장충동왕족발보쌈",
        "서울특별시 강남구 1234",
        "010-1234-5678",
        1000,
        R.drawable.image_1
    ),
    Store(
        "귀한족발",
        "서울특별시 강동구 456",
        "010-2345-6789",
        3000,
        R.drawable.image_2
    ),
    Store(
        "제주에서온족발",
        "서울특별시 강북구 789",
        "010-3456-7890",
        2000,
        R.drawable.image_3
    ),
    Store(
        "족발마시장",
        "서울특별시 성동구 123",
        "010-4567-8901",
        2000,
        R.drawable.image_4
    ),
    Store(
        "족마당",
        "서울특별시 종로구 456",
        "010-5678-9012",
        1000,
        R.drawable.image_5
    ),
    Store(
        "가장맛있는족발",
        "서울특별시 서초구 135",
        "010-6789-0123",
        5000,
        R.drawable.image_6
    ),
    Store(
        "김가네족발",
        "서울특별시 마포구 135",
        "010-6789-0123",
        2000,
        R.drawable.image_7
    ),
    Store(
        "이가네 족발",
        "서울특별시 은평구 135",
        "010-6789-0123",
        1000,
        R.drawable.image_8
    )
)
