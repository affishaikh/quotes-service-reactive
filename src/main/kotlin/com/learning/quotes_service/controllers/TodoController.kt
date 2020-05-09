package com.learning.quotes_service.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController {

    @GetMapping("/")
    fun getTodo(): String {
        return "todo"
    }
}