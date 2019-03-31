package com.github.j5ik2o.reactive.aws.s3.model

final case class GetBucketWebsiteRequest(
    bucket: Option[String] = None
) {
  def withBucket(value: Option[String]): GetBucketWebsiteRequest =
    copy(bucket = value)
}
