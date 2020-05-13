package com.learning.quotes_service.controllers

import com.learning.quotes_service.domain.Quote
import com.learning.quotes_service.repository.QuoteRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
class QuotesController(private val quotesRepository: QuoteRepository) {

    @GetMapping("/quotes")
    fun getQuotes(): Flux<Quote> {
        return quotesRepository.findAll();
    }

    @GetMapping("/quotes/author")
    fun getQuotesByAuthor(@RequestParam name: String): Flux<Quote> {
        return quotesRepository.findByAuthor(name);
    }
}