package com.skydo_dhawan.reactive_pilot.repository

import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface MemberRepository : ReactiveCrudRepository<Member, Int> {

}


/*
* Multiple repositories to extend
*
*
* R2dbcRepository
* ReactiveCrudRepository
* ReactiveSortingRepository
*
* etc
* */