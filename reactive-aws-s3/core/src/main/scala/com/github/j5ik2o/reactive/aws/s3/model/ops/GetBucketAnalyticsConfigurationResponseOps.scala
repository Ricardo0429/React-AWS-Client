// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAnalyticsConfigurationResponseBuilderOps(val self: GetBucketAnalyticsConfigurationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def analyticsConfigurationAsScala(
      value: Option[AnalyticsConfiguration]
  ): GetBucketAnalyticsConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.analyticsConfiguration(v)
    }
  }

}

final class GetBucketAnalyticsConfigurationResponseOps(val self: GetBucketAnalyticsConfigurationResponse)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def analyticsConfigurationAsScala: Option[AnalyticsConfiguration] = Option(self.analyticsConfiguration)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAnalyticsConfigurationResponseOps {

  implicit def toGetBucketAnalyticsConfigurationResponseBuilderOps(
      v: GetBucketAnalyticsConfigurationResponse.Builder
  ): GetBucketAnalyticsConfigurationResponseBuilderOps = new GetBucketAnalyticsConfigurationResponseBuilderOps(v)

  implicit def toGetBucketAnalyticsConfigurationResponseOps(
      v: GetBucketAnalyticsConfigurationResponse
  ): GetBucketAnalyticsConfigurationResponseOps = new GetBucketAnalyticsConfigurationResponseOps(v)

}
