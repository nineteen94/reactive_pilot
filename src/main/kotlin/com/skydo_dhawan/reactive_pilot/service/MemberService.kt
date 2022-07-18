package com.skydo_dhawan.reactive_pilot.service

import com.skydo_dhawan.reactive_pilot.repository.Member
import com.skydo_dhawan.reactive_pilot.repository.MemberRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class MemberService(val memberRepository: MemberRepository) {

    fun getAll(): Flux<Member> {
        return memberRepository.findAll()
    }

    fun createMember(member: Member) : Mono<Member> {
        return memberRepository.save(member)
    }
}