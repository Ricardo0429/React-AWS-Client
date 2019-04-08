// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketWebsiteRequestBuilderOps(val self: GetBucketWebsiteRequest.Builder) extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetBucketWebsiteRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketWebsiteRequestOps(val self: GetBucketWebsiteRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketWebsiteRequestOps {

  implicit def toGetBucketWebsiteRequestBuilderOps(
      v: GetBucketWebsiteRequest.Builder
  ): GetBucketWebsiteRequestBuilderOps = new GetBucketWebsiteRequestBuilderOps(v)

  implicit def toGetBucketWebsiteRequestOps(v: GetBucketWebsiteRequest): GetBucketWebsiteRequestOps =
    new GetBucketWebsiteRequestOps(v)

}
