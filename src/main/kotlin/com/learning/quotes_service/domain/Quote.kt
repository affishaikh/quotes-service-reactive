package com.learning.quotes_service.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "quotes")
data class Quote(@Id val id: Int, val quote: String, val author: String) {}