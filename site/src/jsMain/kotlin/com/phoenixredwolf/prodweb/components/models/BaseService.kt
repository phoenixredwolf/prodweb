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
    @Composable
    fun icon()
}