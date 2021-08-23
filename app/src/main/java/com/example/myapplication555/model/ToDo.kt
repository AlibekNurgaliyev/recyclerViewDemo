package com.example.myapplication555.model

import android.os.Parcelable
import com.example.myapplication111.enums.Priorities
import kotlinx.android.parcel.Parcelize


@Parcelize
data class ToDo(
    var title: String,
    var description: String,
    var dueDateval: String,
    var priority: Priorities
) : Parcelable
