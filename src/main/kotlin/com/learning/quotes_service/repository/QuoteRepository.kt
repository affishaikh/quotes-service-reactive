package com.learning.quotes_service.repository

import com.learning.quotes_service.domain.Quote
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface QuoteRepository : ReactiveCrudRepository<Quote, Int> {}