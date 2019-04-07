// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class UpdateParameterGroupResponseBuilderOps(val self: UpdateParameterGroupResponse.Builder) extends AnyVal {

  final def withParameterGroupAsScala(value: Option[ParameterGroup]): UpdateParameterGroupResponse.Builder = {
    value.fold(self) { v =>
      self.parameterGroup(v)
    }
  } // ParameterGroup

}

final class UpdateParameterGroupResponseOps(val self: UpdateParameterGroupResponse) extends AnyVal {

  final def parameterGroupAsScala: Option[ParameterGroup] = Option(self.parameterGroup) // ParameterGroup

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateParameterGroupResponseOps {

  implicit def toUpdateParameterGroupResponseBuilderOps(
      v: UpdateParameterGroupResponse.Builder
  ): UpdateParameterGroupResponseBuilderOps = new UpdateParameterGroupResponseBuilderOps(v)

  implicit def toUpdateParameterGroupResponseOps(v: UpdateParameterGroupResponse): UpdateParameterGroupResponseOps =
    new UpdateParameterGroupResponseOps(v)

}
