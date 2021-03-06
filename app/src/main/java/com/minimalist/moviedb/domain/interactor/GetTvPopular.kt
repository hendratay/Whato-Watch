package com.minimalist.moviedb.domain.interactor

import com.minimalist.moviedb.domain.model.TvPopular
import com.minimalist.moviedb.domain.repository.TvRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetTvPopular @Inject constructor(private val tvRepository: TvRepository): UseCase<TvPopular, GetTvPopular.Params>() {

    override fun buildUseCaseObservable(params: Params?): Observable<TvPopular> {
        return tvRepository.getTvPopular(params!!.page)
    }

    class Params(val page: Int) {
        companion object {
            fun forPage(page: Int): Params {
                return Params(page)
            }
        }
    }

}