package com.example.hendratay.whatowatch.data.repository

import com.example.hendratay.whatowatch.data.entity.mapper.ActorPopularMapper
import com.example.hendratay.whatowatch.data.repository.datasource.ActorDataStoreFactory
import com.example.hendratay.whatowatch.domain.model.ActorPopular
import com.example.hendratay.whatowatch.domain.repository.ActorRepository
import io.reactivex.Observable
import javax.inject.Inject

class ActorDataRepository @Inject constructor(private val factory: ActorDataStoreFactory,
                                              private val actorPopularMapper: ActorPopularMapper):
        ActorRepository {

    override fun getPopularActor(page: Int): Observable<ActorPopular> {
        return factory.create().getPopularActor(page)
                .map { actorPopularMapper.mapFromEntity(it) }
    }

}