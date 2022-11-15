package com.plcoding.stockmarketapp.data.csv

import java.io.InputStream

interface CSVParser<T> {
    suspend fun <T> parse(stream: InputStream): List<T>
}