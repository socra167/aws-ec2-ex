package com.ec2ex

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController(
    private val s3Service: S3Service,
) {
    @GetMapping
    fun main(): String = "Hi"

    @GetMapping("/buckets")
    fun buckets(): List<String> = s3Service.getBucketNames()
}
