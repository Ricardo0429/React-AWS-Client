// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectLockConfigurationResponseBuilderOps(val self: PutObjectLockConfigurationResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala(value: Option[RequestCharged]): PutObjectLockConfigurationResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  }

}

final class PutObjectLockConfigurationResponseOps(val self: PutObjectLockConfigurationResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectLockConfigurationResponseOps {

  implicit def toPutObjectLockConfigurationResponseBuilderOps(
      v: PutObjectLockConfigurationResponse.Builder
  ): PutObjectLockConfigurationResponseBuilderOps = new PutObjectLockConfigurationResponseBuilderOps(v)

  implicit def toPutObjectLockConfigurationResponseOps(
      v: PutObjectLockConfigurationResponse
  ): PutObjectLockConfigurationResponseOps = new PutObjectLockConfigurationResponseOps(v)

}
