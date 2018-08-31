package com.example.hendratay.whatowatch.presentation.model

data class TvDetailView(val backdropPath: String?,
                        val createdBy: List<CreatedByView>,
                        val episodeRunTime: List<Int>,
                        val firstAirDate: String,
                        val genres: List<GenresView>,
                        val homepage: String,
                        val id: Int,
                        val inProduction: Boolean,
                        val languages: List<String>,
                        val lastAirDate: String,
                        val lastEpisodeToAir: LastEpisodeToAirView,
                        val name: String,
                        val networks: List<NetworksView>,
                        val numberOfEpisodes: Int,
                        val numberOfSeasons: Int,
                        val originCountry: List<String>,
                        val originLanguage: String,
                        val originName: String,
                        val overview: String,
                        val popularity: Number,
                        val posterPath: String?,
                        val productionCompanies: List<ProductionCompaniesView>,
                        val seasons: List<SeasonsView>,
                        val status: String,
                        val type: String,
                        val voteAverage: Number,
                        val voteCount: Int)