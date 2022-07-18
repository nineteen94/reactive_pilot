package com.skydo_dhawan.reactive_pilot.repository

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.Random
import javax.annotation.processing.Generated

@Table("members")
data class Member (
    var id: String? = null,
    val firstname: String,
    val lastname: String )
