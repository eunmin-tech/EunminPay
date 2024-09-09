package io.eunmin.pay.domain.base

abstract class Usecase<Params, Response> {
    protected abstract suspend fun execute(params: Params): Response
    suspend operator fun invoke(params: Params): Response = execute(params)
}