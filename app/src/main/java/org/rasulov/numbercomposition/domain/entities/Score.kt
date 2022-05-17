package org.rasulov.numbercomposition.domain.entities

data class Score(
    val rightAnswers: Int,
    val minRightAnswers: Int,
    val percent: Int,
    val isEnoughAnswers: Boolean,
    val isEnoughPercent: Boolean

)
