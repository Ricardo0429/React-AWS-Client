// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeStackDriftDetectionStatusRequestBuilderOps(
    val self: DescribeStackDriftDetectionStatusRequest.Builder
) extends AnyVal {

  final def stackDriftDetectionIdAsScala(value: Option[String]): DescribeStackDriftDetectionStatusRequest.Builder = {
    value.fold(self) { v =>
      self.stackDriftDetectionId(v)
    }
  } // String

}

final class DescribeStackDriftDetectionStatusRequestOps(val self: DescribeStackDriftDetectionStatusRequest)
    extends AnyVal {

  final def stackDriftDetectionIdAsScala: Option[String] = Option(self.stackDriftDetectionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeStackDriftDetectionStatusRequestOps {

  implicit def toDescribeStackDriftDetectionStatusRequestBuilderOps(
      v: DescribeStackDriftDetectionStatusRequest.Builder
  ): DescribeStackDriftDetectionStatusRequestBuilderOps = new DescribeStackDriftDetectionStatusRequestBuilderOps(v)

  implicit def toDescribeStackDriftDetectionStatusRequestOps(
      v: DescribeStackDriftDetectionStatusRequest
  ): DescribeStackDriftDetectionStatusRequestOps = new DescribeStackDriftDetectionStatusRequestOps(v)

}
