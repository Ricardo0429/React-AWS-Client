// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AssociateRouteTableResponseBuilderOps(val self: AssociateRouteTableResponse.Builder) extends AnyVal {

  final def associationIdAsScala(value: Option[String]): AssociateRouteTableResponse.Builder = {
    value.fold(self) { v =>
      self.associationId(v)
    }
  }

}

final class AssociateRouteTableResponseOps(val self: AssociateRouteTableResponse) extends AnyVal {

  final def associationIdAsScala: Option[String] = Option(self.associationId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAssociateRouteTableResponseOps {

  implicit def toAssociateRouteTableResponseBuilderOps(
      v: AssociateRouteTableResponse.Builder
  ): AssociateRouteTableResponseBuilderOps = new AssociateRouteTableResponseBuilderOps(v)

  implicit def toAssociateRouteTableResponseOps(v: AssociateRouteTableResponse): AssociateRouteTableResponseOps =
    new AssociateRouteTableResponseOps(v)

}
