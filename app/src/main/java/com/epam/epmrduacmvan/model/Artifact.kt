package com.epam.epmrduacmvan.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Artifact(val artifactUrl: String, val fileName: String, val fileSize: Int, val id: Int, val link: Boolean): Parcelable