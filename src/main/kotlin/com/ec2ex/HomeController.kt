package com.ec2ex

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import software.amazon.awssdk.services.s3.S3Client

@RestController
class HomeController(
    private val s3Client: S3Client,
) {
    @GetMapping
    fun main(): String = "Hi"

    @GetMapping("/buckets")
    fun buckets(): List<String> = s3Client.listBuckets().buckets().map { it.name() }
}
