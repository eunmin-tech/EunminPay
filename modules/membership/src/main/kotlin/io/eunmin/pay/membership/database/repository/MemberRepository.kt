package io.eunmin.pay.membership.database.repository

import io.eunmin.pay.membership.database.entity.MemberEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface MemberRepository: CoroutineCrudRepository<MemberEntity, Long>