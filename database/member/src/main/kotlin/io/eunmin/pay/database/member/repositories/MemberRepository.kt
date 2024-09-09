package io.eunmin.pay.database.member.repositories

import io.eunmin.pay.database.member.entities.MemberEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface MemberRepository: CoroutineCrudRepository<MemberEntity, Long>