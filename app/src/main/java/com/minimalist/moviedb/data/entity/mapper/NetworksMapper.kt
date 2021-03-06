package com.minimalist.moviedb.data.entity.mapper

import com.minimalist.moviedb.data.entity.NetworksEntity
import com.minimalist.moviedb.domain.model.Networks
import javax.inject.Inject

class NetworksMapper @Inject constructor(): Mapper<NetworksEntity, Networks> {

    override fun mapFromEntity(type: NetworksEntity): Networks {
        return Networks(type.name, type.id, type.logoPath, type.originCountry)
    }

    override fun mapToEntity(type: Networks): NetworksEntity {
        return NetworksEntity(type.name, type.id, type.logoPath, type.originCountry)
    }

    fun mapFromEntity(list: List<NetworksEntity>): List<Networks> {
        return list.map { mapFromEntity(it) }
    }

    fun mapToEntity(list: List<Networks>): List<NetworksEntity> {
        return list.map { mapToEntity(it) }
    }

}
