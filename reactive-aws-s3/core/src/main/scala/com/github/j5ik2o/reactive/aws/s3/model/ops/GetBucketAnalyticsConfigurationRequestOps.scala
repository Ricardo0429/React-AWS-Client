// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAnalyticsConfigurationRequestBuilderOps(val self: GetBucketAnalyticsConfigurationRequest.Builder)
    extends AnyVal {

  final def bucketAsScala(value: Option[String]): GetBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def idAsScala(value: Option[String]): GetBucketAnalyticsConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

}

final class GetBucketAnalyticsConfigurationRequestOps(val self: GetBucketAnalyticsConfigurationRequest) extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def idAsScala: Option[String] = Option(self.id) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAnalyticsConfigurationRequestOps {

  implicit def toGetBucketAnalyticsConfigurationRequestBuilderOps(
      v: GetBucketAnalyticsConfigurationRequest.Builder
  ): GetBucketAnalyticsConfigurationRequestBuilderOps = new GetBucketAnalyticsConfigurationRequestBuilderOps(v)

  implicit def toGetBucketAnalyticsConfigurationRequestOps(
      v: GetBucketAnalyticsConfigurationRequest
  ): GetBucketAnalyticsConfigurationRequestOps = new GetBucketAnalyticsConfigurationRequestOps(v)

}
