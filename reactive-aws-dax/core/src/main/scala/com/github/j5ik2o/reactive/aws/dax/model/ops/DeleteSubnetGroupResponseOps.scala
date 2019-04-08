// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DeleteSubnetGroupResponseBuilderOps(val self: DeleteSubnetGroupResponse.Builder) extends AnyVal {

  final def deletionMessageAsScala(value: Option[String]): DeleteSubnetGroupResponse.Builder = {
    value.fold(self) { v =>
      self.deletionMessage(v)
    }
  } // String

}

final class DeleteSubnetGroupResponseOps(val self: DeleteSubnetGroupResponse) extends AnyVal {

  final def deletionMessageAsScala: Option[String] = Option(self.deletionMessage) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteSubnetGroupResponseOps {

  implicit def toDeleteSubnetGroupResponseBuilderOps(
      v: DeleteSubnetGroupResponse.Builder
  ): DeleteSubnetGroupResponseBuilderOps = new DeleteSubnetGroupResponseBuilderOps(v)

  implicit def toDeleteSubnetGroupResponseOps(v: DeleteSubnetGroupResponse): DeleteSubnetGroupResponseOps =
    new DeleteSubnetGroupResponseOps(v)

}
