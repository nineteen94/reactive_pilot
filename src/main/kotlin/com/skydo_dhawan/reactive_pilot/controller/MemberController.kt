package com.skydo_dhawan.reactive_pilot.controller

import com.skydo_dhawan.reactive_pilot.repository.Member
import com.skydo_dhawan.reactive_pilot.repository.MemberRepository
import com.skydo_dhawan.reactive_pilot.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController()
@RequestMapping("/api")
class MemberController (val memberService: MemberService) {

    @GetMapping("/get-all")
    fun getAll() : Flux<Member> {
        return memberService.getAll()
    }

    @PostMapping("/create")
    fun createMember(@RequestBody member: Member) : Mono<Member> {
        return memberService.createMember(member)
    }

}

/**
 * Get All
 * Get By Id
 * Add New Member
 *
 */