package com.DianAsri.Crud_Api

import com.google.gson.annotations.SerializedName

data class ResultStaff (
    @field:SerializedName("pesan")
    val pesan: String? = null,
    @field:SerializedName("staff")
    val staff: List<DataItem>? = null,
    @field:SerializedName("status")
    val status: Int? = null
)