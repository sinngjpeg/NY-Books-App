package com.example.nybooksapp.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class BookBodyResponse(
    @JsonClass(generateAdapter = true)
    @Json(name = "results")
    val bookResults: List<BookResultsResponse>
)