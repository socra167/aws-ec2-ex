package com.ec2ex

import software.amazon.awssdk.services.s3.S3Client

class S3ServiceImpl(
    private val s3Client: S3Client,
) : S3Service {
    override fun getBucketNames(): List<String> = s3Client.listBuckets().buckets().map { it.name() }
}
