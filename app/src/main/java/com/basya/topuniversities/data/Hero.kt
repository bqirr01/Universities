package com.basya.topuniversities.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hero(
    var name: String? = null,
    var address: String? = null,
    var detail: String? = null,
    var accreditation: String? = null,
    var photo: Int? = null,
    var logo: Int? = null,
) : Parcelable