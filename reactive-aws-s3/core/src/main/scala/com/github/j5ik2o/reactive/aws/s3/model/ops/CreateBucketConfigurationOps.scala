// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CreateBucketConfigurationBuilderOps(val self: CreateBucketConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationConstraintAsScala(value: Option[BucketLocationConstraint]): CreateBucketConfiguration.Builder = {
    value.fold(self) { v =>
      self.locationConstraint(v)
    }
  }

}

final class CreateBucketConfigurationOps(val self: CreateBucketConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def locationConstraintAsScala: Option[BucketLocationConstraint] = Option(self.locationConstraint)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateBucketConfigurationOps {

  implicit def toCreateBucketConfigurationBuilderOps(
      v: CreateBucketConfiguration.Builder
  ): CreateBucketConfigurationBuilderOps = new CreateBucketConfigurationBuilderOps(v)

  implicit def toCreateBucketConfigurationOps(v: CreateBucketConfiguration): CreateBucketConfigurationOps =
    new CreateBucketConfigurationOps(v)

}
