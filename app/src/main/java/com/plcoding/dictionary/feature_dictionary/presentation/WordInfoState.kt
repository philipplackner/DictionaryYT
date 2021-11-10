package com.plcoding.dictionary.feature_dictionary.presentation

import com.plcoding.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
