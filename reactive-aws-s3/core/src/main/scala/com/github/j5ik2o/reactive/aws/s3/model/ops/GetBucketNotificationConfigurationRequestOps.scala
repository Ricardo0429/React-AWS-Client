// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketNotificationConfigurationRequestBuilderOps(
    val self: GetBucketNotificationConfigurationRequest.Builder
) extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketNotificationConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketNotificationConfigurationRequestOps(val self: GetBucketNotificationConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketNotificationConfigurationRequestOps {

  implicit def toGetBucketNotificationConfigurationRequestBuilderOps(
      v: GetBucketNotificationConfigurationRequest.Builder
  ): GetBucketNotificationConfigurationRequestBuilderOps = new GetBucketNotificationConfigurationRequestBuilderOps(v)

  implicit def toGetBucketNotificationConfigurationRequestOps(
      v: GetBucketNotificationConfigurationRequest
  ): GetBucketNotificationConfigurationRequestOps = new GetBucketNotificationConfigurationRequestOps(v)

}
