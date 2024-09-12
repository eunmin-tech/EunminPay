package io.eunmin.pay.member.database.repository

import io.eunmin.pay.member.database.entity.MemberEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface MemberRepository: CoroutineCrudRepository<MemberEntity, Long>