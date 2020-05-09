package com.learning.quotes_service.controllers

import com.learning.quotes_service.domain.Quote
import com.learning.quotes_service.repository.QuoteRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class QuotesController(private val quotesRepository: QuoteRepository) {

    @GetMapping("/quotes")
    fun getTodo(): MutableIterable<Quote> {
        return quotesRepository.findAll();
    }
}