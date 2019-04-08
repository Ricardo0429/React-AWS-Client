// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DeleteParameterGroupResponseBuilderOps(val self: DeleteParameterGroupResponse.Builder) extends AnyVal {

  final def deletionMessageAsScala(value: Option[String]): DeleteParameterGroupResponse.Builder = {
    value.fold(self) { v =>
      self.deletionMessage(v)
    }
  } // String

}

final class DeleteParameterGroupResponseOps(val self: DeleteParameterGroupResponse) extends AnyVal {

  final def deletionMessageAsScala: Option[String] = Option(self.deletionMessage) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteParameterGroupResponseOps {

  implicit def toDeleteParameterGroupResponseBuilderOps(
      v: DeleteParameterGroupResponse.Builder
  ): DeleteParameterGroupResponseBuilderOps = new DeleteParameterGroupResponseBuilderOps(v)

  implicit def toDeleteParameterGroupResponseOps(v: DeleteParameterGroupResponse): DeleteParameterGroupResponseOps =
    new DeleteParameterGroupResponseOps(v)

}
