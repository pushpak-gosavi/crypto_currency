package com.pushpak.cryptocurrency.domain.model

import com.pushpak.cryptocurrency.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId:String,
    val name:String,
    val description:String,
    val symbol:String,
    val isActive:Boolean,
    val tags:List<String>,
    val team:List<TeamMember>
)
