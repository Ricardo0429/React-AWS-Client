// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketLocationResponseBuilderOps(val self: GetBucketLocationResponse.Builder) extends AnyVal {

  final def locationConstraintAsScala(value: Option[BucketLocationConstraint]): GetBucketLocationResponse.Builder = {
    value.fold(self) { v =>
      self.locationConstraint(v)
    }
  } // BucketLocationConstraint

}

final class GetBucketLocationResponseOps(val self: GetBucketLocationResponse) extends AnyVal {

  final def locationConstraintAsScala: Option[BucketLocationConstraint] =
    Option(self.locationConstraint) // BucketLocationConstraint

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketLocationResponseOps {

  implicit def toGetBucketLocationResponseBuilderOps(
      v: GetBucketLocationResponse.Builder
  ): GetBucketLocationResponseBuilderOps = new GetBucketLocationResponseBuilderOps(v)

  implicit def toGetBucketLocationResponseOps(v: GetBucketLocationResponse): GetBucketLocationResponseOps =
    new GetBucketLocationResponseOps(v)

}
