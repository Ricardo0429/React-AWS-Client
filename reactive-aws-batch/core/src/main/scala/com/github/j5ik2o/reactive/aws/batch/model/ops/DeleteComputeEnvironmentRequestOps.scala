// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DeleteComputeEnvironmentRequestBuilderOps(val self: DeleteComputeEnvironmentRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentAsScala(value: Option[String]): DeleteComputeEnvironmentRequest.Builder = {
    value.fold(self) { v =>
      self.computeEnvironment(v)
    }
  }

}

final class DeleteComputeEnvironmentRequestOps(val self: DeleteComputeEnvironmentRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def computeEnvironmentAsScala: Option[String] = Option(self.computeEnvironment)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteComputeEnvironmentRequestOps {

  implicit def toDeleteComputeEnvironmentRequestBuilderOps(
      v: DeleteComputeEnvironmentRequest.Builder
  ): DeleteComputeEnvironmentRequestBuilderOps = new DeleteComputeEnvironmentRequestBuilderOps(v)

  implicit def toDeleteComputeEnvironmentRequestOps(
      v: DeleteComputeEnvironmentRequest
  ): DeleteComputeEnvironmentRequestOps = new DeleteComputeEnvironmentRequestOps(v)

}
