package com.intanayu_18102233.modul6

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
    @Parcelize
    data class MyData(
        var name: String,
        var description: String,
        var photo: String
    ) : Parcelable
