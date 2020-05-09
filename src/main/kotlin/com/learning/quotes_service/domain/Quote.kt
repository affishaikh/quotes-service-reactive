package com.learning.quotes_service.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "Quotes")
data class Quote(@Id @GeneratedValue val id: Int, val quote: String) {}