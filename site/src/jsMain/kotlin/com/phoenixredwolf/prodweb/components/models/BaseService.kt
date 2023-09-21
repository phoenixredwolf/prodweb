package com.phoenixredwolf.prodweb.components.models

import androidx.compose.runtime.Composable

interface BaseService {
    val id: String
    val path: String
    val title: String
    val desc: String
    val imgPath: String
    val imgDesc: String
    val imgCreditPath: String
    val imgCredit: String
    val freepikImg: Boolean
    val beneHeading: String
    val benefits: List<AddInfo>
    val offeringsHead: String
    val offerings: List<AddInfo>
    val cards: List<CardInfo>
    @Composable
    fun menuIcon()
}

data class AddInfo(
    val name: String,
    val desc: String
)

data class CardInfo(
    val icon: @Composable() ()-> Unit,
    val title: String,
    val desc: String
)