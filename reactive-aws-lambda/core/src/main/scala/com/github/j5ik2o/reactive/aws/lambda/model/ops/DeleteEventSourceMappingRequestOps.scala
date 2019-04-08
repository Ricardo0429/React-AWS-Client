// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class DeleteEventSourceMappingRequestBuilderOps(val self: DeleteEventSourceMappingRequest.Builder)
    extends AnyVal {

  final def uuidAsScala(value: Option[String]): DeleteEventSourceMappingRequest.Builder = {
    value.fold(self) { v =>
      self.uuid(v)
    }
  } // String

}

final class DeleteEventSourceMappingRequestOps(val self: DeleteEventSourceMappingRequest) extends AnyVal {

  final def uuidAsScala: Option[String] = Option(self.uuid) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteEventSourceMappingRequestOps {

  implicit def toDeleteEventSourceMappingRequestBuilderOps(
      v: DeleteEventSourceMappingRequest.Builder
  ): DeleteEventSourceMappingRequestBuilderOps = new DeleteEventSourceMappingRequestBuilderOps(v)

  implicit def toDeleteEventSourceMappingRequestOps(
      v: DeleteEventSourceMappingRequest
  ): DeleteEventSourceMappingRequestOps = new DeleteEventSourceMappingRequestOps(v)

}
