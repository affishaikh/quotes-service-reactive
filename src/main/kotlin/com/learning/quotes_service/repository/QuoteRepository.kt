package com.learning.quotes_service.repository

import com.learning.quotes_service.domain.Quote
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

interface QuoteRepository : ReactiveCrudRepository<Quote, Int> {
    fun findByAuthor(author: String): Flux<Quote>
}