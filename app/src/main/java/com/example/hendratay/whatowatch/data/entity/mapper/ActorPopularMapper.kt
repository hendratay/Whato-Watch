package com.example.hendratay.whatowatch.data.entity.mapper

import com.example.hendratay.whatowatch.data.entity.ActorPopularEntity
import com.example.hendratay.whatowatch.domain.model.ActorPopular
import javax.inject.Inject

class ActorPopularMapper @Inject constructor(private val actorResultsMapper: ActorResultsMapper): Mapper<ActorPopularEntity, ActorPopular> {

    override fun mapFromEntity(type: ActorPopularEntity): ActorPopular {
        return ActorPopular(type.page, actorResultsMapper.mapFromEntity(type.results), type.totalResults, type.totalPages)
    }

    override fun mapToEntity(type: ActorPopular): ActorPopularEntity {
        return ActorPopularEntity(type.page, actorResultsMapper.mapToEntity(type.results), type.totalResults, type.totalPages)
    }

}
