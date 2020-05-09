package com.learning.quotes_service.repository

import com.learning.quotes_service.domain.Quote
import org.springframework.data.repository.CrudRepository

interface QuoteRepository : CrudRepository<Quote, Int> {}